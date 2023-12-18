import java.util.*;
import java.io.*;
import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int k = sc.nextInt();
		boolean[] list = new boolean[10];
		for(int i = 0; i < k; i++){
		    int d = sc.nextInt();
		    list[d] = true;
		}
		
		// 計算
		//String result = "NO";
		while(true){
		    String s = Integer.toString(n);
		    for(int i = 0; i < s.length(); i++){
		        int j = s.charAt(i)-'0';
		        if(list[j]) break;
		        if(i == s.length()-1){
		            System.out.println(n);
		            return;
		        }
		    }
		    n++;
		}
		
		// 出力
		//System.out.println(result);
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

