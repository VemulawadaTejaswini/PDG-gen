import java.util.*;
import java.io.*;
import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int MOD = 1000000007;
		
		// 計算
		long result = 1;
		HashMap<Integer, Long> map = new HashMap<Integer, Long>();
		for(int i = 1; i <= n; i++){
		    int num = i;
		    for(int m = 2; m <= sqrt(num); m++){
		        if(num == 1) break;
		        if(num%m == 0){
		            while(num%m == 0){
		                num = num/m;
		                map.put(m, map.getOrDefault(m, 0L)+1);
		            }
		        }
		    }
		    if(num != 1) map.put(num, map.getOrDefault(num, 0L)+1);
		}
		for(Long l : map.values()){
		    result *= l+1;
		    result %= MOD;
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
