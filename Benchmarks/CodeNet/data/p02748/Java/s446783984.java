import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
  /**
   * Iterate through each line of input.
   */
	public static void main(String[] args) throws IOException {
		OriginScanner os = new OriginScanner();
		PrintWriter pw = new PrintWriter(System.out);
		
		int a = os.nextInt();
		int b = os.nextInt();
		int m = os.nextInt();
		
		int[] aAry = Arrays.stream(os.nextLine().split(" ")).mapToInt(i -> Integer.parseInt(i)).toArray();
		int[] bAry = Arrays.stream(os.nextLine().split(" ")).mapToInt(i -> Integer.parseInt(i)).toArray();
		
		int min = Arrays.stream(aAry).min().getAsInt() + Arrays.stream(bAry).min().getAsInt();
		
		for (int i = 0; i < m; i++) {
			String[] mAry = os.nextLine().split(" ");
			int aSel = aAry[Integer.parseInt(mAry[0]) - 1];
			int bSel = bAry[Integer.parseInt(mAry[1]) - 1];
			int diff = Integer.parseInt(mAry[2]);
			min = Math.min(min, aSel + bSel - diff);
		}
		pw.println(min);
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