import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;
        while (true) {
            n = scanner.nextInt();
            if (n == 0) break;

            int sum = 0, sum2 = 0;
            for (int i = 0; i < n; ++i) {
                int a = scanner.nextInt();
                sum += a;
                sum2 += a * a;
            }

            System.out.println(Math.sqrt(sum2 / (double)n - Math.pow((sum / (double)n), 2)));
        }
    }
}

