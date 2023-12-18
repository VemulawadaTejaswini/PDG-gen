import java.io.*;
import java.util.*;

public class Main {
    static long ret = 0;
    public static long[] count(int[] a, int l, int r, boolean isLeft) {
        if (r == l + 1) {
            if (a[l] >= 0) ret++;
            return new long[]{a[l]};
        }
        int mid = (r + l) >> 1;
        long[] left = count(a, l, mid, true);
        long[] right = count(a, mid, r, false);
        for (long v: left) {
            int lo = 0, hi = right.length;
            while (lo < hi) {
                int m = (lo + hi) / 2;
                if (right[m] + v >= 0) {
                    hi = m;
                } else {
                    lo = m + 1;
                }
            }
            ret += right.length - lo;
        }
        long[] ret = new long[r - l];
        long prev = 0;
        if (isLeft) {
            for (int i = 0; i < r - l; i++) {
                ret[i] = prev + a[r - 1 - i];
                prev = ret[i];
            }
        } else {
            for (int i = 0; i < r - l; i++) {
                ret[i] = prev + a[l + i];
                prev = ret[i];
            }
        }
        Arrays.sort(ret);
        return ret;
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int k = sc.nextInt();
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt() - k;
        }
        count(a, 0, n, true);
        System.out.println(ret);
    }

    public static class Scanner {
        StringTokenizer st;
        BufferedReader br;
        public Scanner(InputStream s) {
            br = new BufferedReader(new InputStreamReader(s));
        }
        public String next() throws IOException {
            while (st == null || !st.hasMoreTokens()) {
                st = new StringTokenizer(br.readLine());
            }
            return st.nextToken();
        }
        public int nextInt() throws IOException{
            return Integer.parseInt(next());
        }
    }
}