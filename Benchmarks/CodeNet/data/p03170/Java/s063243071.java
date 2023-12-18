// "static void main" must be defined in a public class.
import java.util.*;
public class Main {
    
    static String dp(int arr[], int n) 
{ 
        boolean dp[] = new boolean[n+1];
        dp[0] = true;
        
        for(int i =1 ; i<=n;i++) {
            boolean temp = false;
            for (int j =0; j<arr.length ;j++) {
                if(i<arr[j]) {
                    continue;
                }
                dp[i] = dp[i] | dp[i-arr[j]]; 
            }
            
        }
        if(dp[n]) {
            return "First";
        }
        else {
            return "Second";
        }
  
}
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
      
           int n = s.nextInt();
            int arr[] = new int[n];
        
            for (int i = 0 ; i< n  ; i++) {
                arr[i] = s.nextInt();
            }
            
            
        
            
            System.out.println(dp(arr,n));
        
    }
}