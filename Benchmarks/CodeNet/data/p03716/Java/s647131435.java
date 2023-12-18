import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = sc.nextInt();
        int arr [] = new int[3 * n];
        for (int i = 0; i < 3 * n; i++) arr[i] = sc.nextInt();
        PriorityQueue<Integer> cnt = new PriorityQueue<>();
        PriorityQueue<Integer> cnt2 = new PriorityQueue<>(Collections.reverseOrder());
        long sum = 0;
        long sum2 = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            sum2 += arr[3 * n - i - 1];
            cnt.add(arr[i]);
            cnt2.add(arr[3 * n - i - 1]);
        }
        long bestSum [] = new long[3 * n];
        long bestSub [] = new long[3 * n];
        bestSum[n - 1] = sum;
        bestSub[3 * n - n] = sum2;
        for (int i = n, j = 3 * n - n - 1; i < 3 * n - n; i++, j--) {
            if (cnt.peek() < arr[i]) {
                sum -= cnt.poll();
                sum += arr[i];
                cnt.add(arr[i]);
                bestSum[i] = sum;
            } else  bestSum[i] = sum;

            if (cnt2.peek() > arr[j]) {
                sum2 -= cnt2.poll();
                sum2 += arr[j];
                cnt2.add(arr[j]);
                bestSub[j] = sum2;
            } else bestSub[j] = sum2;
        }

        long best = Long.MIN_VALUE;
        for (int i = n - 1; i < 3 * n - n; i++) {
            best = Math.max(best, bestSum[i] - bestSub[i + 1]);
        }
        out.println(best);
        out.flush();
        out.close();
    }
























    static class Scanner {
        StringTokenizer st;
        BufferedReader br;

        public Scanner(InputStream s) {
            br = new BufferedReader(new InputStreamReader(s));
        }
        public Scanner(FileReader s) {
            br = new BufferedReader(s);
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