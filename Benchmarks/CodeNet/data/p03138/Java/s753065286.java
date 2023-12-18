
import java.io.*;
import java.util.*;

public class Main{

	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner();
		PrintWriter out=new PrintWriter(System.out);
		int n=sc.nextInt();
		long k=sc.nextLong();
		long []a=new long [n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextLong();
		long value=0,num=0;
		for(int bit=60;bit>=0;bit--) {
			long x=1L<<bit;
			
			int zeros=0;
			for(long y:a)
				if((y&x)==0)
					zeros++;
			if(zeros>n-zeros && num+x<=k) {
				num+=x;
				value+=x*zeros;
			}
			else 
				value+=x*(n-zeros);
			
		}
		out.println(value);
		out.close();

	}
	
	static class Scanner
	{
		BufferedReader br;
		StringTokenizer st;
		Scanner(){
			br=new BufferedReader(new InputStreamReader(System.in));
		}
		Scanner(String fileName) throws FileNotFoundException{
			br=new BufferedReader(new FileReader(fileName));
		}
		String next() throws IOException {
			while(st==null || !st.hasMoreTokens())
				st=new StringTokenizer(br.readLine());
			return st.nextToken();
		}
		String nextLine() throws IOException {
			return br.readLine();
		}
		int nextInt() throws IOException{
			return Integer.parseInt(next());
		}
		long nextLong()  throws NumberFormatException, IOException {
			return Long.parseLong(next());
		}
		double nextDouble() throws NumberFormatException, IOException {
			return Double.parseDouble(next());
		}
	}
}
