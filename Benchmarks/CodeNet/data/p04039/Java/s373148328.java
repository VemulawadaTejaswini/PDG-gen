import java.math.*;
import java.util.*;

public class Main {
    static boolean isGood(int n, int l[]) {
        int tmp = String.valueOf(n).length();
        int div = (int) Math.pow(10, tmp - 1);
        boolean tmp2 = true;

        r: for (int i = 0; i < tmp; i++) {
            int t = n / div;
            for (int ln : l) {
                if (ln == t) {
                    tmp2 = false;
                    break r;
                }
            }
            n -= t * div;
            div /= 10;
            
        }
        return tmp2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int d[] = new int[k];
        for (int i = 0; i < k; i++)
            d[i] = sc.nextInt();
        int ans = n;
        if (isGood(ans, d)) {
        } else {
            while (!isGood(ans, d)) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}
