import java.util.*;
public class Main{
    public static void main(String args[]) {
    
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    
    for(int i =0; i<n;i++)
    arr[i] = sc.nextInt();
   
      System.out.println(dpc(arr,n));
      
      
    }
    
    static int min(int[] arr, int n)
    { 
        if(n==1) return 0;
        if(n==2) return Math.abs(arr[n-1]-arr[n-2]);
            int op1 = Math.abs(arr[n-1]-arr[n-2]) +min(arr,n-1);
            int op2 = Math.abs(arr[n-1]-arr[n-3]) +min(arr,n-2);
          int res = Math.min(op1, op2);
          
          return res;
    }
    
    static int dpc(int[] a, int n)
    {
        int[] dp = new int[n];
        
    dp[0]=0;
    dp[1]=Math.abs(a[0]-a[1]);
    for(int i =2;i<n;i++)
    {
             dp[i] = Math.min(Math.abs(a[i] - a[i - 1]) + dp[i - 1], Math.abs(a[i] - a[i - 2]) + dp[i - 2]);

    }
        
        return dp[n-1];
    }
    
}