
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double arg = scan.nextDouble();

        double rad = Math.toRadians(arg);
        double S = b * a * Math.sin(rad)/2;
        double c_2 = Math.pow(b,2) + Math.pow(a,2) - a * b * Math.cos(rad);
        double c = Math.sqrt(c_2);
        double h = b * Math.sin(rad);

        System.out.println(S);
        System.out.println(a + b + c);
        System.out.println(h);



    }
}

