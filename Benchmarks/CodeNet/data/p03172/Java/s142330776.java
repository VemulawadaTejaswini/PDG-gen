//package javaapplication9;
import java.util.*;
import java.io.*;
public class Main{

 public static int candies(int n, int k, int arr[]){
     
    if(n < 0 || k < 0)
        return 0;
     if(k == 0 && n == 0)
         return 1;
  
     int a = 0;
     
     for(int i = 0; i <= arr[n]; i++){
      a +=candies(n-1,k-i,arr);
     }
     
     return  a;
    

 
 } 
    public static void main(String[] args) throws Exception {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));   
         StringTokenizer str  = new StringTokenizer(br.readLine()," ");
    
      int n  = Integer.parseInt(str.nextToken());
    int k  = Integer.parseInt(str.nextToken());
    int[] arr = new int[n+1];
    str  = new StringTokenizer(br.readLine()," ");
    int i = 1;
    while(str.hasMoreTokens()){
        arr[i] = Integer.parseInt(str.nextToken());
    i++;
    }
 
    int[][] dp = new int[n+1][k+1];
      for(int ii = 0; ii < dp.length; ii++){
      Arrays.fill(dp[ii],-1);
      }
      System.out.println(candies(n,k,arr ) );
    
    
    }
    
}
