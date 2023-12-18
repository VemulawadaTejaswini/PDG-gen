import java.util.*;
import java.io.*;
public class Main {
// 
// public static int frog(int arr[], int i, int prev){
//     if(i >= arr.length)
//           return 0;
//     if(i == arr.length-1)
//         return Math.abs(arr[prev]- arr[i]);
//     int a = 0; int b = 0;
//     if(prev == -1){
//        return Math.min(0+frog(arr,i+1,0),0+frog(arr,i+2,0));
//     }
//    
//     else{
//            // System.out.println(arr[prev]+ " - " + arr[i] );
//             a =   Math.abs(arr[prev] - arr[i]) + frog(arr,i+1,i);
//             b =   Math.abs(arr[prev] - arr[i]) + frog(arr,i+2,i);
//     
//     }
//  
// return Math.min(a,b);
//  
// }
 
 public static long vecation(int n, int prev, List<ArrayList<Integer>> l,long[][] dp){
 
     if(n == -1)
         return 0;
   if( dp[prev+1][n+1] > -1){
   return dp[prev+1][n+1];
   }
     long ans = 0;
     if(prev != 0){
        // System.out.println("used");
       ans = Math.max(ans,l.get(n).get(0) + vecation(n-1,0,l,dp));
     }
     
     if(prev != 1){
       ans = Math.max(ans,l.get(n).get(1) + vecation(n-1,1,l,dp));
     }
     
     if(prev != 2){
       ans = Math.max(ans,l.get(n).get(2) + vecation(n-1,2,l,dp));
     }
     
     return dp[prev+1][n+1] =  ans;
     
     
     
 }
 
 
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
        
        
        int n = Integer.parseInt(br.readLine().trim());
      long[][] dp = new long[n+10][n+10];
      for(int i = 0; i < dp.length; i++){
        Arrays.fill(dp[i],-1);
      
      }
        List<ArrayList<Integer>>  l = new ArrayList<>();
       
        for(int i = 0; i< n; i++){
            String str[] = br.readLine().split(" ");
            List<Integer> ll = new ArrayList<>();
            for(String k : str){
                
                ll.add(Integer.parseInt(k));
                
            }
            l.add(new ArrayList<>(ll));
            ll.clear();
        }
       // System.out.println(l);
            System.out.println(vecation(n-1,-1,l,dp));
        
     //   System.out.println(Arrays.toString(dp));
    }
    
}
