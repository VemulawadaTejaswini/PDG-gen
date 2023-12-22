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
		int[] a=new int[n];
		int[] b=new int[m];
		cmd=br.readLine().split(" ");
		for(int i=0;i<n;i++)
		{
			a[i]=Integer.valueOf(cmd[i]);
		}
		cmd=br.readLine().split(" ");
		for(int i=0;i<m;i++)
		{
			b[i]=Integer.valueOf(cmd[i]);
		}
		int i=0;
		int j=0;
		int cnt=0;
		while(i<n && j<m)
		{
			if(a[i]<b[j])
			{
				k=k-a[i];
				if(k<0)
					break;
				cnt++;
				i++;
			}
			else
			{
				k=k-b[j];
				if(k<0)
					break;
				cnt++;
				j++;
			}
		}
		while(i<n)
		{
			k=k-a[i];
			if(k<0)
				break;
			cnt++;
			i++;
		}
		while(j<m)
		{
			k=k-b[j];
			if(k<0)
				break;
			cnt++;
			j++;
		}
		System.out.println(cnt);
	}
}
