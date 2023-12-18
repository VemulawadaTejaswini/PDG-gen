import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        for (int i = 0 ; i < n ; i++) {
            a[i] = sc.nextLong();
        }
        int[] b = new int[60];

        for (int i = 0 ; i < 60 ; i++) {
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
        long mod = (long) (1e9 + 7);
        for (int i = 0 ; i < 60 ; i++) {
            long comb = (long) Math.pow(2, i) % mod;
            comb *= b[i] % mod;
            comb *= (n - b[i]) % mod;
            ans += comb % mod;;
        }
        System.out.println(ans % mod);
    }

}