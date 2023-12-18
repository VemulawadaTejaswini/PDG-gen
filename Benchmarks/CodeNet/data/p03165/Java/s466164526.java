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
        String s1= Reader.nextLine();
        String s2= Reader.nextLine();
        int m=s1.length()+1;
        int n=s2.length()+1;
        String[][] dp=new String[m][n];
//        for(int i=0;i<m;i++){
//            for(int j=0;j<n;j++){
//                dp[i][j]="";
//            }
//        }
//        int flag=0;
//        for(int i=0;i<n;i++){
//            if(s1.charAt(0)==s2.charAt(i)){
//                flag += 1;
//                dp[0][i]+=s1.charAt(0);
//            }
//            if(flag==1){
//                dp[0][i]+=s1.charAt(0);
//            }
//        }
//        flag = 0;
//        for(int i=0;i<m;i++){
//            if(s2.charAt(0)==s1.charAt(i)){
//                flag += 1;
//                dp[i][0]+=s2.charAt(0);
//            }
//            if(flag==1){
//                dp[i][0]+=s2.charAt(0);
//            }
//        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0 || j==0){
                    dp[i][j]="";
                    continue;
                }
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1]+s1.charAt(i-1);
                }
                else{
                    int max=Math.max(dp[i-1][j].length(),dp[i][j-1].length());
                    if(max==dp[i-1][j].length()){
                        dp[i][j]=dp[i-1][j];
                    }
                    else{
                        dp[i][j]=dp[i][j-1];
                    }
                }
            }
        }
        System.out.println(dp[m-1][n-1]);

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

