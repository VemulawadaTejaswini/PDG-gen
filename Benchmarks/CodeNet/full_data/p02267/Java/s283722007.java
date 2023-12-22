import java.util.*;
import java.io.*;

public class Main{
	final static int MOD = 1000000007;
	final static int INF = 1000000000;

	public static void main(String[] args) throws IOException{
		NScanner sc = new NScanner(System.in);
		int n = sc.nextInt(), cnt = 0;
		int[] S = new int[n];
		for(int i = 0; i < n; ++i)
			S[i] = sc.nextInt();
		int q = sc.nextInt();
		for(int i = 0; i < q; ++i){
			int t = sc.nextInt();
			if(linearSearch(S, t)) ++cnt;
		}
		System.out.println(cnt);
	}
	
	static boolean linearSearch(int[] v, int key){
		int n = v.length;
		if(key == v[n-1]) return true;
		int tmp = v[n-1]; v[n-1] = key;
		int i = 0;
		while(v[i] != key) ++i;
		v[n-1] = tmp;
		if(i < n-1) return true;
		return false;
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
