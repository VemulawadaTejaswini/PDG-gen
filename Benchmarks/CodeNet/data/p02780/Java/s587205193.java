import java.math.BigDecimal;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        Queue<Integer> ps = new ArrayDeque<>(k);
        ArrayDeque<Integer> cur = new ArrayDeque<>(k);
        long max = 0L;
        long cMax = 0L;
        for (int i = 0; i < n; i++) {
            int p = sc.nextInt();

            if (cur.size() == k) {
                int t = cur.poll();
                cMax -= t;
            }
            cur.add(p);
            cMax += p;

            if (cMax > max) {
                ps = cur.clone();
                max = cMax;
            }
        }

        BigDecimal sum = BigDecimal.ZERO;
        int size = ps.size();
        for (int i = 0; i < size; i++) {
            int t = ps.poll();
            BigDecimal jt = new BigDecimal(String.valueOf(t));
            for (double j = 1; j <= t; j++) {
                BigDecimal jb = new BigDecimal(String.valueOf(j));

                BigDecimal ex = jb.divide(jt, 6, BigDecimal.ROUND_HALF_UP);
                sum = sum.add(ex);
            }
        }

        System.out.println(sum);
    }
}