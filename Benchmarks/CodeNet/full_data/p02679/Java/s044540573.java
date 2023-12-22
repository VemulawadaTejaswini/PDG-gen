import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 入力
        int n = sc.nextInt();
        long[] a = new long[n];
        long[] b = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
            b[i] = sc.nextLong();
        }

        long ans = 0;
        int all = 1<<n;
        // 00...01（n桁） から 11...11（n桁） までループ(bit全探索)
        for (int mask = 1; mask < all; mask++) {
            if (check(mask, n, a, b)) {
                ans++;
            }
        }

        // 出力
        System.out.println(ans % 1000000007);
    }

    public static boolean check(int mask, int n, long[] a, long[] b) {
        for (int i = 0; i < n; i++) {
            // 各ビットでループ
            if (((mask>>i) & 0x1) == 1) {
                for (int j = i+1; j < n; j++) {
                    if (((mask>>j) & 0x1) == 1) {
                        long gcd = gcd(gcd(gcd(a[i], a[j]), b[i]), b[j]);
                        if ((a[i] / gcd) * (a[j] / gcd) == -(b[i] / gcd) * (b[j] / gcd)) {
                            // 仲が悪い
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    public static long gcd(long num1, long num2) {
        if(num2==0) return num1;
        else return gcd(num2,num1%num2);
    }
}
