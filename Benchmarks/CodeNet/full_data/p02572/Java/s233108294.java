import java.io.*;
import java.util.*;
class Main
{
	public static void main(String args[]) throws IOException
	{
		try{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=0;
		n=Integer.parseInt(br.readLine());
		String brr[]=br.readLine().split(" ");
		long ar[]=new long[n];
		for(int i=0;i<n;i++)
		{
			ar[i]=Long.parseLong(brr[i]);
		}
		long ans=0;
		for(int i=0;i<ar.length;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
				ans+=(long)((ar[i]*ar[j])%(1e9+7));
			}
		}
		System.out.println(ans);
	}
	catch(Exception e){}
}}
