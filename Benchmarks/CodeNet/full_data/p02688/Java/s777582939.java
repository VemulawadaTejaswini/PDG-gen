import java.util.*;
public class Main
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int k=sc.nextInt();
    int a[]=new int[n];
    int c=0;
    for(int j=0;j<n;j++)
      {
       a[j]=0;
      }
    for(int i=1;i<=k;i++)
    {
      int d=sc.nextInt();
      for(int j=0;j<d;j++)
      {
        int x=sc.nextInt();
        a[x-1]=1;
      }
    }
    for(int j=0;j<n;j++)
      {
       if(a[j]==0)
         c++;
      }
      System.out.println(c);
    
  }
}