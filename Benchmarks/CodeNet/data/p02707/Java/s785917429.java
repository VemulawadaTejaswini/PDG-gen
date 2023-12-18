import java.util.*;
import java.io.*;

public class Main {

    /**
     *
     * k = 1
     *
     * 2^17+1  2^17     0
     * 1      2^17+1   1
     *
     * dp[2][2] = max(
     */

    public static void main(String[] args) {
        FastReader sc = new FastReader();
        int n = sc.nextInt();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n-1; i++) {
            int lead = sc.nextInt();
            map.put(lead, map.getOrDefault(lead, 0 ) + 1);
        }
        for (int i = 0; i < n; i++) {
            if (map.containsKey(i + 1)) {
                System.out.println(map.get(i+1));
            } else {
                System.out.println(0);
            }
        }

    }

    private static void solve(int[] ans, int n, int[] arr) {

    }

    /**\
     *
     * 4
     * 2 3 4 5
     *
     *
     * 1 2 3 4 5 6 7 8
     * 2 6 3 7 4 8 5 9
     */

    // 1 1 1 0 0 0
    // 0 0 1 1 1 1


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
 * 7 3
 * 3 1 5
 * 9 6 5
 *
 * i = 1: 1
 * i = 2: 2
 * i = 3: 3
 *
 *
 * 1 2 3 3 3 3 3
 */


/**
 *
 *  1+1
 **/