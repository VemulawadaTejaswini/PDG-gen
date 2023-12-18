import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	
	static class FastReader{
		BufferedReader br;
		StringTokenizer tok;
		
		FastReader(){
			br=new BufferedReader(new InputStreamReader(System.in));
		}
		
		String next() {
			if(tok==null || (!tok.hasMoreTokens())) {
				try {
					tok = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return tok.nextToken();
		}
		int nextInt() {
			return Integer.parseInt(this.next());
		}
		String nextLine() {
			String s="";
			try {
				s = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return s;
		}
	}
	
	static int[] weights;
	static int[] values;
	static HashMap<long[], Long> memo;
	public static void main(String[] args) {
		FastReader fr=new FastReader();
		int n=fr.nextInt(), w=fr.nextInt();
		weights = new int[n];
		values = new int[n];
		memo = new HashMap<>();
		for(int i=0; i<n; i++) {
			weights[i]=fr.nextInt();
			values[i]=fr.nextInt();
		}
		System.out.println(dp(n-1, w));
	}
	private static long dp(int n, int c) {
		if(n==-1 || c==0) return 0;
		if(memo.containsKey(new long[] {n, c})) return memo.get(new long[] {n,c});
		else if(weights[n]>c) return dp(n-1, c);
		else {
			long r1 = dp(n-1, c);
			long r2 = values[n] + dp(n-1, c-weights[n]);
			long res=Math.max(r1, r2);
			memo.put(new long[] {n, c}, res);
			return res;
		}
	}
}
