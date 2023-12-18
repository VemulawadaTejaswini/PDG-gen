import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        double sum = 0.0;
        for (int i= 0; i < n; i++) {
            double a = sc.nextDouble();
            String b = sc.next();
            if (b.equals("BTC")) {
                a *= 380000.0;
            }
            sum += a;
        }
        System.out.println(sum);
    }
}