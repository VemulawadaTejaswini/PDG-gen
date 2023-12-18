import java.util.Scanner;

/**
     * Created by dizzyvn on 6/24/17.
     */
    public class Main {
        final static int mod = (int) Math.pow(10, 9) + 7;

        public static int factorial(int n) {
            int res = 1;
            for (int i = 1; i <= n; i++) {
                res *= i;
                res %= mod;
            }
            return res;
        }

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();
            int m = sc.nextInt();

            if (Math.abs(n-m) > 1) {
                System.out.println(0);
            } else {
                if (n == m)
                    System.out.println((factorial(n) * factorial(m) * 2) % mod);
                else
                    System.out.println((factorial(n) * factorial(m)) % mod);
            }
        }
    }
