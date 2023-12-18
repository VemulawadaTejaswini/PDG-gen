import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


class Main{

    public static void main(String[] args) {
        FastReader f = new FastReader();
        int n = ii(f);
        long w = il(f);
        int[] values = new int[n+1];
        int[] weights = new int[n+1];
        for(int i=1; i<=n; i++){
            weights[i] = ii(f);
            values[i] = ii(f);
        }
        int maxVal = (int)10e5;
        int[][] dp = new int[maxVal + 1][2];
        for(int[] x: dp)
            Arrays.fill(x, Integer.MAX_VALUE);
        dp[0][0] = 0;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=maxVal; j++){
                if(j < values[i])
                    dp[j][1] = dp[j][0];
                else{
                    if(dp[j-values[i]][0] == Integer.MAX_VALUE){
                        dp[j][1] = dp[j][0];
                    }
                    else{
                        dp[j][1] = min(dp[j][0], dp[j-values[i]][0] + weights[i]);
                    }
                }
            }
            for(int j=1; j<=maxVal; j++)
                dp[j][0] = dp[j][1];
        }
        int m = 0;
        for(int i=1; i<=maxVal; ++i){
            if(dp[i][1] <= w)
                m = max(m, i);
        }
        System.out.println(m);
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        String next() {
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
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    public static int ii(FastReader fr){
        return fr.nextInt();
    }

    static long il(FastReader fr){
        return fr.nextLong();
    }

    static double id(FastReader fr){
        return fr.nextDouble();
    }

    static void printArray(Object[] arr) {
        for (Object x : arr)
            print(x, " ");
        printn("");
    }

    static void print(Object s, String sep) {
        System.out.print(s + sep);
    }

    static void printn(Object s) {
        System.out.println(s);
    }

    static long[] inputArrL(int n, FastReader fr) {
        long[] arr = new long[n];
        for (int i = 0; i < n; i++)
            arr[i] = fr.nextLong();
        return arr;
    }

    static int[] inputArr(int n, FastReader fr) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = fr.nextInt();
        return arr;
    }

    static int max(int... args) {
        int max = Integer.MIN_VALUE;
        for (int x : args) {
            max = Math.max(x, max);
        }
        return max;
    }

    static int min(int... args) {
        int min = Integer.MAX_VALUE;
        for (int x : args) {
            min = Math.min(x, min);
        }
        return min;
    }

    static long max(long... args) {
        long max = Integer.MIN_VALUE;
        for (long x : args) {
            max = Math.max(x, max);
        }
        return max;
    }

    static long min(long... args) {
        long min = Integer.MAX_VALUE;
        for (long x : args) {
            min = Math.min(x, min);
        }
        return min;
    }

    static int lenDigit(int d) {
        if (d == 0)
            return 1;
        int l = 0;
        while (d != 0) {
            l++;
            d /= 10;
        }
        return l;
    }

}

