import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

class Main {
	
    public static void main(String[] args) {
		OriginScanner os = new OriginScanner();
		PrintWriter pw = new PrintWriter(System.out);
		
		int n = os.nextInt();
		int town = n + 1;
		
		long[] moster = IntStream.rangeClosed(1, town).mapToLong(i -> os.nextLong()).toArray();
		long[] brave = IntStream.rangeClosed(1, n).mapToLong(i -> os.nextLong()).toArray();
		
		int sum = 0;
		moster: for (int m = 0, b = 0; m < town; m++) {
			long ms = moster[m];
			while (b < brave.length && b < (m + 1)) {
				long bv = brave[b];
				if (b == brave.length - 1 && bv == 0) break moster;
				long min = Math.min(ms, bv);
				ms -= min;
				bv -= min;
				sum += min;
				if (ms < 1) {
					brave[b] = bv;
					continue moster;
				}
				b++;
			}
		}
		pw.println(sum);
		
		pw.close();
	}
    
	static class OriginScanner {
		StringTokenizer token;
		BufferedReader br;
		
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
			while (token == null || !token.hasMoreElements()) { 
				token = new StringTokenizer(nextLine());
			}
			return token.nextToken();
		}
		
		int nextInt() {
			return Integer.parseInt(next());
		}
		
		long nextLong() {
			return Long.parseLong(next());
		}
	}
}