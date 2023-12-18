import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        MyScanner sc = new MyScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int k = sc.nextInt();
        int[] a = new int[k];
        for (int i = 0; i < k; i++)
            a[i] = sc.nextInt();
        if (a[k - 1] != 2)
            out.println(-1);
        else if (k == 1)
            out.println(a[0] != 2 ? -1 : 2 + " " + 3);
        else {
            long min = Long.MAX_VALUE, max = Long.MIN_VALUE;
            for (int i = k - 2; i >= 0; i--) {
                int z = (a[i + 1] << 1) - 1;
                long x = a[i + 1] % a[i] == 0 ? a[i + 1] : a[i + 1] + (a[i] - (a[i + 1] % a[i])),
                        y = z % a[i] == 0 ? z : z - (z % a[i]);
                min = x;
                max = y;
                if (min > z || max < a[i + 1]) {
                    out.println(-1);
                    out.flush();
                    out.close();
                    return;
                }
            }
            max = max + a[0] - 1;
            out.println(min == -1 ? -1 : min + " " + max);
        }
        out.flush();
        out.close();
    }

    private static class MyScanner {
        StringTokenizer st;
        BufferedReader br;

        public MyScanner(InputStream s) {
            br = new BufferedReader(new InputStreamReader(s));
        }

        public MyScanner(String filename) throws IOException {
            br = new BufferedReader(new FileReader(new File(filename)));
        }

        public String next() throws IOException {
            while (st == null || !st.hasMoreTokens())
                st = new StringTokenizer(br.readLine());
            return st.nextToken();
        }

        public int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        public long nextLong() throws IOException {
            return Long.parseLong(next());
        }

        public String nextLine() throws IOException {
            return br.readLine();
        }

        public double nextDouble() throws IOException {
            String x = next();
            StringBuilder sb = new StringBuilder("0");
            double res = 0, f = 1;
            boolean dec = false, neg = false;
            int start = 0;
            if (x.charAt(0) == '-') {
                neg = true;
                start++;
            }
            for (int i = start; i < x.length(); i++)
                if (x.charAt(i) == '.') {
                    res = Long.parseLong(sb.toString());
                    sb = new StringBuilder("0");
                    dec = true;
                } else {
                    sb.append(x.charAt(i));
                    if (dec)
                        f *= 10;
                }
            res += Long.parseLong(sb.toString()) / f;
            return res * (neg ? -1 : 1);
        }

        public boolean ready() throws IOException {
            return br.ready();
        }
    }
}
