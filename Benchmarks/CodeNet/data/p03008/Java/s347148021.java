
import javax.accessibility.AccessibleValue;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static FastScanner sc = new FastScanner(System.in);
    static int INF = 12345678;
    static long MOD = 1000000007;
    static int[] y4 = {0, 1, 0, -1};
    static int[] x4 = {1, 0, -1, 0};
    static int[] y8 = {0, 1, 0, -1, -1, 1, 1, -1};
    static int[] x8 = {1, 0, -1, 0, 1, -1, 1, -1};
    static long[] F;//factorial
    static boolean[] isPrime;
    static int[] primes;
    static char[][] map;

    static int N, M;
    static long T;
    static int[] A;


    public static void main(String[] args) {


        int n = sc.nextInt();

        int[] A = new int[3];
        int[] B = new int[3];

        int[] w = new int[3];
        long[] value = new long[3];

        long[][] dp = new long[4][n+1];



        for(int i = 0;i < 3;i++){
            A[i] = sc.nextInt();
        }


        for(int i = 0;i < 3;i++){
            B[i] = sc.nextInt();
        }


        for(int i = 0;i < 3;i++){
            value[i] = B[i];
            w[i] = A[i];
        }

        for(int i = 0;i < 3;i ++){
            for(int j = 0;j <= n; j ++){
                if(j < w[i]){
                    dp[i + 1][j] = dp[i][j];
                }else{
                    dp[i+1][j] = Math.max(dp[i][j],dp[i+1][j-w[i]] + value[i]);
                }
            }
        }


//        System.out.println(dp[3][n]);

        n = (int)dp[3][n];
        long[][] dp_ = new long[4][n+1];

        for(int i = 0;i < 3;i++){
            value[i] = A[i];
            w[i] = B[i];
        }

        for(int i = 0;i < 3;i ++){
            for(int j = 0;j <= n; j ++){
                if(j < w[i]){
                    dp_[i + 1][j] = dp_[i][j];
                }else{
                    dp_[i+1][j] = Math.max(dp_[i][j],dp_[i+1][j-w[i]] + value[i]);
                }
            }
        }

        System.out.println(dp_[3][n]);

//
//        System.out.println(Arrays.toString(w));
//        System.out.println(Arrays.toString(value));

    }
  
    static class FastScanner {

        private BufferedReader reader = null;
        private StringTokenizer tokenizer = null;

        public FastScanner(InputStream in) {
            reader = new BufferedReader(new InputStreamReader(in));
            tokenizer = null;
        }

        public String next() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        /*public String nextChar(){
            return (char)next()[0];
        }*/
        public String nextLine() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    return reader.readLine();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

            return tokenizer.nextToken("\n");
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }

        public int[] nextIntArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = nextInt();
            }
            return a;
        }

        public int[] nextIntArrayDec(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = nextInt() - 1;
            }
            return a;
        }

        public int[][] nextIntArray2(int h, int w) {
            int[][] a = new int[h][w];
            for (int hi = 0; hi < h; hi++) {
                for (int wi = 0; wi < w; wi++) {
                    a[hi][wi] = nextInt();
                }
            }
            return a;
        }

        public int[][] nextIntArray2Dec(int h, int w) {
            int[][] a = new int[h][w];
            for (int hi = 0; hi < h; hi++) {
                for (int wi = 0; wi < w; wi++) {
                    a[hi][wi] = nextInt() - 1;
                }
            }
            return a;
        }

        //複数の配列を受け取る
        public void nextIntArrays2ar(int[] a, int[] b) {
            for (int i = 0; i < a.length; i++) {
                a[i] = sc.nextInt();
                b[i] = sc.nextInt();
            }
        }

        public void nextIntArrays2arDec(int[] a, int[] b) {
            for (int i = 0; i < a.length; i++) {
                a[i] = sc.nextInt() - 1;
                b[i] = sc.nextInt() - 1;
            }
        }

        //複数の配列を受け取る
        public void nextIntArrays3ar(int[] a, int[] b, int[] c) {
            for (int i = 0; i < a.length; i++) {
                a[i] = sc.nextInt();
                b[i] = sc.nextInt();
                c[i] = sc.nextInt();
            }
        }

        //複数の配列を受け取る
        public void nextIntArrays3arDecLeft2(int[] a, int[] b, int[] c) {
            for (int i = 0; i < a.length; i++) {
                a[i] = sc.nextInt() - 1;
                b[i] = sc.nextInt() - 1;
                c[i] = sc.nextInt();
            }
        }

        public Integer[] nextIntegerArray(int n) {
            Integer[] a = new Integer[n];
            for (int i = 0; i < n; i++) {
                a[i] = nextInt();
            }
            return a;
        }

        public char[] nextCharArray(int n) {
            char[] a = next().toCharArray();

            return a;
        }

        public char[][] nextCharArray2(int h, int w) {
            char[][] a = new char[h][w];
            for (int i = 0; i < h; i++) {
                a[i] = next().toCharArray();
            }
            return a;
        }

        //スペースが入っている場合
        public char[][] nextCharArray2s(int h, int w) {
            char[][] a = new char[h][w];
            for (int i = 0; i < h; i++) {
                a[i] = nextLine().replace(" ", "").toCharArray();
            }
            return a;
        }

        public char[][] nextWrapCharArray2(int h, int w, char c) {
            char[][] a = new char[h + 2][w + 2];
            //char c = '*';
            int i;
            for (i = 0; i < w + 2; i++)
                a[0][i] = c;
            for (i = 1; i < h + 1; i++) {
                a[i] = (c + next() + c).toCharArray();
            }
            for (i = 0; i < w + 2; i++)
                a[h + 1][i] = c;
            return a;
        }

        //スペースが入ってる時用
        public char[][] nextWrapCharArray2s(int h, int w, char c) {
            char[][] a = new char[h + 2][w + 2];
            //char c = '*';
            int i;
            for (i = 0; i < w + 2; i++)
                a[0][i] = c;
            for (i = 1; i < h + 1; i++) {
                a[i] = (c + nextLine().replace(" ", "") + c).toCharArray();
            }
            for (i = 0; i < w + 2; i++)
                a[h + 1][i] = c;
            return a;
        }

        public long[] nextLongArray(int n) {
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = nextLong();
            }
            return a;
        }

        public long[][] nextLongArray2(int h, int w) {
            long[][] a = new long[h][w];
            for (int hi = 0; hi < h; hi++) {
                for (int wi = 0; wi < w; wi++) {
                    a[hi][wi] = nextLong();
                }
            }
            return a;
        }
    }
}
