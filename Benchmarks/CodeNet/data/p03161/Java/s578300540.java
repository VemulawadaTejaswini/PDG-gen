import java.util.*;
import java.io.*;

public class Main {
    static int k;
    static int[] heights;
    static int[] dp;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //BufferedReader br = new BufferedReader(new FileWriter("frog2.in");
        //StringTokenizer st = new StringTokenizer(br.readLine());
        //PrintWriter pw = new PrintWriter("frog2.out");

        int n = sc.nextInt();
        k = sc.nextInt();

        heights = new int[n+1];
        dp = new int[n+1];
        Arrays.fill(dp, -1);
        for(int x = 1; x<=n; x++){
            heights[x] = sc.nextInt();
        }
        System.out.println(jump(n));
        //System.out.println(Arrays.toString(heights));


    }

    public static int jump(int n){
        if(dp[n] != -1)
            return dp[n];
        if(n == 1)
            return dp[n] = 0;
        int min = Integer.MAX_VALUE;
        for(int x = k; x >= 1; x--){
            if(n - x >= 1){
                min = Math.min(min, jump(n - x) + Math.abs(heights[n] - heights[n - x]));
            }
        }

        return dp[n] = min;
    }
}
