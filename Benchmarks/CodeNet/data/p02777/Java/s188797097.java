import java.awt.Point;
import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Main {
    static class Solver {
        MyReader mr = new MyReader();

        public void solve() {
            String fir = mr.next();
            String sec = mr.next();

            int a = mr.nextInt();
            int b= mr.nextInt();

            String u = mr.next();

            if(u.equals(fir))a--;
            else if(u.equals(sec))b--;

            System.out.println(a+" "+b);
        }
    }

    public static void main(String[] args) {
        new Solver().solve();
    }

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

        Integer[] nextIntArray(int n) {
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

        String[] nextStringArray(int n) {
            String[] arr = new String[n];
            for (int i = 0; i < n; i++) {
                arr[i] = next();
            }
            return arr;
        }
    }

    static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

}


