import java.io.*;
import java.util.*;

public class Main {
    static long solve (int [] arr, int parity) {
        long sum = 0;
        long res = 0;
        for (int n = arr.length, i = 0; i < n; i++) {
            if ((parity & 1) == 0) {
                if (sum + arr[i] <= 0) {
                    res += (1 - (sum + arr[i]));
                    sum = 1;
                } else {
                    sum += arr[i];
                }
            } else {
                if (sum + arr[i] >= 0) {
                    res += ((sum + arr[i]) - - 1);
                    sum = -1;
                } else {
                    sum += arr[i];
                }
            }
            parity ^= 1;
        }
        return res;
    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        out.println(Math.min(solve(arr, 0), solve(arr, 1)));
        out.flush();
        out.close();
    }

    static class Scanner {
        StringTokenizer st;
        BufferedReader br;

        public Scanner(InputStream s) {
            br = new BufferedReader(new InputStreamReader(s));
        }

        public Scanner (FileReader f) {br = new BufferedReader(f);}

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