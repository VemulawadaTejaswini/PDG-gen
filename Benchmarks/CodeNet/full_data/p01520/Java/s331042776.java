import java.util.*;
import java.io.*;

public class Main extends Template{
	public void solve() throws IOException{
		int n = nextInt();
		int t = nextInt();
		int e = nextInt();
		int[] x = new int[n];
		for(int i = 0; i < n; i++){
			x[i] = nextInt();
			if( Math.ceil((double)(t-e)/x[i]) <= Math.floor((double)(t+e)/x[i]) ){
				System.out.println(i+1);
				return;
			} 
		}
		System.out.println(-1);
		
	}
	
	public static void main(String[] args){
		new Main().run();
	}
}

abstract class Template implements Runnable{
	public abstract void solve() throws IOException;
	
	BufferedReader reader;
	StringTokenizer tokenizer;
	PrintWriter writer;
	
	public void run(){
		try{
			reader = new BufferedReader(new InputStreamReader(System.in));
			tokenizer = null;
			writer = new PrintWriter(System.out);
			solve();
			reader.close();
			writer.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(1);
		}
	}
	
	public int nextInt() throws IOException{
		return Integer.parseInt(nextToken());
	}
	
	public double nextDouble() throws IOException{
		return Double.parseDouble(nextToken());
	}
	
	public long nextLong() throws IOException{
		return Long.parseLong(nextToken());
	}
	
	public String nextToken() throws IOException{
		while( tokenizer == null || !tokenizer.hasMoreTokens() ){
			tokenizer = new StringTokenizer(reader.readLine());
		}
		return tokenizer.nextToken();
	}
}
		