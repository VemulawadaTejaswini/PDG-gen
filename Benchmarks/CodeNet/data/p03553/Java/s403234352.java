import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
class Main {
	static int []a;static boolean []smashed;static int n;
public static long getBenefit(int first)
{
	long benefit=0;
	
	
	for(int i=1;i*first<=n;i++)
	{	
		int j=i*first;
		if(!smashed[j])
			benefit+=a[j];
	}	
	if(benefit<0)
	{
		for(int i=1;i*first<=n;i++)
			
			smashed[i*first]=true;
	}
	return benefit;
}
	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in );
		
		boolean neg=false;
		long sum=0;
		 n=sc.nextInt();
		
		a=new int [n+1];
		for(int i=1;i<=n;i++)
		{
			a[i]=sc.nextInt();
			if(a[i]<0)
				neg=true;
			sum+=a[i];	
				
			
		}
		
		long max=Math.max(sum, 0);
		if(!neg)
		{
			System.out.println(sum);
			return ;
		}
		smashed=new boolean [n+1];
		for(int i=1;i<=n;i++)
		{
			if(a[i]<0 && !smashed[i])
			{
				long x=getBenefit(i);
				
				if(x<0)
				{	
					sum-=x;
					
				}	
			}
			
		
		}
		System.out.println(sum);
	}

}
class Scanner 
{
	StringTokenizer st;
	BufferedReader br;

	public Scanner(InputStream s){	br = new BufferedReader(new InputStreamReader(s));}

	public String next() throws IOException 
	{
		while (st == null || !st.hasMoreTokens()) 
			st = new StringTokenizer(br.readLine());
		return st.nextToken();
	}

	public int nextInt() throws IOException {return Integer.parseInt(next());}
	
	public long nextLong() throws IOException {return Long.parseLong(next());}

	public String nextLine() throws IOException {return br.readLine();}
	
	public double nextDouble() throws IOException
	{
		String x = next();
		StringBuilder sb = new StringBuilder("0");
		double res = 0, f = 1;
		boolean dec = false, neg = false;
		int start = 0;
		if(x.charAt(0) == '-')
		{
			neg = true;
			start++;
		}
		for(int i = start; i < x.length(); i++)
			if(x.charAt(i) == '.')
			{
				res = Long.parseLong(sb.toString());
				sb = new StringBuilder("0");
				dec = true;
			}
			else
			{
				sb.append(x.charAt(i));
				if(dec)
					f *= 10;
			}
		res += Long.parseLong(sb.toString()) / f;
		return res * (neg?-1:1);
	}
	
	public boolean ready() throws IOException {return br.ready();}


}