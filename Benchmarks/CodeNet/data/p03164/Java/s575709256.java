import java.util.*;

public class Main{
  public static long wt[]=new long[101];
  public static int v[]=new int[101];
  public static int n;
  public static long w;
  public static long dp[][]=new long[101][1001];
  public static long go(int value,int index){
    if(index==n){
      if(value==0)
      return 0;
      else
      return 1000000000;
    }
    if(dp[index][value]!=-1){
    return dp[index][value];
    }
    if(v[index]<=value){
      dp[index][value]=Math.min(wt[index]+
        go(value-v[index],index+1),go(value,index+1));
    }
    else{
      dp[index][value]=go(value,index+1);
    }
    return dp[index][value];
  }
  public static long solve(int sum){
    for(int i=0;i<=n;i++){
      for(int j=0;j<=sum;j++)
      dp[i][j]=-1;
    }
    for(int i=sum;i>=0;i--){
      if(go(i,0)<=w){
        return i;
      }
    }
    return 0;
  }
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in); 
    n=sc.nextInt();
    w=sc.nextInt();
    int sum=0;
    for(int i=0;i<n;i++)
    {
      wt[i]=sc.nextLong();
      v[i]=sc.nextInt();
      sum+=v[i];
    }
    System.out.println(solve(sum));
  }
}