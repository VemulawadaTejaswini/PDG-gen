import java.io.*;
import java.util.*;
import java.math.*;
import java.util.concurrent.*;

class Main
{
    static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	static FastScanner sc=new FastScanner(br);
    static PrintWriter out=new PrintWriter(System.out);
	static Random rnd=new Random();
	
    public static void main(String args[]) throws Exception
    {
		int n=sc.nextInt();long k=sc.nextLong();long[] a=new long[n],b=new long[n];
		
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextLong();b[i]=sc.nextLong();
		}
		
		List<Long> list=new ArrayList<>();list.add(k);long now=0;
		
		for(int i=29;i>=0;i--)
		{
			if((k&(1<<i))!=0)
			{
				long add=(1<<i)-1;
				
				list.add(now|add);
				
				now=now+(1<<i);
			}
		}
		
		long max=0;
		
		for(int i=0;i<list.size();i++)
		{
			long curr=0;now=list.get(i);
			
			List<Integer> list2=new ArrayList<>();
			
			for(int j=29;j>=0;j--)
			{
				if((now&(1<<j))==0)
				{
					list2.add(j);
				}
			}
			
			for(int j=0;j<n;j++)
			{
				boolean add=true;
				
				for(int x:list2)
				{
					if((a[j]&(1<<x))!=0)
					{
						add=false;break;
					}
				}
				
				if(add)
				{
					curr+=b[j];
				}
			}
			
			max=Math.max(max,curr);
		}
		
		out.println(max);out.close();
    }
}
class FastScanner
{
    BufferedReader in;
    StringTokenizer st;

    public FastScanner(BufferedReader in) {
        this.in = in;
    }
	
    public String nextToken() throws Exception {
        while (st == null || !st.hasMoreTokens()) {
            st = new StringTokenizer(in.readLine());
        }
        return st.nextToken();
    }
	
	public String next() throws Exception {
		return nextToken().toString();
	}
	
    public int nextInt() throws Exception {
        return Integer.parseInt(nextToken());
    }

    public long nextLong() throws Exception {
        return Long.parseLong(nextToken());
    }

    public double nextDouble() throws Exception {
        return Double.parseDouble(nextToken());
    }
}