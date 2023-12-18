import java.util.*;

public class Main
{
	static Map<Integer,Integer> m;
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int h[]=new int[n];
		for(int i=0;i<n;i++)
		{
			h[i]=sc.nextInt();
		}
		m=new HashMap<Integer,Integer>();
		System.out.println(dp(0,h));
	}
	
	static int dp(int i,int arr[])
	{
		if(m.containsKey(i))
			return m.get(i);
		int returnVal=-1;
		if(i==arr.length-1)
			returnVal=0;
		else if(i==arr.length-2)
			returnVal=abs(arr[i]-arr[i+1]) + dp(i+1,arr);
		else
			returnVal=min(abs(arr[i]-arr[i+1]) + dp(i+1,arr),abs(arr[i]-arr[i+2]) + dp(i+2,arr));
		m.put(i,returnVal);
		return returnVal;
	}	
	
	static int min(int a,int b)
	{
		if(a<b)
			return a;
		return b;
	}
	
	static int abs(int a)
	{
		if(a<0)
			return a*-1;
		else
			return a;
	}
}