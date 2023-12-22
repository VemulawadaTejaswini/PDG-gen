import java.util.Scanner;

public class Main{
    public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    double r = (double)scan.nextFloat();
    double pi = Math.PI;

    double equ = r * r * pi; 
    double loc = r * 2 * pi;
         
    String eAnswer = String.format("%.6f", equ);
    String lAnswer = String.format("%.6f", loc);
    System.out.println(eAnswer + " " + lAnswer);

    }
}