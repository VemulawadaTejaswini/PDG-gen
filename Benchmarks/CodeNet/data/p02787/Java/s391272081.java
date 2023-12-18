import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int N = sc.nextInt();
        int[] atk = new int[N];
        int[] mp = new int[N];
        int[] dp = new int[H + 1];
        for (int i = 0; i < N ; i++) {
            int a = sc.nextInt();
            int m = sc.nextInt();
            atk[i] = a;
            mp[i] = m;
        }
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for (int i = 0; i < H ; i++) {
            if(dp[i]!=Integer.MAX_VALUE){
                for(int j=0;j < N; j++){
                    dp[Math.min(i+atk[j],H)]=
                            Math.min(
                                    dp[i]+mp[j],
                                    dp[Math.min(i+atk[j],H)]
                            );
                }
            }
        }
        System.out.println(dp[H]);
    }
}