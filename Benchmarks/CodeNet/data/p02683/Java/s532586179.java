import java.io.*;
import java.util.StringTokenizer;
import java.util.Arrays;

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
        int X = fs.nextInt();

        int[] costs = new int[N];
        int[][] know = new int[N][M];

        for (int i = 0; i < N; ++i) {
            for (int j = 0; j < M + 1; ++j) {
                if (j == 0) {
                    costs[i] = fs.nextInt();
                }
                else {
                    know[i][j - 1] = fs.nextInt();
                }
            }
        }


        int[] needed = new int[M];
        Arrays.fill(needed, X);
        System.out.println(findSolution(0, costs, know, needed));

    }

    private static int findSolution(int start, int[] costs, int[][] know, int[] needed) {

        if (start == costs.length) {
            boolean positiveExists = false;
            for (int i: needed) {
                if (i > 0) {
                    positiveExists = true;
                    break;
                }
            }

            if (positiveExists) {
                return -1;
            }
            return 0;
        }

        int[] previous = Arrays.copyOf(needed, needed.length);
        for (int i = 0; i < know[0].length; ++i) {
            previous[i] -= know[start][i];
        }

        int result1 = Integer.MAX_VALUE;
        if (findSolution(start + 1, costs, know, previous) != -1) {
            result1 = costs[start] + findSolution(start + 1, costs, know, previous);
        }
        else {
            result1 = -1;
        }

        int result2 = findSolution(start + 1, costs, know, needed);

        if (result1 == -1 && result2 == -1) {
            return -1;
        }
        else if (result1 == -1) {
            return result2;
        }
        else if (result2 == -1) {
            return result1;
        }
        else {
            return Math.min(result1, result2);
        }
    }
}
