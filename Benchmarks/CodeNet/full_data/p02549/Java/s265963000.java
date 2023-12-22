import java.util.*;
import java.io.*;
import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int k = sc.nextInt();
		//int[] list = new int[n+1];
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i < k; i++){
		    int l = sc.nextInt();
		    int r = sc.nextInt();
		    for(int j = l; j <= r; j++){
		        list.add(j);
		    }
		}
		Collections.sort(list);
		//System.out.println(list.toString());
		
		// 計算
		long result = 0;
		int MOD = 998244353;
		int t = 0;
		long[] sum = new long[n+1];
		sum[n] = 1;
		for(int i = 1; i <= n; i++){
		    for(int j = 0; j < list.size(); j++){
		        int now = list.get(j);
		        if(now > i) break;
		        sum[n-i] += sum[n-i+now]%MOD;
		        sum[n-i] %= MOD;
		    }
		}
		//System.out.println(Arrays.toString(sum));
		result = sum[1];
		
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
