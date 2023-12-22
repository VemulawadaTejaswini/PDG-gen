import java.util.Scanner;

public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        double S = Math.PI*r*r;
        double l = Math.PI*2*r;
        System.out.printf("%f %f",S,l);
    }
}
