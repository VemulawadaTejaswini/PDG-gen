import java.io.*;
import java.util.*;


public class Main {

    public static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner(String s) {
            try {
                br = new BufferedReader(new FileReader(s));
            } catch (FileNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

        public FastScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String nextToken() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(nextToken());
        }

        long nextLong() {
            return Long.parseLong(nextToken());
        }

        double nextDouble() {
            return Double.parseDouble(nextToken());
        }
    }

    public static void main(String[] args) {
        FastScanner fs = new FastScanner();

        int N = fs.nextInt();
        int M = fs.nextInt();
        int Q = fs.nextInt();

        int[][] queries = new int[Q][4];

        for (int i = 0; i < Q; ++i) {
            for (int j = 0; j < 4; ++j) {
                queries[i][j] = fs.nextInt();
            }
        }



        // generate all increasing sequences of length N where each element is <= M
        int start = 1;
        int length = 0;
        int[] max = new int[1];
        int[] seq = new int[N];
        int[] num = new int[1];
        dfs(seq, start, length, N, M, max, queries, num);


        System.out.println(max[0]);
    }

    private static void dfs(int[] seq, int start, int length, int N, int M, int[] max, int[][] queries, int[] num) {
        if (length == N) {
            num[0]++;
            max[0] = Math.max(max[0], compute(seq, queries));
            return;
        }
        else {
            for (int k = start; k <= M; ++k) {
                seq[length] = k;
                dfs(seq, k, length + 1, N, M, max, queries, num);
            }
        }
    }

    private static int compute(int[] seq, int[][] queries) {
        int sum = 0;
        for (int i = 0; i < queries.length; ++i) {
            if (seq[queries[i][1] - 1] - seq[queries[i][0] - 1] == queries[i][2]) {
                sum += queries[i][3];
            }
        }

        return sum;
    }
}
