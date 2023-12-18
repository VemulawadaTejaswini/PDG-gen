import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;
import java.util.jar.JarOutputStream;

public class Main {

    public static int lower_bound(long[] arr,long target){
        int low = 0;
        int high = arr.length - 1;
        while(low < high){
            int mid = (low + high) / 2;
            if(arr[mid] < target){
                low = mid + 1;
            }
            else{
                high = mid;
            }
        }
        return low;
    }

    public static void main(String[] args) throws IOException {

        Reader.init(System.in);
        int n= Reader.nextInt();
        int[][] cost = new int[n][3];
        for(int i=0;i<n;i++){
            for(int j=0;j<3;j++){
                cost[i][j]=Reader.nextInt();
            }
        }
        int[][] dp=new int[n][3];
        dp[0][0]=cost[0][0];
        dp[0][1]=cost[0][1];
        dp[0][2]=cost[0][2];
        for(int i=1;i<n;i++){
            dp[i][0] = cost[i][0] + Math.max(dp[i-1][1],dp[i-1][2]);
            dp[i][1] = cost[i][1] + Math.max(dp[i-1][0],dp[i-1][2]);
            dp[i][2] = cost[i][2] + Math.max(dp[i-1][1],dp[i-1][0]);
        }
        int result = Math.max(dp[n-1][0],dp[n-1][1]);
        result = Math.max(result,dp[n-1][2]);
        System.out.println(result);

    }

}






class Reader {
    static BufferedReader reader;
    static StringTokenizer tokenizer;

    /** call this method to initialize reader for InputStream */
    static void init(InputStream input) {
        reader = new BufferedReader(
                new InputStreamReader(input) );
        tokenizer = new StringTokenizer("");
    }

    /** get next word */
    static String nextLine() throws IOException {
        while ( ! tokenizer.hasMoreTokens() ) {
            //TODO add check for eof if necessary
            tokenizer = new StringTokenizer(
                    reader.readLine() );
        }
        return tokenizer.nextToken();
    }

    static int nextInt() throws IOException {
        return Integer.parseInt( nextLine() );
    }
    static long nextLong() throws IOException {
        return Long.parseLong(nextLine());
    }

    static double nextDouble() throws IOException {
        return Double.parseDouble( nextLine() );
    }

    static float nextFloat() throws IOException {
        return Float.parseFloat( nextLine() );
    }
    static int[] nextIntArray(int length) throws IOException {
        int[] arr = new int[length];
        //System.out.println(length);
        for (int i=0; i<length; i++) {
            arr[i] = Integer.parseInt( nextLine() );
            //System.out.println(arr[i]);
        }
        //System.out.println(arr);
        return arr;
    }
    static long[] nextLongArray(int length) throws IOException {
        long[] arr = new long[length];
        for (int i=0; i<length; i++) {
            arr[i] = Long.parseLong( nextLine() );
        }
        return arr;
    }

}

