import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
        int n = sc.nextInt();
        long [] a = new long[n];
        long [] b = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextLong();
        }
        long res = 0;
        for (int bit = 0; bit < 28; bit++) {
            long [] c = new long[n];
            long [] m = new long[n];
            for (int i = 0; i < n; i++) {
                c[i] = a[i] % (1L << (bit + 1));
                m[i] = b[i] % (1L << (bit + 1));
            }
            Arrays.sort(m);
            long ct = 0;
            for (int i = 0; i < n; i++) {
                if (((c[i] >> bit) & 1) == 0) {
                    long lo = (1L << bit) - c[i] - 1;
                    long hi = (1L << (bit + 1)) - c[i] - 1;
                    if (lo <= hi) {
                        ct += (binarySearch(m, hi) - binarySearch(m, lo));
                    }
                } else {
                    long lo1 = -1;
                    long hi1 = (1L << (bit + 1)) - c[i] - 1;
                    if (lo1 <= hi1) {
                        ct += (binarySearch(m, hi1) - binarySearch(m, lo1));
                    }
                    long lo2 = (1L << (bit + 1)) + (1L << bit) - c[i] - 1;
                    long hi2 = (1L << (bit + 1)) - 1;
                    if (lo2 <= hi2) {
                        ct += (binarySearch(m, hi2) - binarySearch(m, lo2));
                    }
                }
            }
            if (ct % 2 == 1) {
                res += (1L << bit);
            }
        }
        out.println(res);
        out.close();
    }

    static long binarySearch(long [] m, long key) {
        int lo = 0; int hi = m.length - 1;
        while (lo < hi) {
            int mid = (lo + hi) / 2;
            if (m[mid] <= key) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        if (lo == m.length || m[lo] > key) lo--;
        return lo + 1;
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