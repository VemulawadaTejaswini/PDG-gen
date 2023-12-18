import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();

        System.out.println(pow(k - 1, n - 1) * k);
    }

    static long pow(long x, long n) {
        if (x == 0) return 0;
        if (n == 0) return 1;
        long total = 1;
        while (n > 0) {
            if ((n & 1) == 1) {
                total *= x;
            }
            x = x * x;
            n = n >> 1;
        }
        return total;
    }
}
