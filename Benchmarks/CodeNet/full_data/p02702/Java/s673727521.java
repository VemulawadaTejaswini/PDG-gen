import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        sc.close();

        char[] c = S.toCharArray();

        int[] rem = new int[2019];
        rem[0] = 1;
        int ans = 0;
        long num = 0;
        for (int i = S.length() - 1; i >= 0; i--) {
            num += modpow(10, S.length() - i - 1, 2019) * (c[i] - '0') % 2019;
            int r = (int)num % 2019;
            ans += rem[r];
            rem[r]++;
        }
        System.out.println(ans);
    }

    private static long modpow(long a, long n, long mod) {
        long res = 1;
        while (n > 0) {
            if (n % 2 == 1)
                res = (res * a) % mod;
            a = (a * a) % mod;
            n >>= 1;
        }
        return res % mod;
    }
}
