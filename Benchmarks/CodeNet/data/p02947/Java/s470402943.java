import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		OriginScanner os = new OriginScanner();
		PrintWriter pw = new PrintWriter(System.out);
		
		int a = os.nextInt();
		String[] array = new String[a];
		for (int i = 0; i < a; i++) {
			String str = os.nextLine();
			String[] strArray = new String[str.length()];
			for (int n = 0; n < str.length(); n++) {
				strArray[n] = String.valueOf(str.charAt(n));
			}
			Arrays.sort(strArray);
			array[i] = Arrays.toString(strArray);
			pw.println("s->" + array[i]);
		}
		int count = 0;
		for (int ar = 0; ar < array.length; ar++) {
			String str = array[ar];
			for (int br = ar + 1; br < array.length; br++) {
				if (ar == br) continue;
				String str2 = array[br];
				if (str.equals(str2)) count++;
			}
		}
		pw.println(count);
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
