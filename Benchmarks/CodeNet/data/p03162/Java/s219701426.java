import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int a[] = new int[N];
    int b[] = new int[N];
    int c[] = new int[N];
    int dp[][] = new int[N][3];
    int ans[] = new int[N];
    for(int i=0;i<N;i++){
      a[i]=sc.nextInt();
      b[i]=sc.nextInt();
      c[i]=sc.nextInt();
    }
    dp[0][0]=a[0];
    dp[0][1]=b[0];
    dp[0][2]=c[0];
 //   ans[0]=Math.max(a[0],b[0],c[0]);
    for(int i=1;i<N;i++){
      dp[i][0]=Math.max(dp[i-1][1]+a[i],dp[i-1][2]+a[i]);
      dp[i][1]=Math.max(dp[i-1][0]+b[i],dp[i-1][2]+b[i]);      
      dp[i][2]=Math.max(dp[i-1][0]+c[i],dp[i-1][1]+c[i]);      
    }
    
    System.out.println(Math.max(Math.max(dp[N-1][0],dp[N-1][1]),dp[N-1][2]));
    
  }
  

  
}