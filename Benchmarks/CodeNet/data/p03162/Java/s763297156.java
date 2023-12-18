import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader in;

    public static void solve() throws IOException {
        int n = nextInt();
        Integer[][] games = new Integer[n][3];
        for(int i = 0;i<n;i++){
            games[i] = nextArray(3);
        }

        int[] dp = new int[n];

        dp[0] = maxExclude(games[0],-1);
        int prev = maxIndexExclude(games[0],-1);

        for(int i = 1;i < n;i++){
            dp[i] = dp[i-1]+maxExclude(games[i],prev);
            prev = maxIndexExclude(games[i],prev);
        }

        System.out.println(dp[n-1]);



    }

    static int maxExclude(Integer[] arr, int exclude){
        int max = -1;
        for(int i = 0;i<arr.length;i++){
            if(i == exclude)
                continue;

            max =  Math.max(max,arr[i]);
        }

        return max;
    }
    static int maxIndexExclude(Integer[] arr, int exclude){
        int maxIdx = 0;
        if(exclude != -1){
            arr[exclude]=-1;
        }
        for(int i = 1;i<arr.length;i++){
            if(arr[i] > arr[maxIdx])
                maxIdx = i;
        }

        return maxIdx;
    }



//    static int calc(Integer[] arr , int i, int j){
//        return Math.abs(arr[i] - arr[j]);
//    }

    public static void main(String[] args) throws IOException {
        in = new BufferedReader(new InputStreamReader(System.in));
        solve();
    }

    static int nextInt() throws IOException {
        return Integer.parseInt(in.readLine().trim());
    }

    static long nextLong() throws IOException {
        return Long.parseLong(in.readLine().trim());
    }

    static Integer[] nextArray(int n) throws IOException {
        StringTokenizer st = new StringTokenizer(in.readLine());
        Integer[] tmp = new Integer[n];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = Integer.parseInt(st.nextToken());
        }

        return tmp;
    }

}

