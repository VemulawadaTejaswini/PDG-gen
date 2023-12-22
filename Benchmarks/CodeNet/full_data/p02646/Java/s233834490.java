import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double A = sc.nextDouble();
        double V = sc.nextDouble();
        double B = sc.nextDouble();
        double W = sc.nextDouble();
        double T = sc.nextDouble();

        for (int i = 1; i <= T; i++) {
            if (A == B) {
                System.out.println("YES");
                return;
            }
            if (A < B) {
                A = A + V;
                B = B + W;
            } else if (A > B) {
                A = A - V;
                B = B - W;
            }
        }
        System.out.println("NO");
    }
}