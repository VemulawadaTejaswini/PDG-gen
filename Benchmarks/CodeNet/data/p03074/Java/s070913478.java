import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		try(final Scanner sc = new Scanner(System.in)){
			final int N = sc.nextInt();
			final int K = sc.nextInt();
			
			final char[] chs = sc.next().toCharArray();
			
			ArrayList<Integer> list = new ArrayList<Integer>();
			ArrayList<Boolean> isOne = new ArrayList<Boolean>();
			{
				int prev_value = -1;
				int cnt = 0;
				for(int i = 0; i < chs.length; i++) {
					if(prev_value < 0) {
						prev_value = chs[i];
						cnt = 1;
					}else if(prev_value != chs[i]) {
						prev_value = chs[i];
						list.add(cnt);
						isOne.add(prev_value == '0');
						cnt = 1;
					}else {
						cnt += 1;
					}
				}
				if(cnt != 0) { list.add(cnt); isOne.add(prev_value != '0'); cnt = 0; }
			}
			//System.out.println(list);
			
			int answer = 0;
			{// 111 ->
				int curr = 0;
				for(int i = 0; i < Math.min(2 * K + 1, list.size()); i++) { curr += list.get(i); }
			
				answer = Math.max(answer, isOne.get(0) ? curr : 0);
				for(int i = 1; i < (list.size() - (2 * K)); i++) {
					curr -= list.get(i - 1);
					curr += list.get(i + 2 * K);
					//System.out.printf("%s [%d, %d) = %d\n", list, i, i + 2 * K + 1, curr, list.size());
					if(isOne.get(i)) { answer = Math.max(answer, curr); }
				}
			}
			{ // 000 ->
				int curr = 0;
				for(int i = 0; i < Math.min(2 * K, list.size()); i++) { curr += list.get(i); }
				//System.out.println(curr);
				
				answer = Math.max(answer, !isOne.get(0) ? curr : 0);
				for(int i = 1; i <= (list.size() - 2 * K); i++) {
					curr -= list.get(i - 1);
					curr += list.get(i + (2 * K - 1));
					//System.out.printf("%s [%d, %d) = %d\n", list, i, i + 2 * K, curr, list.size());
					if(!isOne.get(i)) { answer = Math.max(answer, curr); }
				}
			}
			
			System.out.println(answer);
		}
	}

	public static class Scanner implements Closeable {
		private BufferedReader br;
		private StringTokenizer tok;

		public Scanner(InputStream is) throws IOException {
			br = new BufferedReader(new InputStreamReader(is));
		}

		private void getLine() throws IOException {
			while(!hasNext()){
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

		public int[] nextIntArray(int n) throws IOException {
			final int[] ret = new int[n];
			for(int i = 0; i < n; i++){
				ret[i] = this.nextInt();
			}
			return ret;
		}

		public long[] nextLongArray(int n) throws IOException {
			final long[] ret = new long[n];
			for(int i = 0; i < n; i++){
				ret[i] = this.nextLong();
			}
			return ret;
		}

		public void close() throws IOException {
			br.close();
		}
	}
}