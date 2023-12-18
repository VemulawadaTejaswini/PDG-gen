
import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import java.text.*;
public class Main{
   
    static PrintWriter w=new PrintWriter(System.out);
    public static void main(String [] args){
        DecimalFormat dm=new DecimalFormat("0.000000");
        Scanner sc=new Scanner(System.in);
//        int t=sc.nextInt();
//    	 while(t-->0){
//    	     int n=sc.nextInt();
//    	     int arr[]=new int[n];
//    	     for(int i=0;i<n;i++){
//    	         arr[i]=sc.nextInt();
//    	     }
//    	     int or[][]=new int[n+1][2];
//    	     for(int i=0;i<n-1;i++){
//    	         or[i][0]=arr[i];
//    	         or[i][1]=arr[i+1];
//    	     }
//    	     long sum=0;
//    	     for(int j=n-1;j>=2;j--){
//    	         long min=Long.MAX_VALUE;
//    	         int index=0;
//    	         for(int i=0;i<j-1;i++){
//    	             if(or[i][0]*or[i+1][1]<min){
//    	                 min=or[i][0]*or[i+1][1];
//    	                 index=i;
//    	             }
//    	         }
//    	         sum+=((long)or[index][0]*or[index][1]*or[index+1][1]);
//    	         or[index][1]=or[index+1][1];
//    	         for(int i=index+1;i<n-1;i++){
//    	             or[i][0]=or[i+1][0];
//    	             or[i][1]=or[i+1][1];
//    	         }
//    	     }
//    	     System.out.println(sum);
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
    	 
        w.close();
    }
}