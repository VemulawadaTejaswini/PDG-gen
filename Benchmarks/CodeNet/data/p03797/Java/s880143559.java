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

        if (n > 2*m) {
            System.out.println(m/2);
        } else {
            System.out.println(n + (m - 2*n)/4);
        }

    }
}
