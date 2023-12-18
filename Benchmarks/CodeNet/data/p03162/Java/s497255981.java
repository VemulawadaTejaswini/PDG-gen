import java.util.*;

public class Main{
  public static long dp[][]=new long[100001][3];
  public static long go(long a[][],int i,int ch){
    if(i>=a.length)
    {
      return 0;
    }
    if(dp[i][ch]!=-1)
    return dp[i][ch];
    long max=0;
    if(ch==0){
    dp[i][0]=a[i][0]+Math.max(go(a,i+1,1),go(a,i+1,2));
    max=Math.max(dp[i][0],max);
    }
    if(ch==1){
    dp[i][1]=a[i][1]+Math.max(go(a,i+1,0),go(a,i+1,2));
    max=Math.max(dp[i][1],max);
    }
    if(ch==2){
    dp[i][2]=a[i][2]+Math.max(go(a,i+1,0),go(a,i+1,1));
    max=Math.max(dp[i][2],max);
    }
    return max;
  }
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in); 
    int n=sc.nextInt();
    long a[][]=new long[n][3];
    for(int i=0;i<n;i++){
    a[i][0]=sc.nextLong();
    a[i][1]=sc.nextLong();
    a[i][2]=sc.nextLong();
    dp[i][0]=-1;
    dp[i][1]=-1;
    dp[i][2]=-1;
    }
    dp[n][0]=-1;
    dp[n][1]=-1;
    dp[n][2]=-1;
    long ans=Math.max(go(a,0,0),Math.max(go(a,0,1),
      go(a,0,2)));
    System.out.print(ans);
  }
}