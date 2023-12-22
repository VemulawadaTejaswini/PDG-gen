import java.util.*;
import java.io.*;
import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int m = sc.nextInt();
		int x = sc.nextInt();
		int[] c = new int[n];
		int[][] a = new int[n][m];
		for(int i = 0; i < n; i++){
		    c[i] = sc.nextInt();
		    for(int j = 0; j < m; j++){
		        a[i][j] = sc.nextInt();
		    }
		}
		
		// 計算
		int result = Integer.MAX_VALUE;
		for(int i = 0; i < (1<<n); i++){
		    int[] r = new int[m];
		    int cost = 0;
		    for(int j = 0; j < n; j++){
		        if(((i>>j)&1) == 1){
		            cost += c[j];
		            for(int k = 0; k < m; k++){
		                r[k] += a[j][k];
		            }
		        }
		    }
		    boolean flg = true;
		    for(int j = 0; j < m; j++){
		        if(r[j] < x) flg = false;
		    }
		    if(flg) result = min(result, cost);
		}
		if(result == Integer.MAX_VALUE) result = -1;
		
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

