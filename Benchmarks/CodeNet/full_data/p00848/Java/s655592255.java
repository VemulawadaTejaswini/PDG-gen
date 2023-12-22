import java.util.*;

class Main{
 
    void solve(){
        Scanner sc = new Scanner(System.in);
         
        int max = 1200;
        boolean[] p = new boolean[max];
        for(int i=2; i<max; i++) p[i] = true;
        for(int i=2; i<Math.sqrt(max); i++){
            for(int j=i*i; j<max; j+=i) p[j] = false;
        }

        int[][] dp = new int[max][15];
        dp[0][0] = 1;
        for(int k=1; k<max; k++){
            if(!p[k]) continue;
            for(int i=max-1; i>=0; i--){
                if(i-k<0) continue;
                for(int j=14; j>=1; j--){
                    dp[i][j] += dp[i-k][j-1];
                }
            }
        }
 
        while(true){
            int n = sc.nextInt(), K = sc.nextInt();
            if(n==0 && K==0) break;
            System.out.println(dp[n][K]);
        }
    }
 
    public static void main(String[] args){
        new Main().solve();
    }
}