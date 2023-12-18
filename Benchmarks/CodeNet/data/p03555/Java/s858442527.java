import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PipedInputStream;
import java.util.*;

public class Main {
    private static final int MOD = (int) Math.pow(10, 9);
    private static final int[][] DIRS = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

    public static void main(String[] args) {
        FastReader sc = new FastReader();
        char[] a = sc.next().toCharArray();
        char[] b = sc.next().toCharArray();

        if (a[0] == b[2] && a[1] == b[1] && a[2] == b[0]) {
            print("YES");
        } else {
            print("NO");
        }

        // print("" + ( b * 2 - a));
        System.exit(0);
    }

    static  private void print(String s) {
        System.out.println(s);
    }

    static private int log2(int x) {
        return (int)(Math.log(x) / Math.log(2));
    }

    static private long gcd(long m, long n) {
        if (m < n) { return gcd(n, m); }
        if (m % n == 0) { return n; }
        return gcd(n, m%n);
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
                } catch (IOException  e) {
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
            try{
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}
