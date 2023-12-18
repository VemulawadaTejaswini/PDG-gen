import java.util.Scanner;
class Main{
	public static void main(String args[])
    {
    	Scanner sc=new Scanner(System.in);
      	int n=sc.nextInt();
      	int arr[]=new int[n];
      	int dp[]=new int[n];
      	for(int i=0;i<n;i++){
        	arr[i]=sc.nextInt();
          	if(i == 0)	dp[i]=0;
          	else if(i ==1) dp[i]=Math.abs(arr[i]-arr[i-1]);
          	else{
            	int m1 = dp[i-1]+Math.abs(arr[i]-arr[i-1]);
              	int m2 = dp[i-2]+Math.abs(arr[i]-arr[i-2]);
              	if(m1< m2) dp[i]=m1;
              	else dp[i]=m2;
            }
        }
      System.out.println(dp[n-1]);
    }
}