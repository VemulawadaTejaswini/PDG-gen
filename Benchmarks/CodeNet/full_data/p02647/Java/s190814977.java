import java.util.*;
import java.io.*;
import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++){
		    a[i] = sc.nextInt();
		}
		
		// 計算
		//String result = "NO";
		for(int i = 0; i < min(k, 100); i++){
		    int[] b = new int[n];
		    for(int j = 0; j < n; j++){
		        int cnt = a[j];
		        int from = max(0, j-cnt);
		        int to = min(n-1, j+cnt);
		        b[from]++;
		        if(to+1 < n) b[to+1]--;
		    }
		    for(int j = 0; j < n; j++){
		        if(j == 0) a[j] = b[j];
		        if(j > 0) a[j] = b[j] + a[j-1];
		    }
		}
		
		// 出力
		for(int i = 0; i < n; i++){
		    System.out.print(a[i] + " ");
		}
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
