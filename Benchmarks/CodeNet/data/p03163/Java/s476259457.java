import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int W = sc.nextInt();
        int [] u = new int[N];
        int [] v = new int[N];
        
        for(int i=0;i<N;i++){
            u[i] = sc.nextInt();
            v[i] = sc.nextInt();
          }
          sc.close();
         long[] dp = new long[W+1];
         for(int i=0;i<N;i++){
            for (int j = W; j >= u[i]; j--) {
			  dp[j] = Math.max(dp[j], dp[j - u[i]] + v[i]);
			}
        }
        System.out.println(dp[W]);
    }
}