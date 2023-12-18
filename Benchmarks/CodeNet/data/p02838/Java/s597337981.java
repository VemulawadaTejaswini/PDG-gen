import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        for (int i = 0 ; i < n ; i++) {
            a[i] = sc.nextLong();
        }
        int[] b = new int[62];

        for (int i = 0 ; i < 62 ; i++) {
            int c = 0;
            for (int j = 0 ; j < n ; j++) {
                if (a[j] % 2 == 1) {
                    c++;
                }
                a[j] /= 2;
            }
            b[i] = c;
        }

        long ans = 0;
        long mod = 1000000007;
        for (int i = 0 ; i < 62 ; i++) {
            long comb =(long) Math.pow(2, i) % mod;
            comb *= b[i] % mod;
            comb *= (n - b[i]) % mod;
            ans += comb;
            ans %= mod;
        }

        System.out.println(ans % mod);
    }

}