import java.util.*;
public class Main
{
  public static void main(String[] args )
  {
    Scanner scn = new Scanner(System.in) ;
    
    int n = scn.nextInt() ;
    
    int[] arr =new int[n] ;
    
    for(int i =0 ; i < n; i++ ) arr[i] = scn.nextInt() ;
    
    
    if( n== 1 )
    {
     System.out.print(0) ; 
    }
    else{
    long[] dp = new long[n];
    
      dp[0] =  0 ; 
      dp[1] =  (long)Math.abs(arr[1] - arr[0] ) ;
      
      for(int i =2 ; i < n; i++ )
      {
        
         long opt1  =  dp[i-1] + (long)Math.abs(arr[i] - arr[i-1] ) ;
        
         long opt2  =  dp[i-2] + (long)Math.abs(arr[i] - arr[i-2] ) ;
       
        dp[i] =  Math.min(opt1 , opt2 ) ; 
        
        
     }
      
      System.out.print(dp[n-1]) ;
    
    }
    
    
    
  }
  
  
}
