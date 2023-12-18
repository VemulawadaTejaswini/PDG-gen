import java.util.*;
class Main{
  public static int knapsack(long[] wt,long[] val,int w,int n)
  {
    int[][] t = new int[n+1][w+1];
    for(int i=0;i<n+1;i++)
    {
      for(int j=0;j<w+1;j++)
      {
        if(i==0||j==0)
          t[i][j]=0;
      }
    }
    
    for(int i=1;i<n+1;i++)
    {
      for(int j=1;j<w+1;j++)
      {
        if(wt[i-1]<=j)
          t[i][j]=Math.max(val[i-1]+t[i-1][j-wt[i-1]],t[i-1][j]);
        else
          t[i][j]=t[i-1][j];
      }
    }
    return t[n][w];
  }
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    int w=sc.nextInt();
    long[] wt = new long[n];
    long[] val = new long[n];
    for(int i=0;i<n;i++)
    {
     wt[i]=sc.nextLong();
     val[i]=sc.nextLong();
    }
    System.out.println(knapsack(wt,val,w,n));
  }
}
