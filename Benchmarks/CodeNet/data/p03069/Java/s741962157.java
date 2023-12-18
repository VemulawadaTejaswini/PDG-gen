import java.io.*;
import java.util.Arrays;
import java.util.Objects;
import java.util.StringTokenizer;

public class Main {
    static class Solver {
        int n;
        char[] s;
        int[][] mem;

        public void solve(MyReader in, PrintWriter out) {
            n = in.nextInt();
            s = in.next().toCharArray();

            mem = new int[n + 1][2];
            for (int[] m : mem) Arrays.fill(m, -1);

            out.println(calc(0, 0));

//            if (s[0] == '.')out.println(calc(0,0));
//            else out.println(Math.min(calc(0,0),calc(0,1)));
        }

        int mxN = (int) 2e6;

        //0-black #, 1-white.
        int calc(int cur, int chng) {
            if (cur == n) return 0;

            if (mem[cur][chng] != -1) return mem[cur][chng];

            int res = mxN;


            if (s[cur] == '.' && cur > 0 && chng == 0 && s[cur - 1] == '#') res = Math.min(res, 1 + calc(cur + 1, 1));
            else if (s[cur] == '.' && cur > 0 && chng == 1 && s[cur - 1] == '.')
                res = Math.min(res, 1 + calc(cur + 1, 1));
            else
                res = Math.min(calc(cur + 1, 0), calc(cur + 1, 1) + 1);

            return mem[cur][chng] = res;


        }


    }

    public static void main(String[] args) {
        MyReader mr = new MyReader();
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        new Solver().solve(mr, out);
        out.close();
    }

    //////////////////////////////////////////////////////////////////////////
    //    static int[][] dir = {{0,1}, {1,0},{-1,0}, {0,-1}};
//    static int[][] dir = {{0,1}, {1,0},{-1,0}, {0,-1}, {-1,-1},{-1,1}, {1,1}, {1,-1}};
    static class MyReader {
        BufferedReader br;
        StringTokenizer st;

        MyReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (Exception e) {
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
            String res = "";
            try {
                res = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }

            return res;
        }

        int[] nextIntArray(int n) {
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = nextInt();
            }

            return arr;
        }

        Integer[] nextIntegerArray(int n) {
            Integer[] arr = new Integer[n];
            for (int i = 0; i < n; i++) {
                arr[i] = nextInt();
            }

            return arr;
        }

        Long[] nextLongArray(int n) {
            Long[] arr = new Long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = nextLong();
            }

            return arr;
        }

        long[] nextlongArray(int n) {
            long[] arr = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = nextLong();
            }

            return arr;
        }

        String[] nextStringArray(int n) {
            String[] arr = new String[n];
            for (int i = 0; i < n; i++) {
                arr[i] = next();
            }
            return arr;
        }
    }

    /////////////////////////////////////////////////////////////    

    static class Pair<K, V> {
        K x;
        V y;

        public Pair(K x, V y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Pair<?, ?> pair = (Pair<?, ?>) o;
            return Objects.equals(x, pair.x) &&
                    Objects.equals(y, pair.y);
        }

        @Override
        public int hashCode() {
            return Objects.hash(x, y);
        }
    }


    /////////////////////////////////////////////////////////////

    static <T> void swap(T[] arr, int i, int j) {
        T tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

}


