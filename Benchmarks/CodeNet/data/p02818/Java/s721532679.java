import java.util.*;
import java.io.*;
import java.util.stream.IntStream;
 
class Main {
    public static void main(String[] args) {
	  OriginScanner os = new OriginScanner();
      int a = os.nextInt();
      int b = os.nextInt();
      int k = os.nextInt();

      if (a >= k) {
        System.out.println(String.format("%d %d", (a - k), b));
      }
      else {
        System.out.println(String.format("0 %d", (b - (k - a))));
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
	}
}