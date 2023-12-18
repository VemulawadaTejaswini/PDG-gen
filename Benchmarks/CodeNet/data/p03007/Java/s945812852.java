import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args){
        PrintWriter out = new PrintWriter(System.out);
        FastScanner sc = new FastScanner();

        int N = sc.nextInt();
        int A[] = sc.nextIntArray(N);

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i=0;i<N;i++) {
            min = Math.min(min, A[i]);
            max = Math.max(max, A[i]);
        }

        boolean pos_flg[] = new boolean[N];
        boolean min_flg = false;
        boolean max_flg = false;
        for (int i=0;i<N;i++) {
            if (A[i] == min) {
                if (min_flg == false) {
                    min_flg = true;
                    pos_flg[i] = false;
                    continue;
                }
            }

            if (A[i] == max) {
                if (max_flg == false) {
                    max_flg = true;
                    pos_flg[i] = true;
                    continue;
                }
            }

            pos_flg[i] = A[i] >= 0;
        }

        int pos_cnt = 0;
        int neg_cnt = 0;
        ArrayList<Integer> pos_list = new ArrayList<Integer>();
        ArrayList<Integer> neg_list = new ArrayList<Integer>();
        for (int i=0;i<N;i++) {
            if (pos_flg[i]) {
                pos_cnt++;
                pos_list.add(A[i]);
            }
            else {
                neg_cnt++;
                neg_list.add(A[i]);
            }
        }

        int M = 0;
        int ope[][] = new int[N-1][2];
        for (int i=0;i<N-1;i++) {
            if (i == 0) {
                if (pos_cnt == 1) {
                    ope[i][0] = pos_list.get(--pos_cnt);
                    ope[i][1] = neg_list.get(--neg_cnt);
                } else {
                    ope[i][1] = pos_list.get(--pos_cnt);
                    ope[i][0] = neg_list.get(--neg_cnt);
                }
            } else {
                if (pos_cnt == 1) {
                    ope[i][0] = pos_list.get(--pos_cnt);
                    ope[i][1] = M;
                } else if (pos_cnt > 1) {
                    ope[i][0] = M;
                    ope[i][1] = pos_list.get(--pos_cnt);
                } else {
                    ope[i][0] = M;
                    ope[i][1] = neg_list.get(--neg_cnt);
                }
            }

            M += ope[i][0] - ope[i][1];
        }

        out.println(M);
        for (int i=0;i<N-1;i++) {
            out.printf("%d %d\n", ope[i][0], ope[i][1]);
        }

        out.flush();
    }

    public static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner(String s) {
            try {
                br = new BufferedReader(new FileReader(s));
            } catch (FileNotFoundException e) {
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

        int[] nextIntArray(int N) {
            int a[] = new int[N];
            for (int i=0;i<N;i++) {
                a[i] = this.nextInt();
            }

            return a;
        }

        long[] nextLongArray(int N) {
            long a[] = new long[N];
            for (int i=0;i<N;i++) {
                a[i] = this.nextLong();
            }

            return a;
        }

        double[] nextDoubleArray(int N) {
            double a[] = new double[N];
            for (int i=0;i<N;i++) {
                a[i] = this.nextDouble();
            }

            return a;
        }

        String[] nextTokenArray(int N) {
            String a[] = new String[N];
            for (int i=0;i<N;i++) {
                a[i] = this.nextToken();
            }

            return a;
        }
    }
}