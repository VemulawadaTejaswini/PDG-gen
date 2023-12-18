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
		
		final char[] input = sc.next().toCharArray();
		
		LinkedList<Character> list = new LinkedList<Character>();
		for(final char ch : input){
			list.addLast(ch);
		}
		
		int answer = 0;
		while(!list.isEmpty()){
			boolean all_same = true;

			char prev = 0;
			for(final char ch : list){
				if(prev ==0){
					prev = ch; 
				}else if(prev != ch){
					all_same = false;
					break;
				}
			}
			
			if(all_same){
				break;
			}else{
				final char top = list.poll();
				
				while(list.peek() == top){ list.poll(); }
			}
			answer += 1;
		}
		
		System.out.println(answer);
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