import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
        int n = sc.nextInt();
        long [] a = new long[3 * n];
        for (int i = 0; i < 3 * n; i++) a[i] = sc.nextLong();
        long [] p = new long[3 * n];
        long [] m = new long[3 * n];
        PriorityQueue<Long> pq = new PriorityQueue<>();
        long cur = 0;
        for (int i = 0; i < 3 * n; i++) {
            cur += a[i];
            pq.add(a[i]);
            if (pq.size() > n) {
                cur -= pq.poll();
            }
            if (pq.size() >= n) p[i] = cur;
        }
        pq = new PriorityQueue<>(Comparator.reverseOrder());
        cur = 0;
        for (int i = 3 * n - 1; i >= 0; i--) {
            cur += a[i];
            pq.add(a[i]);
            if (pq.size() > n) {
                cur -= pq.poll();
            }
            if (pq.size() >= n) m[i] = cur;
        }
        long res = Long.MIN_VALUE;
        for (int i = n - 1; i < 2 * n; i++) res = Math.max(res, p[i] - m[i + 1]);
        out.println(res);
        out.close();
    }


    //-----------MyScanner class for faster input----------
    public static class MyScanner {
        BufferedReader br;
        StringTokenizer st;

        public MyScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }


    }

}