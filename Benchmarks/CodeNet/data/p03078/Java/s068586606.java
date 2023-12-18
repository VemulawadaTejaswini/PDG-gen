import java.io.*;
import java.util.*;

public class Main {
    static class Solver {
        public void solve(MyReader in, PrintWriter out) {
            int x = in.nextInt();
            int y = in.nextInt();
            int z = in.nextInt();
            int K = in.nextInt();

            Long[] a = in.nextLongArray(x);
            Long[] b = in.nextLongArray(y);
            Long[] c = in.nextLongArray(z);

//            Arrays.sort(a, Collections.reverseOrder());
//            Arrays.sort(b, Collections.reverseOrder());
            Arrays.sort(c, Collections.reverseOrder());

//            List<Long> list = new ArrayList<>();
//            List<Long> res = new ArrayList<>();
            PriorityQueue<Long> list = new PriorityQueue<>(K);
            PriorityQueue<Long> res = new PriorityQueue<>(K);

            //1e6
            for (int i = 0; i < x; i++) {
                for (int j = 0; j < y; j++) {
                    long sum = a[i] + b[j];
                    if (list.size() < K){
                        list.add(sum);
                    }
                    else if (list.peek() < sum){
                        list.poll();
                        list.add(sum);
                    }

                }
            }

            long[] tmp = new long[list.size()];
            for (int i = tmp.length - 1; i >= 0; i--) {
                tmp[i] = list.poll();

            }
            for (int i = 0; i < tmp.length; i++) {
                for (int j = 0; j < z; j++) {
                    long sum = tmp[i] + c[j];
                    if (res.size() < K){
                        res.add(sum);
                    }
                    else if(res.peek() < sum){
                        res.poll();
                        res.add(sum);
                    }
                }
            }

            long[] ans = new long[res.size()];
            for (int i = ans.length - 1; i >= 0; i--) {
                ans[i] = res.poll();
            }
            for (int i = 0; i < K; i++) {
                out.println(ans[i]);
            }


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


