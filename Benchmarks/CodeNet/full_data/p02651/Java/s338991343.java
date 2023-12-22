import java.math.BigDecimal;
import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);

    int MOD = 998244353;

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {

        int t = sc.nextInt();

        for (int i=0; i<t; i++) {
            int n = sc.nextInt();
            long[] xor = new long[n];
            for (int j=0; j<n; j++) xor[j] = sc.nextLong();
            long[][] dp = new long[n+1][2];

            char[] c = sc.next().toCharArray();

            long x = 0;
            for (int j=1; j<=n; j++) {
                x ^= xor[j-1];
            }

            int cnt = 0;
            for (int j=0; j<c.length; j++) {
                if (c[j]=='1') cnt++;
            }

//            System.out.println(x);
//            System.out.println(cnt);

            if (x==0) {
                System.out.println(0);
            } else {
                if ((x^cnt)==0) {
                    System.out.println(0);
                } else {
                    if (x>cnt) System.out.println(1);
                    else System.out.println(0);
                }
            }
        }


    }
}
