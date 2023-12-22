import java.util.*;
import java.io.*;

public class Main {
	
	public void sort(String[] name, int[] win){
		for(int i = 0; i < win.length; i++){
			int max = i;
			for(int j = i; j < win.length; j++){
				if( win[max] < win[j] ){
					max = j;
				}
			}
			String temp1 = name[max];
			int temp2 = win[max];
			name[max] = name[i];
			win[max] = win[i];
			name[i] = temp1;
			win[i] = temp2;
		}
	}
	public void solve() throws IOException{
		int n;
		boolean flag = false;
		while( (n = nextInt()) != 0 ){
			if( flag ){
				writer.println();
			}
			flag = true;
			String[] name = new String[n];
			int[] win = new int[n];
			for(int i = 0; i < n; i++){
				name[i] = nextToken();
				int x = nextInt(), y = nextInt(), z = nextInt();
				win[i] = 3*x + z;
			}
			sort(name, win);
			for(int i = 0; i < n; i++){
				writer.println(name[i] + "," + win[i]);
			}
			writer.flush();
		}
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