import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	static long MOD = 1000000007;
	static class node
	{
		int h, b, idx;
		node(int h, int b, int idx)
		{
			this.h=h;
			this.b=b;
			this.idx=idx;
		}
	}

	static class sorting implements Comparator<node>
	{
		@Override
		public int compare(node n1, node n2)
		{
			return n1.h-n2.h;
		}
	}

	static void updateBIT(long bit[], int idx, long val)
	{
		while(idx<bit.length)
		{
			bit[idx]=Math.max(bit[idx], val);
			idx+=(idx&(-idx));
		}
	}

	static long queryBIT(long bit[], int idx)
	{
		long ans=0;
		while(idx>0)
		{
			ans=Math.max(ans, bit[idx]);
			idx-=(idx&(-idx));
		}
		return ans;
	}

	public static void main(String[] args)
	{
		FastReader scan=new FastReader();
		int n=scan.nextInt();
		int h[]=new int[n];
		int b[]=new int[n];

		ArrayList<node> ar=new ArrayList<>();

		for(int i=0;i<n;i++)
			h[i]=scan.nextInt();

		for(int i=0;i<n;i++)
			b[i]=scan.nextInt();

		for(int i=0;i<n;i++)
		{
			node newnode=new node(h[i], b[i], i+1);
			ar.add(newnode);
		}
		
		Collections.sort(ar, new sorting());

		long bit[]=new long[n+2];
		long ans=0;

		for(int i=0;i<n;i++)
		{
			node curr = ar.get(i);
			long get = queryBIT(bit, curr.idx-1);

			ans = Math.max(ans, get+curr.b);

			updateBIT(bit, curr.idx, (long)(get+curr.b));
		}

		System.out.println(ans);

	}


static class FastReader
{
    BufferedReader br;
    StringTokenizer st;
 
    public FastReader()
    {
        br = new BufferedReader(new
                InputStreamReader(System.in));
    }
 
    String next()
    {
        while (st == null || !st.hasMoreElements())
        {
            try
            {
                st = new StringTokenizer(br.readLine());
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
        return st.nextToken();
    }
 
    int nextInt()
    {
        return Integer.parseInt(next());
    }
 
    long nextLong()
    {
        return Long.parseLong(next());
    }
 
    double nextDouble()
    {
        return Double.parseDouble(next());
    }
 
    String nextLine()
    {
        String str = "";
        try
        {
            str = br.readLine();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        return str;
    }
}



}
