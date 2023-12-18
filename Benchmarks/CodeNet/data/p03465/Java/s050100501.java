
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author I Love Eslam
 */
public class JavaApplication21 {

    /**
     * @param args the command line arguments
     */
    public static boolean ch(int m) {
        int st = m;
        int en = m - 1;
        BigInteger rst = BigInteger.valueOf(0);
        BigInteger ren = BigInteger.valueOf(1);
        while (true) {
            if (rst.compareTo(ren) <= 0 && st >= 0) {
                rst = rst.add(dp[st--]);
            } else if (en < dp.length) {
                ren = ren.add(dp[en++]);
            } else {
                break;
            }
        }
        return rst.compareTo(ren) <=0;

    }

    static BigInteger dp[];
    static int x[];
    static int add[];

    public static void main(String[] args) {
        TreeSet<Integer> st = new TreeSet<>();
        dp = new BigInteger[2002 * 2002];
        add = new int[2002 * 2002];
        for (int i = 0; i < dp.length; i++) {
            dp[i] = BigInteger.valueOf(0);
        }
        int n, k = 0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        x = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
        }
        Arrays.sort(x);
        dp[0] = BigInteger.valueOf(1);
        st.add(0);
        Iterator it;
        int t;
        for (int i = 0; i < n; i++) {
            it = st.iterator();
            while (it.hasNext()) {
                t = (Integer) it.next();
                t *= -1;
                if (dp[t + x[i]].equals(BigInteger.valueOf(0))) {
                    add[k++] = (-(t + x[i]));
                }
                dp[t + x[i]] = dp[t + x[i]].add(dp[t]);
            }
            for (int j = 0; j < k; j++) {
                st.add(add[j]);
            }
        }
        int l = 1, r = dp.length-1;
        int res = 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (ch(m)) {
                res = m;
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        while(dp[res].equals(BigInteger.valueOf(0)))res--;
        System.out.println("" + res);
    }

}
