import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) throws Exception {
		OriginScanner os = new OriginScanner();
		PrintWriter pw = new PrintWriter(System.out);
		
		int monster = os.nextInt();
		int count = os.nextInt();
		
		if (monster > count) {
			IntStream stream = IntStream.rangeClosed(1, monster).map(i-> os.nextInt());
			if (count == 0) {
				int num = stream.sum();
				pw.println(num);
			}
			else {
				int diff = monster - count;
				int[] h = stream.sorted().toArray();
				int num = IntStream.range(0, diff).map(i-> h[i]).sum();
				pw.println(num);
			}
		}
		else {
			pw.println(0);
		}
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
		double nextDouble() {
			return Double.parseDouble(next());
		}
		long nextLong() {
			return Long.parseLong(next());
		}
	}
}
