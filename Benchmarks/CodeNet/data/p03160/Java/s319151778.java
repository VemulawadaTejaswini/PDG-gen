import java.util.*;
import java.lang.*;
public class Main{
    public static int calc(int dp[],int arr[],int n){
        //Base case
        if(n==0)return 0;
        if(n==1) return Math.abs(arr[1]-arr[0]);    

        if(dp[n]!=0)return dp[n];



        //Recursive Approach
        int op1=Math.abs(arr[n]-arr[n-1])+calc(dp,arr,n-1);
        int op2=Math.abs(arr[n]-arr[n-2])+calc(dp,arr,n-2);
        return Math.min(op1,op2);
    }
    public static void main(String[] args){
        int test;
        Scanner sc=new Scanner(System.in);

            int n=sc.nextInt();

            int arr[]=new int[n];
            int dp[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            
            System.out.println(calc(dp,arr,n-1));
        

    }
}