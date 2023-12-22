import java.util.*;
import java.io.*;
import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int[][] ab = new int[n][2];
		for(int i = 0; i < n; i++){
		    ab[i][0] = sc.nextInt();
		    ab[i][1] = sc.nextInt();
		}
		
		// 計算
		int result = 0;
		int from = 0;
		int to = 0;
		if(n%2 == 1){
		    Arrays.sort(ab, (s, t) -> Integer.compare(s[0], t[0]));
		    from = ab[n/2][0];
		    Arrays.sort(ab, (s, t) -> Integer.compare(s[1], t[1]));
		    to = ab[n/2][1];
		}else{
		    Arrays.sort(ab, (s, t) -> Integer.compare(s[0], t[0]));
		    from = ab[n/2-1][0] + ab[n/2][0];
		    Arrays.sort(ab, (s, t) -> Integer.compare(s[1], t[1]));
		    to = ab[n/2-1][1] + ab[n/2][1] ;
		}
		result = to-from+1;
		
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
