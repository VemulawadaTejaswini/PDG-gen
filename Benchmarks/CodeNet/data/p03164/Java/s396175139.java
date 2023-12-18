import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    long W = sc.nextInt();
    final int V = 1000;
    long[] w = new long[N];
    int[] v = new int[N];
    for(int i = 0; i < N; i++){
      w[i] = sc.nextLong();
      v[i] = sc.nextInt();
    }
    long[][] memo = new long[N+1][N*V+1];
    for(int i = 0; i <= N; i++){
      Arrays.fill(memo[i], 10000000000L);
      memo[i][0] = 0;
    }
    System.out.println(solve(memo, w, v, W, N));
  }
  
  public static long solve(long[][] memo, long[] w, int[] v, long W, int N){
    for(int i = 1; i < memo.length; i++){
      for(int j = 0; j < memo[i].length; j++){
        memo[i][j] = memo[i-1][j]; 
        if(j - v[i-1] >= 0){
          memo[i][j] = Math.min(memo[i][j], memo[i-1][j-v[i-1]] + w[i-1]);
        }
      }
    }
    for(int i = memo[N].length-1; i >=0; i--){
      if(memo[N][i] <= W){
        return i;
      }
    }
    return 0;
  }
}