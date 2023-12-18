
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class Main{

public static int knap(int[] wt, int[] price, int i, int w,int[][] dp){
    
   if(w < 0 || i >= price.length)
       return 0;
    int a = 0;
   if(dp[i][w] > -1){
       System.out.println("used" + i + ' ' + w);
       return dp[i][w];
   
   }
    if(w >= wt[i]){

        a = price[i] + knap(wt,price,i+1,w-wt[i],dp);

    }
    
    
    int b = knap(wt,price,i+1,w,dp);
    
    dp[i][w] = Math.max(a,b);
    return dp[i][w]; 
 }

public static int knap2(int[] wt, int[] price, int n, int w,int[][] dp){
    
   if(w == 0 || n == 0)
       return 0;
    int a = 0;
   if(dp[n-1][w] > -1){
       System.out.println("used" + n + ' ' + w);
       return dp[n][w];
   
   }
    if(w >= wt[n-1]){

        a = price[n-1] + knap2(wt,price,n-1,w-wt[n-1],dp);

    }
    
    
    int b = knap2(wt,price,n-1,w,dp);
   // return Math.max(a,b);
    dp[n-1][w] = Math.max(a,b);
    return dp[n-1][w]; 
 }


public static long knap3(int[] wt, int[] price, int n, int w){
    
  
   
   long[][] dp = new long[n+1][w+1];
   for(int i = 0; i < dp.length; i++){
       for(int j=0; j< dp[0].length; j++){
            if(j == 0 || i == 0){
                //System.out.println(i + " " + j);
                dp[i][j] = 0;
            }
            else if(j >= wt[i-1]){
                dp[i][j] = Math.max(price[i-1] + dp[i-1][j-wt[i-1]],dp[i-1][j]);
            }
            
            else
                dp[i][j] = dp[i-1][j];
       }
   }
     for(int i = 0; i < dp.length; i++){
                  //  System.out.println(Arrays.toString(dp[i]));
                }
    return dp[n][w]; 
 }


public static void main(String[] args) throws Exception{ 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
                String s[] = br.readLine().split(" "); 
                int n = Integer.parseInt(s[0]);
                int w = Integer.parseInt(s[1]);
                
                int[] price = new int[n];
                int[] wt = new int[n];
                 
                for(int i = 0; i < n; i++){
                    String ss[] = br.readLine().split(" "); 
                    wt[i] = Integer.parseInt(ss[0]);
                    price[i] = Integer.parseInt(ss[1]);
                //in
                    //int w =     Integer.parseInt(s[1]);
                
                }
               //System.out.println(n);
//                int val[] = {10, 20, 30}; 
////                int wt[] = {1,1,1}; 
//                int  W = 2; 
                //int[][] dp = new int[val.length][W+1];
//                for(int i = 0; i < price.length; i++){
//                    Arrays.fill(dp[i],-1);
//                }
               // int l = val[3];
    
//                System.out.println(knap2(wt,val,3,W,dp));
                    System.out.println(knap3(wt,price,n,w));
//                  for(int i = 0; i < dp.length; i++){
//                    System.out.println(Arrays.toString(dp[i]));
//                }
              
	} 
} 

