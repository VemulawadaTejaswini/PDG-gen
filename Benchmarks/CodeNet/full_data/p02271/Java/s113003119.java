import java.util.*;
import java.io.*;

public class Main{
	final static int MOD = 1000000007;
	final static int INF = 1000000000;

	
	
	static int n;
	static int[] a;
	public static void main(String[] args) throws IOException{
		NScanner sc = new NScanner(System.in);
		n = sc.nextInt(); 
		a = new int[n];
		for(int i = 0; i < n; ++i)
			a[i] = sc.nextInt();
		int q = sc.nextInt();
		for(int i = 0; i < q; ++i){
			int m = sc.nextInt();
			System.out.println((dfs(0, m) ? "yes" : "no"));
		}
	}
	
	static boolean dfs(int idx, int remain){
		if(remain == 0) return true;
		if(remain < 0) return false;
		if(idx >= n) return false;
		return dfs(idx+1, remain) || dfs(idx+1, remain-a[idx]);
	}

}


class NScanner{

	private BufferedReader br;
	private StringTokenizer tok;

	public NScanner(InputStream is) throws IOException{
		br = new BufferedReader(new InputStreamReader(is));
		getLine();
	}

	private void getLine() throws IOException{
		while(tok == null || !hasNext()){
			tok = new StringTokenizer(br.readLine());
		}
	}

	public boolean hasNext(){
		return tok.hasMoreTokens();
	}

	public String next() throws IOException{
		if(hasNext()){
			return tok.nextToken();
		}else{
			getLine();
			return tok.nextToken();
		}
	}

	public int nextInt() throws IOException{
		if(hasNext()){
			return Integer.parseInt(tok.nextToken());
		}else{
			getLine();
			return Integer.parseInt(tok.nextToken());
		}
	}

	public long nextLong() throws IOException{
		if(hasNext()){
			return Long.parseLong(tok.nextToken());
		}else{
			getLine();
			return Long.parseLong(tok.nextToken());
		}
	}

	public double nextDouble() throws IOException{
		if(hasNext()){
			return Double.parseDouble(tok.nextToken());
		}else{
			getLine();
			return Double.parseDouble(tok.nextToken());
		}
	}
}
