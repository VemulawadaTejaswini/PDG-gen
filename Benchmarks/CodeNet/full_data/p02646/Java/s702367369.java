import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double A = sc.nextDouble();
        double V = sc.nextDouble();
        double B = sc.nextDouble();
        double W = sc.nextDouble();
        double T = sc.nextDouble();

        if ((A + V * T) >= (B + W * T)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}