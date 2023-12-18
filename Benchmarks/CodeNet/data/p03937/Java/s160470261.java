import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {
	
	public static void main(String[] args) throws IOException {
		final Scanner sc = new Scanner(System.in);
		
		final int H = sc.nextInt();
		final int W = sc.nextInt();
		
		final char[][] input = new char[H][];
		for(int i = 0; i < H; i++){
			input[i] = sc.next().toCharArray();
		}
		
		int curr_x = 0, curr_y = 0;
		LOOP:
		for(int i = 0; i < H; i++){
			for(int j = 0; j < W; j++){
				if(input[i][j] == '#'){
					curr_x = j;
					curr_y = i;
					break LOOP;
				}
			}
		}
		
		while(input[curr_y][curr_x] == '#'){
			input[curr_y][curr_x] = '.';
			
			if(curr_x < W - 1 && input[curr_y][curr_x + 1] == '#'){
				curr_x += 1;
			}else if(curr_y < H - 1){
				curr_y += 1;
			}else{
				break;
			}
		}
		
		for(int i = 0; i < H; i++){
			for(int j = 0; j < W; j++){
				if(input[i][j] == '#'){
					System.out.println("Impossible");
					return;
				}
			}
		}
		System.out.println("Possible");
	}
	
	public static class Scanner implements Closeable {
		private BufferedReader br;
		private StringTokenizer tok;

		public Scanner(InputStream is) throws IOException {
			br = new BufferedReader(new InputStreamReader(is));
		}

		private void getLine() throws IOException {
			while (!hasNext()) {
				tok = new StringTokenizer(br.readLine());
			}
		}

		private boolean hasNext() {
			return tok != null && tok.hasMoreTokens();
		}

		public String next() throws IOException {
			getLine();
			return tok.nextToken();
		}

		public int nextInt() throws IOException {
			return Integer.parseInt(next());
		}

		public long nextLong() throws IOException {
			return Long.parseLong(next());
		}

		public double nextDouble() throws IOException {
			return Double.parseDouble(next());
		}

		public void close() throws IOException {
			br.close();
		}
	}
}