import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        double r = sc.nextDouble();
         
        double s = Math.PI * r * r;
        double l = Math.PI * 2 * r;
 
        System.out.println(String.format("%.5f", s) + " " + String.format("%.5f", l));
    }
}