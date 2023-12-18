import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        int h = sc.nextInt();
        int s = sc.nextInt();
        int d = sc.nextInt();
        int n = sc.nextInt();
        int m;
        if (q * 2 < h) {
            m = q * 4;
        } else {
            m = h * 2;
        }
        if (m > s) {
            m = s;
        }
        if (d > m * 2) {
            d = m * 2;
        }
        BigDecimal ans = new BigDecimal("0");
        BigDecimal two = new BigDecimal("2");
        BigDecimal bn = BigDecimal.valueOf(n);
        BigDecimal hn = BigDecimal.valueOf(n / 2);
        BigDecimal bm = BigDecimal.valueOf(m);
        BigDecimal bd = BigDecimal.valueOf(d);
        if (n % 2 == 0) {
            ans = hn.multiply(bd);
        } else {
            ans = hn.multiply(bd);
            ans = ans.add(bm);
        }
        System.out.println(ans);
    }
}
