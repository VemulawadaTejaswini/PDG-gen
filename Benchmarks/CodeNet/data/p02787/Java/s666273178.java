import java.util.*;

public class Main {
        public static final int INF = 1<<30;
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int[] dp = new int[1000000];
        Arrays.fill(dp,INF);
        int[] damage = new int[10010];
        int[] magic = new int[10010];
        //dp[H] ... 体力Hを減らすために必要な魔力の最小値\
        int H = Integer.parseInt(sc.next());
        int N = Integer.parseInt(sc.next());
        for(int i=0;i<N;i++){
            damage[i] = Integer.parseInt(sc.next());
            magic[i] = Integer.parseInt(sc.next());
        }
        dp[0] = 0;
      for(int i=0;i<=H;i++){
        for(int j=0;j<N;j++){
            for(int k=0;k<=damage[j];k++){
                dp[i+k] = Math.min(dp[i+k] , dp[i] + magic[j]); 
            }
        }
      }  
      System.out.println(dp[H]);
    }
}