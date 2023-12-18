import java.util.*;
public class Main{
  public static void main(String[] args){
    int INF = (int)Math.pow(10,9);
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int[] a = new int[m];
    for(int i=0;i<m;i++)a[i]=sc.nextInt();
    int[] dp = new int[n+1];
    int[] num = {0,2,5,5,4,5,6,3,7,6};
    
    for(int i=1;i<=n;i++){
      for(int j=0;j<m;j++){
        if(i>=num[a[j]])dp[i]=Math.max(dp[i],dp[i-num[a[j]]]+1);
        else dp[i]=(-1)*INF;
      }
    }
    Arrays.sort(a,Comparator.reverseOrder());
    int res = n;
    for(int i=0;i<dp[n];i++){
      for(int j=0;j<m;j++){
        if(dp[res-num[a[j]]]==dp[res]-1){
          System.out.print(a[j]);
          res-=num[a[j]];
          break;
        }
      }
    }
    System.out.println("");
  }
}