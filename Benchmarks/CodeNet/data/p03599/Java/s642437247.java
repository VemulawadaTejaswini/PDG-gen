import java.util.*;
 
class Main {
    void solve(){
        Scanner in = new Scanner(System.in);
        int A = in.nextInt() * 100, B = in.nextInt() * 100, C = in.nextInt(),
            D = in.nextInt(), E = in.nextInt(), F = in.nextInt();
        int wMax = (int)((double)F / (100 + E) * 100);
        int[] dp = new int[wMax + 1];
        for(int i = 0; i < dp.length; i++){
            if(i - A >= 0) dp[i] = Math.max(dp[i], dp[i - A] + A);
            if(i - B >= 0) dp[i] = Math.max(dp[i], dp[i - B] + B);
        }
        int w = dp[wMax];
        int sMax = (int)(((double)w / (100 + E)) * E);
        //System.out.println(sMax);
        dp = new int[sMax + 1];
        for(int i = 0; i < dp.length; i++){
            if(i - C >= 0) dp[i] = Math.max(dp[i], dp[i - C] + C);
            if(i - D >= 0) dp[i] = Math.max(dp[i], dp[i - D] + D);
        }
        int s = dp[sMax];
        //System.out.println(dp[200]);
        System.out.println(w+s + " " + s);


        
    }
    public static void main(String[] args) {
        new Main().solve();
    }
}