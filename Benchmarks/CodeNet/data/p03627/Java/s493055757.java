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
		int n=sc.nextInt();Map<Long,Integer> m1=new HashMap<>();
		
		for(int i=0;i<n;i++)
		{
			long curr=sc.nextLong();
			
			m1.put(curr,m1.getOrDefault(curr,0)+1);
		}
		
		long max=0,curr=0;
		
		List<Long> list=new ArrayList<Long>();
		
		for(Map.Entry<Long,Integer> en:m1.entrySet())
		{
			if(en.getValue()>=4)
			{
				max=Math.max(max,en.getKey()*en.getKey());
			}
			
			if(en.getValue()>=2)
			{
				list.add(en.getKey());
			}
		}
		
		Collections.sort(list);
		
		if(list.size()>=2)
		{
			int s=list.size();
			
			max=Math.max(max,list.get(s-1)*list.get(s-2));
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