import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        ArrayList<int []> key = new ArrayList<>();
        
        for(int i = 0; i < M; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = 0;
            for(int j = 0; j < b; j++){
                int d = sc.nextInt();
                c |= 1 << d - 1;
            }
            int[] array = {c, a};
            key.add(array);
        }
        
        int[] dp = new int[1 << N];
        for(int i = 0 ; i < 1 << N; i++){
            dp[i] = 2_000_000_000;
        }
        
        dp[0] = 0;
        
        for(int i = 0; i < 1 << N; i++){
            for(int j = 0; j < M; j++){
                int k = i | key.get(j)[0];
                int cost = dp[i] + key.get(j)[1];
                dp[k] = Math.min(dp[k], cost);
            }
        }
        
        System.out.println( dp[(1 << N) - 1] == 2_000_000_000 ? -1 : dp[(1 << N) -1] );
    }
}
