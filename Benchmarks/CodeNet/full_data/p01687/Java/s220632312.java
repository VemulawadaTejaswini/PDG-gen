import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
	
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		final char[] input = sc.next().toCharArray();
		int[] counts = new int[26];
		int[] ans = new int[26];
		
		for(char ch : "AIDUNYAN".toCharArray()){
			ans[ch - 'A']++;
		}
		
		LinkedList<Character> buffer = new LinkedList<Character>();
		for(int i = 0; i < input.length; i++){
			buffer.offer(input[i]);
			counts[input[i] - 'A']++;
			
			if(buffer.size() >= "AIDUNYAN".length()){
				
				boolean ok = true;
				for(int j = 0; j < 26; j++){
					if(counts[j] != ans[j]){
						ok = false;
						break;
					}
				}
				
				if(ok){
					System.out.print("AIZUNYAN");
					Arrays.fill(counts, 0);
					buffer.clear();
				}else{
					System.out.print(buffer.peek());
					counts[buffer.poll() - 'A']--;
				}
			}	
		}
		
		while(!buffer.isEmpty()){
			System.out.print(buffer.poll());
		}
		System.out.println();
		
		sc.close();
	}

	public static class Scanner {
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
			if (tok == null) {
				return false;
			} else {
				return tok.hasMoreTokens();
			}
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