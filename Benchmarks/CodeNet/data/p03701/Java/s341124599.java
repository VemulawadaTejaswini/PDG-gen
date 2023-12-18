import java.util.*;
import java.lang.*;
 
// class Pair implements Comparable<Pair>{
//   long a;
//   int cnt;
//   public Pair(long i, int j){
//     this.a = i;
//     this.cnt = j;
//   }
//   public int compareTo(Pair p){
//     if(this.cnt>=2 && p.cnt >=2 && this.a<p.a) return -1;
//     if(this.cnt<2 && p.cnt>=2) return -1;
//     return 1;
//   }
// }
 
class Main{
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int N = Integer.parseInt(sc.next());
      int[] a = new int[N];
      for(int i=0; i<N; i++) a[i] = Integer.parseInt(sc.next());
      System.out.println(func(a,N));
  }
  static int func(int[] ar, int n){
      boolean[][] dp = new boolean[n+1][10000];
      dp[0][0] = true;
      for(int i = 0; i<n; i++){
        for(int j = 0; j<10000; j++){
          if(dp[i][j]){
            //System.out.println(i+" "+j);
            dp[i+1][j] = true;
            if(j+ar[i]<10001) dp[i+1][j+ar[i]] = true;
          }
        }
      }
      int res = 0;
      for(int i = 0; i<10000; i++)
        if(dp[n][i] && i%10!=0) res = Math.max(res, i);
      return res;
  }
}