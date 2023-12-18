import java.util.*;
import java.io.*;
import java.util.stream.IntStream;
 
class Main {
    public static void main(String[] args) {
	  OriginScanner os = new OriginScanner();
	  PrintWriter pw = new PrintWriter(System.out);
      int a = os.nextInt();
      int b = os.nextInt();
      int k = os.nextInt();

      if (a >= k) {
        pw.println(String.format("%d %d", (a - k), b));
      }
      else {
        pw.println(String.format("0 %d", (b - (k - a))));
      }
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
	}
}