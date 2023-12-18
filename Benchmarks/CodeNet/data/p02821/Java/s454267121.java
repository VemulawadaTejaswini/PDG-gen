import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

class Main {
    public static void main(String[] args) {
		OriginScanner os = new OriginScanner();
		
		int n = os.nextInt();
		int m = os.nextInt();
		
		int[] array = IntStream.rangeClosed(1, n).map(num -> os.nextInt()).sorted().toArray();
		int sum = IntStream.rangeClosed(1, m).map(num -> array[array.length - 1] + array[array.length - 2]).sum();
		
		try (PrintWriter pw = new PrintWriter(System.out)) {
			pw.println(sum);
		}
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