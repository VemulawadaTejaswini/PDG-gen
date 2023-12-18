import java.util.*;
import java.io.*;
public class Main {

// public static long vecation(int n, int prev, List<ArrayList<Integer>> l,long[][] dp){
// 
//     if(n == -1)
//         return 0;
//   if( dp[prev+1][n+1] > -1){
//   return dp[prev+1][n+1];
//   }
//     long ans = 0;
//     if(prev != 0){
//        // System.out.println("used");
//       ans = Math.max(ans,l.get(n).get(0) + vecation(n-1,0,l,dp));
//     }
//     
//     if(prev != 1){
//       ans = Math.max(ans,l.get(n).get(1) + vecation(n-1,1,l,dp));
//     }
////     
////     if(prev != 2){
////       ans = Math.max(ans,l.get(n).get(2) + vecation(n-1,2,l,dp));
////     }
////     
////     return dp[prev+1][n+1] =  ans;
////     
////     
////     
//// }
//
// 
// 
//// public static int candies(int n, int k, int arr[]){
////  
////     if(k == 1 && n == 1)
////         return 1;
////     else if(k == 0 || n == 0)
////         return 0;
////  
////     int a = 0;
////      for(int i = 0; i <= arr[n-1]; i++){
//////       if(k-i >= 0){
////          a +=   candies(n-1,k-i,arr);
////    //   }
////      }
////      
////      return a;
////     
//// 
//// }
//    
//    
//    
//     public static int candies(int n, int k, int arr[]){
//     
//    if(n < 0 || k < 0)
//        return 0;
//     if(k == 0 && n == 0)
//         return 1;
//     
//     int a = 0;
//        //System.out.println(n + " " + k);
//     if(n-1 >= 0){
//         for(int i = 0; i <= arr[n-1]; i++){
//      a +=candies(n-1,k-i,arr);
//  
//     }
//     
//     }
//     
//    
//    return a;
// 
// 
// }
    
      public static int candies2(int N, int K, int arr[]){
 int m = 1000000007;
          int[][] dp = new int[N+1][K+1];
          for(int n = 0; n <= N; n++){
              for(int k = 0; k <= K; k++){
                  if(k == 0 && n ==0)
                      dp[n][k] = 1;
                  else if(n-1 >= 0) {
                    
                      for(int i = 0; i <= arr[n-1]; i++){
                       if(k-i >= 0)
                          dp[n][k] += dp[n-1][k-i]% m;
                        
                      
                    }
                  }
              }
          }
          

          return dp[N][K];
 }
//    
    
    
    
    public static void main(String[] args) throws Exception {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));   
//        int n = Integer.parseInt(br.readLine());
//        int[] arr = new int[n+1];
//        StringTokenizer str  = new StringTokenizer(br.readLine()," ");
//        int i = 0;
//        while(str.hasMoreTokens()){
//            arr[i] = Integer.parseInt(str.nextToken());
//            i++;
//        }
//        
//           int[] dp = new int[arr.length];
//           Arrays.fill(dp,-1);
//           
        
        
//     s/    System.out.println(Math.pow(10, 10));
        
     //   System.out.println(Arrays.toString(dp));
         
          StringTokenizer str  = new StringTokenizer(br.readLine()," ");
    int n  = Integer.parseInt(str.nextToken());
    int k  = Integer.parseInt(str.nextToken());
    int[] arr = new int[n];
    str  = new StringTokenizer(br.readLine()," ");
    int i = 0;
    while(str.hasMoreTokens()){
        arr[i] = Integer.parseInt(str.nextToken());
    i++;
    }
 
   
      System.out.println(candies2(n,k,arr) );
    
    
    }
    
}
