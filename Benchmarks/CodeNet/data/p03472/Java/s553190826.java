import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static long []damage;
public static long numThrows(long l)

{
	
	int lo=0;int hi=damage.length-1;
	
	long ans=-1;
	while(lo<=hi)
	{
		int mid=(lo+hi)/2;
		
		if(damage[mid]<l)
			lo=mid+1;
		else
		{
			ans=mid;
			hi=mid-1;
		}
	}
	return ans;
	
}
	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		
		
		long maxHit=0;
		
		int n=sc.nextInt();
		long h=sc.nextInt();
		int []thros=new int [n];
		for(int i=0;i<n;i++)
		{
			int a=sc.nextInt();
			int b=sc.nextInt();
			maxHit=Math.max(maxHit, a);
			thros[i]=b;
		}
		Arrays.sort(thros);
		damage=new long [n+1];
		damage[1]=thros[n-1];
		for(int i=2;i<=n;i++)
		{
			damage[i]=damage[i-1]+thros[n-i];
		}
		
		
		long lo=0;
		long hi=(long)(1e9);
		long min=(long) (1e19);
		while(lo<=hi)
		{
			long mid=(lo+hi)/2;
			long x=numThrows(h-maxHit*mid);
			if(x==-1)
			{	
				lo=mid+1;
				continue;
			}	
			if(mid+x<min)
			{
				
				min=mid+x;
				hi=mid-1;
			}
			else
				lo=mid+1;
			
		}
		
		
		System.out.println(min);
		
		
		
	}
	static class Scanner 
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
}
