import java.util.*;
import java.math.*;
import java.io.*;

public class Main{
  public static void main(String agrgs[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int k=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    int dp[]=new int[n];
    Arrays.fill(dp,Integer.MAX_VALUE);
    dp[0]=0;
    for(int i=0;i<n-1;i++){
     	for(int j=i+1;j<=i+k&&j<n;j++){
     	    
     	    dp[j]=Math.min(Math.abs(arr[i]-arr[j])+dp[i],dp[j]);
     	}
    }
    System.out.println(dp[n-1]);
  }
}
