import java.util.*;
import java.io.*;
import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		String a = sc.next();
		String b = sc.next();
		String c = sc.next();
		
		// 計算
		String result = "";
		int ia = 0;
		int ib = 0;
		int ic = 0;
		char next = 'a';
		while(true){
		    if(next == 'a'){
		        if(ia == a.length()){
		            result = "A";
		            break;
		        }else{
		            next = a.charAt(ia);
		            ia++;
		        }
		    }else if(next == 'b'){
		        if(ib == b.length()){
		            result = "B";
		            break;
		        }else{
		            next = b.charAt(ib);
		            ib++;
		        }
		    }else{
		        if(ic == c.length()){
		            result = "C";
		            break;
		        }else{
		            next = c.charAt(ic);
		            ic++;
		        }
		    }
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
