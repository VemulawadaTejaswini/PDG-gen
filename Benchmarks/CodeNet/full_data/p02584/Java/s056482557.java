import java.util.*;
import java.io.*;
import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		long x = sc.nextLong();
		long k = sc.nextLong();
		long d = sc.nextLong();
		
		// 計算
		long result = 0;
		long c = abs(x)/d;
		if(k <= c){
		    result = abs(x) - d*k;
		    //System.out.println("a");
		}else{
		    if((k-c)%2 == 0){
		        result = abs(x) - d*c;
		    }else{
		        result = abs(abs(x) - d*c - d);
		    }
		    //System.out.println("b");
		}
		
		
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
