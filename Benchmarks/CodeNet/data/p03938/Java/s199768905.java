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
		
		final int N = sc.nextInt();
		int[] perm = new int[N];
		for(int i = 0; i < N; i++){
			perm[i] = sc.nextInt() - 1;
		}
		
		int[] forward  = new int[N];
		int[] backward = new int[N];
		
		for(int i = 0; i < N; i++){
			forward[i]  = (i + 1) * (i + 2) / 2;
			backward[i] = (i + 1);
		}
		for(int i = 0; i < N / 2; i ++){
			final int tmp = backward[i];
			backward[i] = backward[(N - 1) - i];
			backward[(N - 1) - i] = tmp;
		}
		
		int[] new_forward  = new int[N];
		int[] new_backward = new int[N];
		//System.out.println(Arrays.toString(backward));
		for(int i = 0; i < N; i++){
			new_forward[perm[i]] = forward[i];
			new_backward[perm[i]] = backward[i];
		}
		
		for(int i = 0; i < N; i++){
			System.out.print((i == 0 ? "" : " "));
			System.out.print(new_forward[i]);
		}
		System.out.println();
		for(int i = 0; i < N; i++){
			System.out.print((i == 0 ? "" : " "));
			System.out.print(new_backward[i]);
		}
		System.out.println();
		
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