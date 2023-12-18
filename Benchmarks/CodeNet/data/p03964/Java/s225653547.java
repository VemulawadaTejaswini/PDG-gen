import java.util.*;
import java.io.*;
import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		
		// 計算
		long result = 0;
		long t = 0;
		long a = 0;
		for(int i = 0; i < n; i++){
		    long nt = sc.nextLong();
		    long na = sc.nextLong();
		    long tempt = nt;
		    long tempa = na;
		    long l = 0;
		    long r = 1000000000000000000L/max(nt, na);
		    while(r-l > 1){
		        long c = (l+r)/2;
		        tempt = nt*c;
		        tempa = na*c;
		        if(t > tempt || a > tempa){
		            l = c;
		        }else{
		            r = c;
		        }
		    }
		    t = nt*r;
		    a = na*r;
		}
		result = t + a;
		
		// 出力
		System.out.println(result);
	}
	
	public static class Scanner {
		private BufferedReader br; private StringTokenizer tok;
		public Scanner(InputStream is) throws IOException { br = new BufferedReader(new InputStreamReader(is));}
		private void getLine() throws IOException { while(!hasNext()) tok = new StringTokenizer(br.readLine());}
		private boolean hasNext() { return tok != null && tok.hasMoreTokens();}
		public String next() throws IOException { getLine(); return tok.nextToken();}
		public int nextInt() throws IOException { return Integer.parseInt(next());}
		public long nextLong() throws IOException { return Long.parseLong(next());}
		public double nextDouble() throws IOException { return Double.parseDouble(next());}
	}
}
