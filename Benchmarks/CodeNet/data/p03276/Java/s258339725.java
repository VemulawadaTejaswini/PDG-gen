import java.util.*;
import java.io.*;
class Main{

	
	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		PrintWriter  out=new PrintWriter(System.out);
		int n=sc.nextInt(),k=sc.nextInt();
		long []a=new long [n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextLong();
		long ans=Long.MAX_VALUE;
		int idx=-1;
		for(int i=0;i<n;i++)
			if(a[i]>=0)
			{
				idx=i;
				break;
			}
		
		if(idx==-1)
		{
			ans=-a[n-k];
		}
		else
		{
			for(int i=idx;i+k-1<n;i++)
			{
				ans=Math.min(ans, a[i+k-1]);
			}
			for(int i=idx-1;i>=0;i--)
			{
				if(i+k-1<n)
				{
					long l=-a[i];
					long r=a[i+k-1];
					ans=Math.min(ans, Math.min(2*l+r, 2*r+l));
				}
			}
		}
		out.println(ans);
		
		
		out.close();
	}
	
	
	static class Scanner {
        StringTokenizer st;
        BufferedReader br;
 
        public Scanner(InputStream s) {
            br = new BufferedReader(new InputStreamReader(s));
        }
 
        public Scanner(FileReader s) {
            br = new BufferedReader(s);
        }
 
        public String next() throws IOException {
            while (st == null || !st.hasMoreTokens())
                st = new StringTokenizer(br.readLine());
            return st.nextToken();
        }
 
        public int nextInt() throws IOException {
            return Integer.parseInt(next());
        }
 
        public long nextLong() throws IOException {
            return Long.parseLong(next());
        }
 
        public String nextLine() throws IOException {
            return br.readLine();
        }
        public boolean ready() throws IOException {return br.ready();}
        public double nextDouble() throws IOException {return Double.parseDouble(next());}
       
    }

}