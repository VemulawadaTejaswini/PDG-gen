import java.io.*;
import java.util.*;
class Main
{
    static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	static FastScanner sc=new FastScanner(br);
    static PrintWriter out=new PrintWriter(System.out);
	static Random rnd=new Random();
	static long[][] dp;
	static Map<Long,Integer> m1=new HashMap<>();
	
    public static void main(String args[]) throws Exception
    {
		dp=new long[52][52];dp[0][0]=1;
		
		for(int i=1;i<52;i++)
		{
			for(int j=0;j<52;j++)
			{
				dp[i][j]=dp[i-1][j];
				
				if(j>0)
				{
					dp[i][j]+=dp[i-1][j-1];
				}
			}
		}
		
		int n=sc.nextInt(),a1=sc.nextInt(),b1=sc.nextInt();long[] a=new long[n];double max=-1;
		
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		
		
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextLong();m1.put(a[i],m1.getOrDefault(a[i],0)+1);
		}
		
		
		Arrays.sort(a);double val1=0,val2=0;
		
		for(int i=n-1;i>=0;i--)
		{
			val1+=a[i];val2++;
			
			if(val2>=a1 && val2<=b1)
			{
				double now=val1/val2;
				
				if(now>max)
				{
					max=now;al.clear();al.add(i);
				}
				else if(now==max)
				{
					al.add(i);
				}
			}
		}
		
		long res=0;
		
		for(int i=0;i<al.size();i++)
		{
			int k=al.get(i);Map<Long,Integer> m2=new HashMap<>();
			
			for(int j=n-1;j>=k;j--)
			{
				m2.put(a[j],m2.getOrDefault(a[j],0)+1);
			}
			
			long curr=1;
			
			for(Map.Entry<Long,Integer> en:m2.entrySet())
			{
				int x=m1.get(en.getKey()),y=en.getValue();
				
				curr=(curr*dp[x][y]);
			}
			
			res=res+curr;
		}
		
		out.printf("%.10f \n%d\n",max,res);out.close();
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