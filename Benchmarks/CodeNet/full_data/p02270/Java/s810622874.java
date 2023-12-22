import java.util.*;
import java.io.*;

public class Main{
	final static int MOD = 1000000007;
	final static int INF = 1000000000;

	
	
	static int n, k;
	static int[] w;
	public static void main(String[] args) throws IOException{
		NScanner sc = new NScanner(System.in);
		n = sc.nextInt(); k = sc.nextInt();
		int maxw = 0;
		w = new int[n];
		for(int i = 0; i < n; ++i){
			w[i] = sc.nextInt(); maxw = Math.max(maxw, w[i]);
		}
		long lt = 0, rt = (long)maxw * n;
		while(rt > lt + 1){//最後はlt:できないギリギリ rt: ギリギリ積める
	        long mid = (lt+rt)/2;
	        int pos = checknum(mid);
	        if(pos >= n) rt = mid;
	        else lt = mid;
	    }
		System.out.println(rt);
	}
	
	static int checknum(long P){
		int i = 0;
		for(int j = 0; j < k; ++j){
			long s = 0;
			while(s + w[i] <= P){
				s += w[i];
				++i;
				if(i == n) return n;
			}
		}
		return i;
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
