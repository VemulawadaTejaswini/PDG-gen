import java.io.*;
import java.util.*;
class Frog
{
  public static void main(String args[])throws IOException
   {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer tk=new StringTokenizer(tk.nextToken());
    int n=integer.parseInt(br.readLine());
    tk=new StringTokenizer(br.readLine());
    int a[]=new int[n];
    for(int i=0;i<n;i++)
    {
      a[i]=Integer.parseInt(tk.nextToken());
     }
    if(n<=2)
    {
      System.out.println(a[1]-a[0]);
      System.out.println();
    }
     int prev1=0;
     int prev2=a[1]-a[0];
    int minCost=Integer.MAX_VALUE;
    for(int i=2;i<n;i++)
    {
      minCost= Math.min(prev1+Math.abs(a[i-2] -a[i]) , prev2+ Math.abs(a[i-1]-a[i]));
      prev1=prev2;
      prev2=prev2+ Math.abs(a[i-1]-a[i])
    }
    System.out.println(minCost);
    
    
    
    
  }
  
}

    
  