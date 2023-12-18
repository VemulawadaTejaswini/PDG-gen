import java.util.*;
import java.math.*;
public class A{
  public static void main(String agrgs[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    int dp[]=new int[n];
    Arrays.fill(dp,Integer.MAX_VALUE);
    dp[0]=0;
    for(int i=0;i<n-1;i++){
     	dp[i+1]=Math.min(dp[i]+Math.abs(arr[i+1]-arr[i]),dp[i+1]);
      	if(i>=n-2)
          continue;
      	dp[i+2]=Math.min(dp[i]+Math.abs(arr[i+2]-arr[i]),dp[i+2]);
    }
    System.out.println(dp[n-1]);
  }
}
