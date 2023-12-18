import java.util.*;
import java.io.*;
import java.util.stream.IntStream;
 
class Main {
    public static void main(String[] args) {
		OriginScanner scanner = new OriginScanner();
		int k = scanner.nextInt();
		
		boolean isPrimeNum = false;
		while (!isPrimeNum) {
			int num = k;
			isPrimeNum = IntStream.range(2, num).allMatch(c -> num % c != 0);
			if (isPrimeNum) System.out.println(num);
			k++;
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