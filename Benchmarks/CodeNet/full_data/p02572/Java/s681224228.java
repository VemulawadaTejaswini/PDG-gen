import java.util.*;
import java.io.*;

public class Main {

    static long M = 1000000007;

    public static void main(String[] args) {
        FastReader sc = new FastReader();
        int len = sc.nextInt();
        long[] a = new long[len];
        for (int i = 0; i < len; i++) {
            a[i] = sc.nextLong();
        }
        long sum = 0;
        for (int i = 0; i < len; i++)
            sum += (a[i]);
        long sumsq = (sum * sum);
        long individual_sum = 0;
        for (int i = 0; i < len; i++) {
            long val = (a[i] * a[i]);
            individual_sum += (val);
        }
        // System.out.println("sumsq=" + sumsq);
        // System.out.println("indivi=" + individual_sum);
        System.out.println((((sumsq - individual_sum) % M) / 2));

    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
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