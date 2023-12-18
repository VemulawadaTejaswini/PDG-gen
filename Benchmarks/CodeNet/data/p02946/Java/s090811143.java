import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {
		OriginScanner os = new OriginScanner();
		PrintWriter pw = new PrintWriter(System.out);
		
		int k = os.nextInt();
		int x = os.nextInt();
		
		String str =IntStream.rangeClosed(x - (k - 1), x + (k - 1)).mapToObj(i -> String.valueOf(i)).collect(Collectors.joining(" "));
		
		pw.println(str);
		pw.close();
	}
	
	static class OriginScanner {
		private BufferedReader br;
		private StringTokenizer st;
		
		public OriginScanner() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}
		String nextLine() {
			String str = null;
			try {
				str = br.readLine();
			}
			catch (IOException e) {
				System.out.println(e);
			}
			return str;
		}
		String next() {
			if (st == null || !st.hasMoreTokens()) {
				st = new StringTokenizer(nextLine());
			}
			return st.nextToken();
		}
		int nextInt() {
			return Integer.parseInt(next());
		}
		long nextLong() {
			return Long.parseLong(next());
		}
	}
}