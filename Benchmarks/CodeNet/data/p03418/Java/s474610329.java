import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        long k = sc.nextInt();
        long count = 0;

        if (k == 0)
            count = n * n;
        else {
            for (long b = k + 1; b <= n; b++) {
                count += (n / b) * (b - k);
                count += Math.max((n % b) - k + 1, 0);
            }
        }
        System.out.println(count);
    }
}
