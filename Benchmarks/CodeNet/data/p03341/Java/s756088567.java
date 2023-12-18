import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	char []s=sc.nextLine().toCharArray();
	int west=0;
	for(char c:s)
		if(c=='W')
			west++;
	
	int east=n-west;
	
	int west_left=0;
	int ans=n;
	for(int i=0;i<n;i++)
	{
		int east_left=i-west_left;
	
		int east_right=east-east_left;
		
		if(s[i]=='E')
			east_right--;
		ans=Math.min(ans, west_left+east_right);
		
		
		if(s[i]=='W')
			west_left++;
				
	}
	System.out.println(ans);
	
		
		
	

	}
	static class Scanner
	{
		BufferedReader br;
		StringTokenizer st;
		public Scanner(InputStream s)
		{
			br=new BufferedReader(new InputStreamReader(s));
		}
		public Scanner(String s) throws FileNotFoundException
		{
			br=new BufferedReader(new FileReader(s));
		}
	
		public String nextLine() throws IOException
		{
			return br.readLine();
		}
		public String next() throws IOException
		{
			while(st==null || !st.hasMoreTokens())
				st=new StringTokenizer(br.readLine());
			return st.nextToken();
		}
		public int nextInt() throws IOException
		{
			return Integer.parseInt(next());
			
		}
		public double nextDouble() throws IOException
		{
			return Double.parseDouble(next());
		}
		public boolean ready() throws IOException
		{
			return br.ready();
		}
		public long nextLong() throws IOException
		{
			return Long.parseLong(next());
		}
	}
}
