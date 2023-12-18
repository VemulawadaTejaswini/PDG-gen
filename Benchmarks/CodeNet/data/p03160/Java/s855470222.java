import java.util.*;
import java.io.*;
import java.lang.*;
public class test{

public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        StringBuilder sb=new StringBuilder();
       int n=s.nextInt();
       int[] arr=new int[n];
       for(int i=0;i<n;i++){arr[i]=s.nextInt();}
        int[] dp=new int[n];
      dp[1]=Math.abs(arr[1]-arr[0]);
      for(int i=2;i<n;i++){
        dp[i]=Math.min(Math.abs(arr[i]-arr[i-1])+dp[i-1],Math.abs(arr[i]-arr[i-2])+dp[i-2]);
      }
      System.out.println(dp[n-1]);
    }
}
    
  










