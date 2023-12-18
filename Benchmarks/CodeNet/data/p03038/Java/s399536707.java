import java.io.*;
import java.util.Arrays;
import java.util.Objects;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        MyReader mr = new MyReader();
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        new Solver().solve(mr, out);
        out.close();
    }

    static class Solver {
        public void solve(MyReader in, PrintWriter out) {
            int n = in.nextInt(), m = in.nextInt();

            int[] A = in.nextIntArray(n);
            Arrays.sort(A);

            int[][] arr = new int[m][2];

            for (int i = 0; i < m; i++) {
                arr[i] = new int[]{in.nextInt(), in.nextInt()};
            }

            Arrays.sort(arr, (a, b) -> b[1] - a[1]);

            int l = 0, r = n-1;
            for (int i = 0; i < m && l <= r; i++) {
                int times = arr[i][0], v = arr[i][1];
                int pos = binS(A,v,l,r);
                int j;
                for (j = 0;j<Math.min(times,pos);j++){
                    A[j] = v;
                }
                Arrays.sort(A,l,pos);
                r = pos-times;
            }

            long ans =0;
            for (int i : A){
                ans += (long)i;
            }

            out.println(ans);



        }

        int binS(int[] arr,int key,  int l, int r){
            int res = r+1;
            while (l <= r){
                int m = l + (r - l)/2;
                if (arr[m] >= key){
                    res = m;
                    r = m-1;
                }
                else{
                    l = m+1;
                }
            }

            return res;
        }


    }

    /////////////////////////////////////////////////////////////    

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

        int[] nextIntArray(int n) {
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = nextInt();
            }

            return arr;
        }

    }


    /////////////////////////////////////////////////////////////

    static class Pair<K, V> {
        K x;
        V y;

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

}


