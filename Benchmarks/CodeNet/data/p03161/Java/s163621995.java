import java.util.*;
import java.lang.*;
public class Main{
    public static int calc(int dp[],int arr[],int n,int k){
        dp[0]=0;
        for(int i=1;i<n;i++){
            int min=9999;
            for(int j=1;j<=k;j++){
                if(i-j>=0){
                    min=Math.min(min,Math.abs(arr[i]-arr[i-j])+dp[i-j]);
                }
                
            }
            dp[i]=min;
        }
        return dp[n-1];
    }
    public static void main(String[] args){
        int test;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int arr[]=new int[n];
        int dp[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int res=calc(dp,arr,n,k);
        System.out.println(res);
        }

    
}