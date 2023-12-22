import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int C = sc.nextInt();
        double S, L, h;
        S = a * b * Math.sin(Math.toRadians(C)) / 2;
        L = a + b + Math.sqrt(a*a + b*b - 2*a*b*Math.cos(Math.toRadians(C)));
        h = 2 * S / a;
        System.out.println(S);
        System.out.println(L);
        System.out.println(h);
    }
}
