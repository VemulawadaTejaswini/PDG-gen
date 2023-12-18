import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


class Main {

    public static void main(String[] args) {
        FastReader f = new FastReader();
        int n = ii(f), k = ii(f);
        int[] stones = new int[n];
        for(int i=0; i<n; ++i)
            stones[i] = ii(f);
        boolean[] dp = new boolean[k + 1];
        //dp[i] means if first player loses or wins if the left stones are i
        dp[0] =  false; //no valid move
        for(int i=1; i<=k; i++){
            for(int x: stones){
                if(x <= i){
                    if(!dp[i-x])
                        dp[i] = true;
                }
            }
        }
        printn(dp[k]?"First":"Second");
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
    static void debug(Object... args){
        for(int i=0; i<args.length; i+=2){
            print("[" + args[i], ":");
            print(args[i+1], "]");
        }
        printn("");
    }
    public static int ii(FastReader fr) {
        return fr.nextInt();
    }
    static long il(FastReader fr) {
        return fr.nextLong();
    }
    static double id(FastReader fr) {
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

