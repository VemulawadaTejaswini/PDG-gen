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
        TreeMap<Integer,Integer> cnt = new TreeMap<>();
        TreeMap<Integer,Integer> cnt2 = new TreeMap<>();
        long sum = 0;
        long sum2 = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            Integer was = cnt.get(arr[i]);
            if (was == null) cnt.put(arr[i],1);
            else cnt.put(arr[i],was+1);

            sum2 += arr[3 * n - i - 1];
            Integer was2 = cnt2.get(arr[3 * n - i - 1]);
            if (was2 == null) cnt2.put(arr[3 * n - i - 1],1);
            else cnt2.put(arr[3 * n - i - 1],was2+1);

        }
        long bestSum [] = new long[3 * n];
        long bestSub [] = new long[3 * n];
        bestSum[n - 1] = sum;
        bestSub[3 * n - n] = sum2;
        for (int i = n, j = 3 * n - n - 1; i < 3 * n - n; i++, j--) {
            if (cnt.firstKey() < arr[i]) {
                sum -= cnt.firstKey();
                sum += arr[i];
                bestSum[i] = sum;
                Integer was = cnt.get(cnt.firstKey());
                if (was == 1) cnt.remove(cnt.firstKey());
                else cnt.put(cnt.firstKey(), was - 1);
                Integer was2 = cnt.get(arr[i]);
                if (was2 == null) cnt.put(arr[i], 1);
                else cnt.put(arr[i], was2 + 1);
            } else  bestSum[i] = sum;

            if (cnt2.lastKey() > arr[j]) {
                sum2 -= cnt2.lastKey();
                sum2 += arr[j];
                bestSub[j] = sum2;
                Integer was = cnt2.get(cnt2.lastKey());
                if (was == 1) cnt2.remove(cnt2.lastKey());
                else cnt2.put(cnt.lastKey(), was - 1);
                Integer was2 = cnt2.get(arr[j]);
                if (was2 == null) cnt2.put(arr[j], 1);
                else cnt2.put(arr[j], was2 + 1);
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