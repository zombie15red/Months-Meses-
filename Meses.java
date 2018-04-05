/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meses;
import java.util.Scanner;

/**
 *
 * @author jhond
 */
public class Meses {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner in = new Scanner(System.in);
        
        int mes;
        System.out.println("Introduzca el numero de mes: ");
        mes = in.nextInt();
        
        switch (mes) {
            case 1:
                System.out.print("Enero");
                break;
            case 2:
                System.out.println("Febrero");
                break;
            case 3:
                System.out.print("Marzo");
                break;
            case 4:
                System.out.println("Abril");
                break;
            case 5:
                System.out.print("Mayo");
                break;
            case 6:
                System.out.println("Junio");
                break;
            case 7:
                System.out.print("Julio");
                break;
            case 8:
                System.out.print("Agosto");
                break;
            case 9:
                System.out.println("Septiembre");
                break;
            case 10:
                System.out.print("octubre");
                break;
            case 11:
                System.out.println("noviembre");
                break;
            case 12:
                System.out.print("Diciembre");
                break;
            default:
                System.out.println("Numero de mes incorrecto");
                break;
        }
        if ((mes == 1) || (mes == 2) || (mes == 3)){
            System.out.println("\n Primer trimestre: ");
        }else if ((mes == 4) || (mes == 5) || (mes == 6)){
            System.out.println("\n Segundo trimestre: ");
        }else if ((mes == 7) || (mes == 8) || (mes == 9)){
            System.out.println("\n Tercer trimestre: ");
        }else if ((mes == 10) || (mes == 11) || (mes == 12)){
            System.out.println("\n Cuarto trimestre: ");
        }
        //subirlo por trimestre o organizarlos por trimestre 
        
        String semestre = "";
        
        System.out.println("El semestre es el: "+semestre);
        semestre = (mes >= 1 && mes <=6)? "Primero ": "Segundo";
        
        if (mes>=1 && mes <=6 ){
            semestre = "Primer";
        }else if ((mes >= 7) && (mes <= 12)){
            System.out.println("Segundo");
        }else {
            semestre = "el semestre es incorrecto ";
        }
        
        if ((mes == 0) || (mes >12)|| (mes<0)){
            System.out.println("Trimestre incorrecto");
        }
    }
    
    
}
