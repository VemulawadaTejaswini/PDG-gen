


import java.util.Scanner;
public class Main{
 
   
  public static void main(String[] args)
  {
     

    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
    	arr[i]=s.nextInt();
	  
    int dp[]=new int[n];
    
    	
    dp[0]=0;
    dp[1]=Math.abs(arr[0]-arr[1]);
    
    if(n>2) {
    dp[2]=Math.min(Math.abs(arr[2]-arr[1]), Math.abs(arr[1]-arr[0]));
    for(int i=2;i<n;i++)
    {
	   dp[i]=Math.min(dp[i-1]+Math.abs(arr[i]-arr[i-1]), dp[i-2]+Math.abs(arr[i]-arr[i-2]));
	   
    }
    }
    System.out.print(dp[n-1]);
    s.close();
  }
}