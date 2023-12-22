import java.util.*;
import java.io.*;

public class Main {

    static long M = 1000000007;

    public static void main(String[] args) {
        FastReader sc = new FastReader();
        int len = sc.nextInt();
        int[] a = new int[len];
        for (int i = 0; i < len; i++) {
            a[i] = sc.nextInt();
        }
        long sum = 0;
        for (int i = 0; i < len; i++) {
            long v1 = a[i];
            for (int j = i + 1; j < len; j++) {
                long v2 = a[j];
                long val = (v1 * v2) % M;
                sum += val;
            }
        }
        System.out.println(sum);

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