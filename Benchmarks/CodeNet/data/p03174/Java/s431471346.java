import java.io.*;
import java.util.*;

public class Main {
    static class Solver {
        int[][] mat;
        long[][] mem;
        int n;
        final int mod = (int)1e9  + 7;
        public void solve(MyReader in, PrintWriter out) {
            n= in.nextInt();
            mat = new int[n][n];

            mem = new long[n+2][(1<<21) + 5];
            for(long[] m : mem)Arrays.fill(m,-1);

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    mat[i][j] = in.nextInt();
                }
            }


            out.println(calc(0,0));
        }

        long calc(int man, int mask){
            if (man == n){
                if (mask == (1<<n) -1)return 1;
                return 0;
            }

            long ans = 0;

            if (mem[man][mask] != -1)return mem[man][mask];

            for(int women = 0;women< n;women++){
                if (mat[man][women] == 1 && (mask & (1<<women)) == 0){
                    int newMask = mask | (1<<women);
                    ans += calc(man+1,newMask)%mod;
                    ans%=mod;
                }
            }


            mem[man][mask] = ans;
            return ans;
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


