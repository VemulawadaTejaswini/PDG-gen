import java.io.*;
import java.util.*;

public class Main{


	
	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner();
		PrintWriter out=new PrintWriter(System.out);
		int A=sc.nextInt(),B=sc.nextInt(),Q=sc.nextInt();
		TreeSet<Long>S=new TreeSet(),T=new TreeSet();
		long INF=(long)1e13;
		S.add(INF);
		S.add(-INF);
		T.add(INF);
		T.add(-INF);
		while(A-->0)
			S.add(sc.nextLong());
		while(B-->0)
			T.add(sc.nextLong());
		while(Q-->0) {
			long x=sc.nextLong();
			long s1=S.lower(x),s2=S.higher(x),t1=T.lower(x),t2=T.higher(x);
			long d1=x-s1,d2=t2-x;
			long op=2*Math.min(d1,d2)+Math.max(d1, d2);
			d1=x-t1;
			d2=s2-x;
			op=Math.min(op, 2*Math.min(d1,d2)+Math.max(d1, d2));
			out.println(Math.min(x-Math.min(s1,t1),Math.min(Math.max(s2, t2)-x,op)));
		}
		
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
