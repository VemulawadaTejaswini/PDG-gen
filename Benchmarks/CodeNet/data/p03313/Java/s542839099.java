import java.io.*;
import java.util.*;

public class Main {



    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        final int[] a = new int[1 << n];
        for (int i = 0; i < 1 << n; i++) {
            a[i] = sc.nextInt();
        }
        int[][] dp = new int[1 << n][2];
        dp[1][0] = 0;
        dp[1][1] = -1;
        for (int i = 1; i < 1 << n; i++) {
            dp[i][0] = i;
            dp[i][1] = -1;
            System.err.println(i);
            System.err.println(Arrays.toString(dp[i]));
            for (int j = n - 1; j >= 0; j--) {
                if (((1 << j) & i) != 0) {
                    int[] collect = dp[i ^ (1 << j)];
                    Integer[] wild = new Integer[4];
                    wild[0] = dp[i][0];
                    wild[1] = dp[i][1];
                    wild[2] = collect[0];
                    wild[3] = collect[1];
                    Arrays.sort(wild, new Comparator<Integer>() {
                        @Override
                        public int compare(Integer i1, Integer i2) {
                            if (i1.equals(i2)) {
                                return 0;
                            }
                            if (i1 == -1) return 1;
                            if (i2 == -1) return -1;
                            return Integer.compare(a[i1], a[i2]);
                        }
                    });
                    int idx = 0;
                    int pv = -2;
                    for (int k = 3; k >= 0; k--) {
                        if (wild[k] == -1) throw new RuntimeException(Arrays.toString(wild));
                        if (wild[k] == pv) continue;
                        pv = dp[i][idx++] = wild[k];
                        if (idx == 2) break;
                    }
                    System.err.println(Arrays.toString(dp[i]));
                }
            }
        }
        PrintWriter pw = new PrintWriter(System.out);
        for (int i = 1; i < 1 << n; i++) {
            pw.println(a[dp[i][0]] + a[dp[i][1]]);
        }
        pw.close();
    }

    public static class Scanner {
        StringTokenizer st;
        BufferedReader br;
        public Scanner(InputStream s) {
            br = new BufferedReader(new InputStreamReader(s));
        }
        public String next() throws IOException {
            while (st == null || !st.hasMoreTokens()) {
                st = new StringTokenizer(br.readLine());
            }
            return st.nextToken();
        }
        public int nextInt() throws IOException{
            return Integer.parseInt(next());
        }
    }
}