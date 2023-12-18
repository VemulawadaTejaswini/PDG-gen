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

        double sum = 0.0;
        int size = ps.size();
        for (int i = 0; i < size; i++) {
            int t = ps.poll();
            double jt = t;
            for (double j = 1; j <= t; j++) {
                double jb = j;

                double ex = jb / jt;
                sum = sum + ex;
            }
        }

        System.out.println(sum);
    }
}