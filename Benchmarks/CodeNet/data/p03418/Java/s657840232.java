import java.util.Scanner;

import static java.lang.Math.max;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        if (k == 0) {
            System.out.println(n * n);
            return;
        }

        long count = 0;
        for (int b = 2; b <= n; b++) {
            count += (n / b) * max(b - k, 0) + max(n % b - k + 1, 0);
        }
        System.out.println(count);
    }
}

