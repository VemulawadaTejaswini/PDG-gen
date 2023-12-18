import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) {
        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int n = sc.nextInt();
        while (n > 0) {
            int k = n % 10;
            if (k == 7) {
                out.println("YES");
                out.flush();
                out.close();
                return;
            }
            n /= 10;
        }
        out.println("NO");
        out.flush();
        out.close();
    }

    private static void solve(double x, ArrayList<Long> arr, int n) {
        long sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr.get(i);
        }
        if (1.0 * sum / n >= x) System.out.println(n);
        else {
            Collections.sort(arr);
            long cur = 0;
            long people = 0;
            for (int i = n - 1; i >= 0; i--) {
                cur += arr.get(i);
                people++;
                if (1.0 * cur / people < x) {
                    System.out.println(people - 1);
                    return;
                }
            }
        }

    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
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

/**
 *x=3
 * 1 1 2 5
 */

/**
 *
 *  1+1
 **/