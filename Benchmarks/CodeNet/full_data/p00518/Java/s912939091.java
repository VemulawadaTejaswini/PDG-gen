import java.util.*;

class Main{

    void solve(){
        Scanner sc = new Scanner(System.in);
        int mod = 10007;

        int n = sc.nextInt();
        int[] tanto = new int[n];
        char[] line = sc.next().toCharArray();
        for(int i=0; i<n; i++){
            if(line[i]=='J') tanto[i] = 0;
            if(line[i]=='O') tanto[i] = 1;
            if(line[i]=='I') tanto[i] = 2;
        }

        int[][] dp = new int[2][1<<3];
        dp[0][0] = 1;
        int idx = 1;
        int cnt = 0;
        for(int i=0; i<n; i++){
            for(int bit=0; bit<(1<<3); bit++){
                if((bit&(1<<tanto[i]))==0) continue;
                if(i==0){
                    if((bit&1)>0) dp[idx][bit] = 1;
                    continue;
                }
                for(int bit2=0; bit2<(1<<3); bit2++){
                    if((bit&bit2)>0){
                        dp[idx][bit] += dp[1-idx][bit2];
                        dp[idx][bit] %= mod;
                    }
                }
                if(i==n-1){
                    cnt += dp[idx][bit];
                    cnt %= mod;
                }
            }
            idx = 1-idx;
            dp[idx] = new int[1<<3];
        }
        System.out.println(cnt);
    }

    public static void main(String[] args){
        new Main().solve();
    }
}