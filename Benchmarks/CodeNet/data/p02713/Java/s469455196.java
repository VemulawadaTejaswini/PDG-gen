import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double sum = 0;
        for (int i = 1; i <= n; ++i) {
            for (int j = 1; j <= n; ++j) {
                for (int k = 1; k <= n; ++k) {
                    sum += gcd(i, gcd(j, k));
                }
            }
        }
        DecimalFormat ft = new DecimalFormat("####");
        System.out.print(ft.format(sum));
    }

    static int gcd (int a, int b)
    {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }
}
