import java.util.*;
class Main{
  public static long knapsack(int[] wt,int[] val,int w,int n)
  {
    long[][] t = new long[n+1][w+1];
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
    int[] wt = new int[n];
    int[] val = new int[n];
    for(int i=0;i<n;i++)
    {
     wt[i]=sc.nextInt();
     val[i]=sc.nextInt();
    }
    System.out.println(knapsack(wt,val,w,n));
  }
}
