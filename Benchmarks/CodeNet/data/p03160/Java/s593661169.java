import java.util.*;
public class Main
{
  public static void main(String[] args)
  {
     Scanner  s= new Scanner(System.in);
    int t=s.nextInt();
     int[] arr= new int[t];
    for(int i=0;i<t;i++)
    {
     arr[i]=s.nextInt();
    }
  //  for(int j=0;j<t;j++)
   // System.out.println(arr[j]);
    int[] dp = new int[t];
    dp[0]=0;
    for(int i=1;i<dp.length;i++)
    {
      int c1=Integer.MAX_VALUE;
      int c2=Integer.MAX_VALUE;
      if((i-1)>=0)
        c1=dp[i-1]+Math.abs(arr[i-1]-arr[i]);
      if((i-2)>=0)
        c2=dp[i-2]+Math.abs(arr[i-2]-arr[i]);
 //     System.out.println(c1+" "+c2+" "+i);
      dp[i]= Math.min(c1,c2);
    }
  //  for(int i=0;i<dp.length;i++)
//    System.out.print(dp[i]+" ");
    System.out.println(dp[dp.length-1]);
  }
}
