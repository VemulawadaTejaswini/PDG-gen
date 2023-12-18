import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            int n = Integer.parseInt(in.readLine());
            String[] an = in.readLine().split(" ");
            int[] list = new int[n];
            for (int i = 0; i < an.length; ++i) {
                list[i] = Integer.parseInt(an[i]);
            }

            RMQ rmq = new RMQ(list);

            long sum = 0;
            for (int l = 0; l < n; ++l) {
                long sum1 = 0;
                for (int r = l; r < n; ++r) {
                    sum1 += rmq.query(l, r);
                }
                sum += sum1;
            }
            System.out.println(sum);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static class RMQ {
        int[] ary;
        int len;
        public RMQ(int[] a) {
            int tmp = Integer.highestOneBit(a.length);
            len = tmp;
            if (tmp != a.length) {
                len <<= 1;
            }
            ary = new int[len * 2 - 1];
            Arrays.fill(ary, Integer.MAX_VALUE);
            System.arraycopy(a, 0, ary, len - 1, Math.min(len, a.length));
            int n = len - 1;
            do {
                for (int i = n; i < 2 * n; i += 2) {
                    ary[(i - 1) / 2] = Math.min(ary[i], ary[i + 1]);
                }
                n = (n - 1) / 2;
            } while (n > 0);
        }
        public int query(int l, int r) {
            return query(l, r + 1, 0, 0, len);
        }
        private int query(int a, int b, int k, int l, int r) {
            if (r <= a || b <= l) {
                return Integer.MAX_VALUE;
            }
            if (a <= l && r <= b) {
                return ary[k];
            } else {
                int v1 = query(a, b, k * 2 + 1, l, (l + r) / 2);
                int v2 = query(a, b, k * 2 + 2, (l + r) / 2, r);
                return Math.min(v1, v2);
            }
        }
    }
}