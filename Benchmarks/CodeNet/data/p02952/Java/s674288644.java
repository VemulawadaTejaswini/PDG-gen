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
		
		long count = IntStream.rangeClosed(1, n).filter(i -> String.valueOf(i).length() % 2 == 1).count();
		
		pw.println(count);
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