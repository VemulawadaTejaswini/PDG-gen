
import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String []args)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int a[]=new int[n];
		int diff[]=new int[n-1];
		
		String []s=br.readLine().split(" ");
					
		for(int i=0;i<n;i++)
			a[i]=Integer.parseInt(s[i]);
			
		for(int i=0;i<n-1;i++)
			diff[i]=a[i]-a[i+1];
			
		int c=0;
		
		for(int i=0;i<n-1;i++)
		{
			if(diff[i]<0)
				c=0;
			else
				c++;
		}
		
		if(n == 1)
			System.out.println(1);
		else
			System.out.println(c);
	}
}


