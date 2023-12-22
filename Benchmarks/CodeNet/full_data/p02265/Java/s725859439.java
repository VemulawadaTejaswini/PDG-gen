import java.util.*;
import java.io.*;

public class Main{
	final static int MOD = 1000000007;
	final static int INF = 1000000000;

	public static void main(String[] args) throws IOException{
		NScanner sc = new NScanner(System.in);
		int n = sc.nextInt();
		Deque<Integer> list = new ArrayDeque<Integer>();
		for(int i = 0; i < n; ++i){
			String com = sc.next();
			if(com.charAt(0) == 'i'){
				int x = sc.nextInt();
				list.addFirst(x);
			}else if(com.length() == 6){
				int x = sc.nextInt();
				list.remove(x);
			}else if(com.charAt(6) == 'F'){
				list.pollFirst();
			}else if(com.charAt(6) == 'L'){
				list.pollLast();
			}
		}
		boolean first = true;
		for(int i : list){
			System.out.print((first ? "" : " ") + i);
			
			if(first){
				first = false;
			}
		}
		System.out.println();
	}


}

class NScanner {
	
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
	
	private boolean hasNext(){
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
