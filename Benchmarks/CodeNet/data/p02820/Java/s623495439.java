import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) {
		OriginScanner os = new OriginScanner();
		PrintWriter pw = new PrintWriter(System.out);
		
		int n = os.nextInt();
		int k = os.nextInt();
		
		long r = os.nextLong();
		long s = os.nextLong();
		long p = os.nextLong();
		
		long sum = 0;
		String t = os.next();
		char[] array = new char[t.length()];
		for (int i = 0; i < n; i++) {
			char g = t.charAt(i);
			char c = 0;
			long add = 0;
			switch (g) {
				case 'r':
					c = 'p';
					add = p;
					break;
				case 's':
					c = 'r';
					add = r;
					break;
				case 'p':
					c = 's';
					add = s;
					break;
			}
			if (i >= k && array[i-k] == c) {
				array[i] = g;
			}
			else {
				array[i] = c;
				sum += add;
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