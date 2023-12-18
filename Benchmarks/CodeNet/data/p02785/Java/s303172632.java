import java.io.*;
import java.util.*;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Main
{
	public static void main(String []args)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String []s=br.readLine().split(" ");
		int N = Integer.parseInt(s[0]);
		long K = Long.parseLong(s[1]);
		long sum=0,ans=0;
		long a[]=new long[N];
		
		s=br.readLine().split(" ");
		for(int i=0;i<N;i++)
			a[i]=Long.parseLong(s[i]);
		
		Arrays.sort(a);
		
		if(K>=N)
			ans=0;	
				
		else 
		{
			for(int i=0;i<N-K;i++)
				sum+=a[i];
			ans=sum;
		}
		
		
		out.println(ans);
	
	}
}


