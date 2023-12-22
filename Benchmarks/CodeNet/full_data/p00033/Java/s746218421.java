import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

public class Main {
	int[] x;
	public boolean dfs(int idx, int left, int right){
		if( idx >= 10 ){
			return true;
		}
		boolean flag = left < x[idx] ? dfs(idx+1, x[idx], right) : false;
		flag = flag || (right < x[idx] && dfs(idx+1, left, x[idx]));
		return flag;
	}
	public void solve() throws IOException {
		int n = nextInt();
		for(int i = 0; i < n; i++){
			x = new int[10];
			for(int j = 0; j < 10; j++){
				x[j] = nextInt();
			}
			if( dfs(0, 0, 0) ){
				writer.println("YES");
			} else {
				writer.println("NO");
			}
		}
		writer.flush();
	}
	public static void main(String[] args){
		new Main().run();
	}
	BufferedReader reader;
	StringTokenizer tokenizer;
	PrintWriter writer;
	
	public void run() {
		try{
			reader = new BufferedReader(new InputStreamReader(System.in));
			tokenizer = null;
			writer = new PrintWriter(System.out);
			solve();
			reader.close();
			writer.close();
		} catch(Exception e){
			e.printStackTrace();
			System.exit(1);
		}
	}
	public String nextToken() throws IOException {
		if( tokenizer == null || !tokenizer.hasMoreTokens() ){
			tokenizer = new StringTokenizer(reader.readLine());
		}
		return tokenizer.nextToken();
	}
	public int nextInt() throws IOException {
		return Integer.parseInt(nextToken());
	}
}