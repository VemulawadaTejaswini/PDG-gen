import java.util.*;
import java.io.*;
public class Main
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=0;
		n=Integer.parseInt(br.readLine());
		String brr[]=br.readLine().split(" ");
		long arr[]=new long[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=Long.parseLong(brr[i]);
		}
		long ans=0;
		for(int i=1;i<n;i++)
		{
			if(arr[i-1]>arr[i])
			{
				ans+=Math.abs(arr[i]-arr[i-1]);
				arr[i]+=Math.abs(arr[i]-arr[i-1]);
			}
		}
		System.out.println(ans);
	}
}		