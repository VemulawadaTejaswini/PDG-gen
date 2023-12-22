import java.util.*;

class Main{

    void solve(){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        char[] tanto = sc.next().toCharArray();

        int mod = 10007;
        int[][] dp = new int[n][1<<3];

        for(int i=0; i<n; i++){
            int idx = 0;
            if(tanto[i]=='O') idx = 1;
            else if(tanto[i]=='I') idx = 2;
            for(int bit=0; bit<(1<<3); bit++){
                if(i==0 && (bit&(1<<0))==0) continue;
                if((bit&(1<<idx))==0) continue;
                if(i==0){
                    dp[i][bit] = 1;
                    continue;
                }
                for(int bit2=0; bit2<(1<<3); bit2++){
                    boolean boo = false;
                    for(int j=0; j<3; j++){
                        if((bit&(1<<j))>0 && (bit2&(1<<j))>0) boo = true;
                    }
                    if(!boo) continue;
                    dp[i][bit] += dp[i-1][bit2];
                    dp[i][bit] %= mod;
                }
            }
        }

        int sum = 0;
        for(int i=0; i<(1<<3); i++) sum = (sum + dp[n-1][i]) % mod;
        System.out.println(sum);
    }

    public static void main(String[] args){
        new Main().solve();
    }
}