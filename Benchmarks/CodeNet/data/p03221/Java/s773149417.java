import java.io.*;
import java.util.*;

/**
 * Copyright © 2018 Chris. All rights reserved.
 *
 * @author Chris
 * 2018/7/5 22:51
 */
public class Main {

    final static int MOD = 1000000007;
    static Scanner sc;

    private static int comb(int n, int m) {
        return 1;
    }

    static void getDiv(Map<Integer, Integer> map, int n) {
        int sqrt = (int) Math.sqrt(n);
        for (int i = sqrt; i >= 2; i--) {
            if (n % i == 0) {
                getDiv(map, i);
                getDiv(map, n / i);
                return;
            }
        }
        map.put(n, map.getOrDefault(n, 0) + 1);
    }

    @SuppressWarnings("unchecked")
    private static void solve() {
        BufferedReader br;
        StreamTokenizer st;
        PrintWriter pw;
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StreamTokenizer(br);
        pw = new PrintWriter(new OutputStreamWriter(System.out));
        int n, m = 0;
        try {
            st.nextToken();
            n = (int) st.nval;
            st.nextToken();
            m = (int) st.nval;
        } catch (IOException e) {
            e.printStackTrace();
        }
        int a[][] = new int[m][2];
        Map<Integer, Map<Integer, Integer>> ans = new HashMap<>();
        for (int i = 0; i < m; i++) {
            try {
                st.nextToken();
                a[i][0] = (int) st.nval;
                st.nextToken();
                a[i][1] = (int) st.nval;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        Integer order[] = new Integer[m];
        for (int i = 0; i < m; i++) {
            order[i] = i;
        }
        Arrays.sort(order, (o1, o2) -> {
            if (a[o1][0] == a[o2][0]) {
                return a[o1][1] - a[o2][1];
            }
            return a[o1][0] - a[o2][0];
        });
        int cnt = 1;
        ans.put(a[order[0]][0], new HashMap<>());
        ans.get(a[order[0]][0]).put(order[0], cnt++);
        int idx = a[order[0]][0];
        for (int i = 1; i < m; i++) {
            int pre = order[i - 1];
            int cur = order[i];
            if (a[cur][0] != a[pre][0]) {
                cnt = 1;
                idx = a[cur][0];
                ans.put(idx, new HashMap<>());
            }
            ans.get(idx).put(cur, cnt++);
        }
        for (int i = 0; i < m; i++) {
            int p = a[i][0];
            int x = ans.get(p).get(i);
            pw.format("%06d%06d\n", p, x);
        }

        pw.flush();
        pw.close();
    }

    static long gcd(long a, long b) {
        if (a < b) {
            a ^= b;
            b ^= a;
            a ^= b;
        }
        while (b != 0) {
            long tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }

    public static void main(String args[]) {
        sc = new Scanner(System.in);
        solve();
    }

    private static int nextInt() {
        return sc.nextInt();
    }

    private static long nextLong() {
        return sc.nextLong();
    }

    private static String next() {
        return sc.next();
    }

    private static double nextDouble() {
        return sc.nextDouble();
    }
}