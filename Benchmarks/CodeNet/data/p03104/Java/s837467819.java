import java.io.*;
import java.util.*;

public class Main{

	
	static long solve(long r,int idx) {
		if(r<=0)
			return 0;
		long ans=0,z=1L<<idx;
		for(int bit=60;bit>=0;bit--) {
			long x=1L<<bit;
			if(bit==idx || (r&x)==0)
				continue;
			if(bit<idx && (r&z)==0)
				break;
			if(bit>idx)
				ans+=x>>1;
			else
				ans+=x;
				
		}
		if((z&r)>0)
			ans++;
		return ans;
	}
	
	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner();
		PrintWriter out=new PrintWriter(System.out);
		
		long L=sc.nextLong(),R=sc.nextLong();
		long ans=0;
		for(int bit=60;bit>=0;bit--) {
			long x=solve(R,bit)-solve(L-1,bit);
			if(x%2==1)
				ans+=1L<<bit;
		}
		out.println(ans);
	
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
