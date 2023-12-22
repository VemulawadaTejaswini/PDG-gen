import java.util.Scanner;
import java.lang.Math;

public class Main{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int C = input.nextInt();
        double degree = Math.PI * (double)(C / 180.0);
        double L = a + b + (Math.sqrt(a * a + b * b - 2 * a * b * Math.cos(degree)));
        double S = 0.5 * a * b * Math.sin(degree);
        double h = b * Math.sin(degree);
        System.out.println(S);
        System.out.println(L);
        System.out.println(h);
    }
}
