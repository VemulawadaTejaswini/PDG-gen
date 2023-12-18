import java.util.*;
//Grundy numbers

public class Main{

	public static int grundy(int n,int dp[],int arr[])
	{
		if(n<=0)
			return 0;
		if(dp[n]!=-1) {
			//System.out.println("hi");
			return dp[n];}
		
		int c=0,ans=0;
		HashMap<Integer,Boolean> mp=new HashMap<>();
		for(int i=0;i<arr.length;i++)
		{
			if(n-arr[i]>=0) {
			if(dp[n-arr[i]]==-1)
			{
				dp[n-arr[i]]=grundy(n-arr[i],dp,arr);
			}
			if(!mp.containsKey(dp[n-arr[i]])) {
			mp.put(dp[n-arr[i]],true);
			}
			
		}}
		while(mp.containsKey(c))
		{c++;}
		
		//System.out.println(c);
		dp[n]=c;
		//System.out.println(n+" "+c);
		return c;
		
			}
	
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int k=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		
		int xor=0;
		int dp[]=new int[k];
		
		for(int i=0;i<arr[0];i++)
		{
			dp[i]=0;
		}
		for(int j=arr[0];j<=(k-arr[0]);j++)
		{
			dp[j]=-1;
		}
		for(int i=0;i<n;i++)
		{
			int a=grundy(k-arr[i],dp,arr);
			
			xor=xor^a;
		}
		//System.out.println(xor);
		if(xor!=0)
			System.out.println("First");
		else
			System.out.println("Second");
	}

}
