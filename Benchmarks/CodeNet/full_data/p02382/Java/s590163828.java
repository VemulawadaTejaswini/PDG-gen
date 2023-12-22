import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];

        for (int i = 0; i < n; i++) {
            x[i] = scan.nextInt();
        }
        for (int i = 0; i < n; i++) {
            y[i] = scan.nextInt();
        }
        for (int p = 1; p <= 3; p++) {
            double D = 0.0;
            for (int i = 0; i < n; i++) {
                D += Math.pow(Math.abs(x[i] - y[i]), p);
            }
            System.out.println(Math.pow(D, 1.0 / p));
        }
        double infinity = 0.0;
        for (int i = 0; i < n; i++) {
            infinity = Math.max(infinity, Math.abs(x[i] - y[i]));
        }
        System.out.println(infinity);
    }
}