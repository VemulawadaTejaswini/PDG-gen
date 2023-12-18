import java.util.*;
public class knapsack
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int c=sc.nextInt();
    long val[]=new long[n+1];
    long wt[]=new long[n+1];
    for(int i=1;i<=n;i++)
    {
      
        wt[i]=sc.nextInt();
        val[i]=sc.nextInt();
      
    }
   long[][] t=new long[n+1][c+1];
    for(int i=1;i<=n;i++)
    {
      for(int j=1;j<=c;j++)
      {
		 if(wt[i]<=j)
		 {
		 t[i][j]=Math.max(val[i]+t[i-1][(int)(c-wt[i])],t[i-1][j]);}
		 else
		 {
			 t[i][j]=t[i-1][j];
		 }
      }
    }
    System.out.println(t[n][c]);
  }
}import java.util.*;
public class knapsack
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int c=sc.nextInt();
    long val[]=new long[n+1];
    long wt[]=new long[n+1];
    for(int i=1;i<=n;i++)
    {
      
        wt[i]=sc.nextInt();
        val[i]=sc.nextInt();
      
    }
   long[][] t=new long[n+1][c+1];
    for(int i=1;i<=n;i++)
    {
      for(int j=1;j<=c;j++)
      {
		 if(wt[i]<=j)
		 {
		 t[i][j]=Math.max(val[i]+t[i-1][(int)(c-wt[i])],t[i-1][j]);}
		 else
		 {
			 t[i][j]=t[i-1][j];
		 }
      }
    }
    System.out.println(t[n][c]);
  }
}