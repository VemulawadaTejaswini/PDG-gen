
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    static final long INF = (long) 1e18;
    static ArrayList<Integer> pos, neg;
    static int zeros;

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner();
        PrintWriter out = new PrintWriter(System.out);
        int n = sc.nextInt();
        long k = sc.nextLong();
        pos = new ArrayList<>();
        neg = new ArrayList<>();
        while (n-- > 0) {
            int cur = sc.nextInt();
            if (cur < 0) neg.add(-cur);
            else if (cur == 0) zeros++;
            else pos.add(cur);
        }
        Collections.sort(pos);
        Collections.sort(neg);
        long lo = -INF, hi = INF;
        long ans = INF;
        while (lo <= hi) {
            long mid = (lo + hi) / 2;
            long less = get(mid);
            if (less >= k) {
                ans = Math.min(ans, mid);
                hi = mid - 1;
            } else lo = mid + 1;
        }
        out.println(ans);
        out.flush();
        out.close();
    }

    static long get(long val) {
        if (val >= 0)
            return 1l * pos.size() * neg.size() + (1l * zeros * (zeros - 1) / 2) + getLessThan(pos, val) + getLessThan(neg, val) + 1l * zeros * (pos.size() + neg.size());
        long ans = 0;
        for (int i = neg.size() - 1; i >= 0; i--) {
            long cur = -neg.get(i);
            int j = pos.size();
            int lo = 0, hi = pos.size() - 1;
            while (lo <= hi) {
                int mid = lo + hi >> 1;
                if (cur * pos.get(mid) <= val) {
                    j = mid;
                    hi = mid - 1;
                } else lo = mid + 1;
            }
            ans += pos.size() - j;
        }
        return ans;
    }

    static long getLessThan(ArrayList<Integer> vals, long val) {
        long ans = 0;
        for (int i = 0; i < vals.size(); i++) {
            long cur = vals.get(i);
            int j = i;
            int lo = i + 1, hi = vals.size() - 1;
            while (lo <= hi) {
                int mid = lo + hi >> 1;
                if (cur * vals.get(mid) <= val) {
                    j = mid;
                    lo = mid + 1;
                } else hi = mid - 1;
            }
            ans += j - i;
        }
        return ans;
    }

    static class Scanner {
        BufferedReader br;
        StringTokenizer st;

        Scanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() throws IOException {
            while (st == null || !st.hasMoreTokens())
                st = new StringTokenizer(br.readLine());
            return st.nextToken();
        }

        int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        int nextChar() throws IOException {
            return next().charAt(0);
        }

        int[] nextIntArray(int n) throws IOException {
            int[] ans = new int[n];
            for (int i = 0; i < n; i++)
                ans[i] = nextInt();
            return ans;
        }

        long nextLong() throws IOException {
            return Long.parseLong(next());
        }

    }
}
