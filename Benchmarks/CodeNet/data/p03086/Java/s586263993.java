import java.io.*;
import java.util.*;

public class Main{


	static int get(String s) {
		boolean ok=true;
		for(char c:s.toCharArray())
			if(c!='A' && c!='G' && c!='C' && c!='T')
				return 0;
		return s.length();
	}
	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner();
		PrintWriter out=new PrintWriter(System.out);
		String s=sc.next();
		int ans=0;
		for(int l=0;l<s.length();l++)
			for(int r=l;r<s.length();r++)
				ans=Math.max(ans, get(s.substring(l, r+1)));
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
