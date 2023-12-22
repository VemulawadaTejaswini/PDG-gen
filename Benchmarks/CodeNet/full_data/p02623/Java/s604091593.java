
import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String[] cmd=br.readLine().split(" ");
		int n=Integer.valueOf(cmd[0]);
		int m=Integer.valueOf(cmd[1]);
		int k=Integer.valueOf(cmd[2]);
		long[] a=new long[n];
		long[] b=new long[m];
		cmd=br.readLine().split(" ");
		for(int i=0;i<n;i++)
		{
			a[i]=Long.valueOf(cmd[i]);
		}
		cmd=br.readLine().split(" ");
		for(int i=0;i<m;i++)
		{
			b[i]=Long.valueOf(cmd[i]);
		}
		int i=0;
		int j=0;
		long ans=0;
		int cnt=0;
		while(i<n && j<m)
		{
			if(a[i]<b[j])
			{
				if(ans+a[i]>k)
					break;
				ans=ans+a[i];
				cnt++;
				i++;
			}
			else
			{
				if(ans+b[j]>k)
					break;
				ans=ans+b[j];
				cnt++;
				j++;
			}
		}
		while(i<n)
		{
			if(ans+a[i]>k)
				break;
			ans=ans+a[i];
			cnt++;
			i++;
		}
		while(j<m)
		{
			if(ans+b[j]>k)
				break;
			ans=ans+b[j];
			cnt++;
			j++;
		}
		System.out.println(cnt);
	}
}
