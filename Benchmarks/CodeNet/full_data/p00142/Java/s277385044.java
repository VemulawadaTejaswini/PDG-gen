import java.util.*;
import java.io.*;

public class Main {
	
	public  void solve() throws IOException{
		int n;
		while( (n = nextInt()) != 0 ){
			int[] ans = new int[n/2+1];
			Set<Integer> set = new HashSet<Integer>();
			for(int i = 1; i < n; i++){
				int x = i*i%n;
				set.add(x);
			}
			for(Integer p : set){
				for(Integer q : set){
					if( p == q ){
						continue;
					}
					int key = ((p-q)+n)%n;
					key = Math.min(n-key, key);
					ans[key]++;
				}
			}
			for(int i = 1; i < ans.length; i++){
				writer.println(ans[i]);
			}
		}
		writer.flush();
	}
	public static void main (String args[]) throws IOException{
		new Main().run();
	}
	
	BufferedReader reader;
	StringTokenizer tokenizer;
	PrintWriter writer;
	
	public void run() throws IOException{
		try{
			reader = new BufferedReader(new InputStreamReader(System.in));
			tokenizer = null;
			writer = new PrintWriter(System.out);
			solve();
			reader.close();
			writer.close();
		} catch (Exception e){
			e.printStackTrace();
			System.exit(1);
		}
	}
	public int nextInt() throws IOException{
		return Integer.parseInt(nextToken());
	}		
	public String nextToken() throws IOException{
		while( tokenizer == null || !tokenizer.hasMoreTokens() ){
			tokenizer = new StringTokenizer(reader.readLine());
		}
		return tokenizer.nextToken();
	}
}