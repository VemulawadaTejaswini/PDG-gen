import java.util.*;

class Main{

    void solve(){
        Scanner sc = new Scanner(System.in);

        int mod = 10007;
        int n = sc.nextInt();
        String str = sc.next();
        int[] tanto = new int[n];
        for(int i=0; i<n; i++){
            if(str.charAt(i)=='J') tanto[i] = 0;
            else if(str.charAt(i)=='O') tanto[i] = 1;
            else tanto[i] = 2;
        }

        int[][] dp = new int[2][1<<3];
        int idx = 1;
        dp[0][0] = 1;
        for(int i=0; i<n; i++){
            for(int bit=0; bit<(1<<3); bit++){
                if((bit&(1<<tanto[i]))==0) continue;
                for(int bit2=0; bit2<(1<<3); bit2++){
                    if(i==0 && ((bit&1)!=1)) continue;
                    if(i!=0 && (bit&bit2)==0) continue;
                    dp[idx][bit] += dp[1-idx][bit2];
                    dp[idx][bit] %= mod;
                }
            }
            //System.out.println(Arrays.toString(dp[idx]));
            idx = 1-idx;
            Arrays.fill(dp[idx], 0);
        }

        idx = 1-idx;
        int sum = 0;
        for(int i=0; i<(1<<3); i++) sum = (sum + dp[idx][i]) % mod;
        System.out.println(sum);
    }

    public static void main(String[] args){
        new Main().solve();
    }
}