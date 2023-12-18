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

        Integer[] dp = new Integer[3];
        dp = games[0];

        for(int i = 1;i<n;i++){
            Integer[] tmp = new Integer[3];
            Arrays.fill(tmp,-1);
            for(int k = 0;k<3;k++){
                for(int j = 0;j<3;j++){
                    if(k == j)
                        continue;

                    tmp[k] = Math.max(tmp[k], games[i][k] + dp[j]);
                }
            }

            dp = tmp;
        }

        System.out.println(Math.max(dp[0], Math.max(dp[1],dp[2])));


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

