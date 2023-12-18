import java.util.Scanner;
class Main{
	public static void main(String args[])
    {
    	Scanner sc=new Scanner(System.in);
      	int n=sc.nextInt();
      	int arr[]=new int[n];
      	for(int i=0;i<n;i++){
        	arr[i]=sc.nextInt();
          	if(i == 0)	dp[i]=0;
          	else if(i ==1) dp[i]=arr[i]-arr[i-1];
          	else{
            	int m = dp[i-1];
              	int n = dp[i-2];
              	if(m< n) dp[i]=m+Math.abs((arr[i]-arr[i-1]));
              	else dp[i]=n+Math.abs((arr[i]-arr[i-2]));
            }
        }
      System.out.println(dp[n-1]);
    }
}