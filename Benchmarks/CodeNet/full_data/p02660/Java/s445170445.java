import java.io.*;
import java.util.*;
public class Main
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long n = Long.parseLong(br.readLine());
		int arr[] = new int[(int)Math.sqrt(n)+1];
		for(int i=2;i<arr.length;i++)
		{
			if(arr[i]==0){
			for(int j=i*2;j<arr.length;j+=i)
			{
				arr[j] = -1;
			}}
		}
	//	for(int i=2;i<arr.length;i++)
	//		System.out.println(i);
		long ans=0;
		for(int i=2;i<arr.length;i++)
		{
			int temp=0;long copy=n;
			if(arr[i]!=-1&&n%i==0)
			{
				while(copy%i==0)
				{
					copy/=i;
					temp++;
				}
			}
			if(temp>0)
			{
				int sum=0,k=1;
				while((k*k+1)<=temp)
					k++;
				ans += k-1;
			//	System.out.println(i+" "+temp+)
			}

		}
		if(ans!=1)
			ans++;
		System.out.println(ans);
	}
}