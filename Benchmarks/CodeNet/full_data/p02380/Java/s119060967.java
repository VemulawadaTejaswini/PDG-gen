import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double C = sc.nextDouble();

        double theta = Math.PI*C/180;
        double S = 0.5 * a * b * Math.sin(theta);
        double L = a + b + Math.sqrt(a*a + b*b - 2*a*b*Math.cos(theta));
        double h = 2 * S / a;
        System.out.println(S);
        System.out.println(L);
        System.out.println(h);
    }
}
