
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        scan.close();

        int mod = 2019;
        int n = s.length();
        String[] sArray = s.split("");
        int[] a = new int[n + 1];

        long curVal = 0;
        for (int i = 1; i <= n; i++) {
            curVal += Integer.parseInt(sArray[n - i]) * modPow(10, i, mod);
            curVal %= mod;
            a[i] = (int)curVal;
        }

        int[] amari = new int[2019];
        for (int i = 0; i <= n; i++) {
            amari[a[i]]++;
        }

        int ans = 0;
        for (int i = 0; i < 2019; i++) {
            if (amari[i] >= 2) {
                ans += amari[i] * (amari[i] - 1) / 2;
            }
        }

        System.out.println(ans);
    }

    private static long modPow(long a, long b, int mod) {
        if (b == 1) {
            return a;
        }

        if (b % 2 == 0) {
            return (long)Math.pow(modPow(a, b / 2, mod), 2) % mod;
        } else {
            return (long)Math.pow(modPow(a, b / 2, mod), 2) * a % mod;
        }
    }
}
