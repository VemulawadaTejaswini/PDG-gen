import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main{
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		final int N = sc.nextInt();
		final int M = sc.nextInt();
		
		final int size = N + 2;
		int[] sum = new int[size];
		
		for(int i = 0; i < M; i++){
			final int from = sc.nextInt();
			final int to = sc.nextInt();
			
			sum[from] += 1;
			sum[to] -= 1;
		}
		for(int i = 1; i < size; i++){
			sum[i] += sum[i - 1];
		}
		
		//System.out.println(Arrays.toString(sum));
		int ans = N + 1;
		for(int i = 0; i < size; i++){
			if(sum[i] > 0){
				ans += 2;
			}
		}
		
		System.out.println(ans);
		
		
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

		// 他のnextXXXもXXX.parseXXX()メソッドを使って作れるので省略

		public void close() throws IOException {
			br.close();
		}
	}
}