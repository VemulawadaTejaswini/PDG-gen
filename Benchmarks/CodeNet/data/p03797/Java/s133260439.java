import java.util.Scanner;

public class Main {
    static long n;
    static long m;
    static int mod = 1000000007;
    static int[] dp;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextLong();
        m = sc.nextLong();

        if (m < 2) {
            System.out.println(0);
        } else if (n > m && n <= 2*m) {
            System.out.println(n + Math.max(m - 2*n, 0)/4);
        } else {
            System.out.println(m/2);
        }
    }
}
