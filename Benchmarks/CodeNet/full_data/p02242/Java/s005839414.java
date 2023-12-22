import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.StreamTokenizer;
import java.util.InputMismatchException;
import java.util.LinkedList;


public class Main {
	static int n;
	static int[][] a;
	static int[] d;
	static int[] prev;
	static int[] k;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Printer pr = new Printer(System.out);

		n = sc.nextInt();
		a = new int[n][n];
		d = new int[n];
		prev = new int[n];
		k = new int[n];
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j] = -1;
			}
			d[i] = Integer.MAX_VALUE;
			prev[i] = -1;
			k[i] = i;
		}

		for (int i = 0; i < n; i++) {
			int u = sc.nextInt();
			int k = sc.nextInt();
			for (int j = 0; j < k; j++) {
				a[u][sc.nextInt()] = sc.nextInt();
			}
		}

		d[0] = 0;
		prev[0] = -1;
		k[0] = 0;
		for (int j = 0; j < n; j++) {
			for (int i = 0; i < n; i++) {
				if (k[j] != k[i] && a[k[j]][k[i]] != -1 && prev[k[j]] != k[i]) {
					if (d[k[i]] > a[k[j]][k[i]] + d[k[j]]) {
						d[k[i]] = a[k[j]][k[i]] + d[k[j]];
						prev[k[i]] = k[j];
					}
				}
			}
			int min = Integer.MAX_VALUE;
			int min_index = n;
			for (int i = j + 1; i < n; i++) {
				if (d[k[i]] < min) {
					min = d[k[i]];
					min_index = i;
				}
			}
			if (j + 1 < n && min_index < n) {
				int temp = k[j + 1];
				k[j + 1] = k[min_index];
				k[min_index] = temp;
			}
		}

		for (int i = 0; i < n; i++) {
			pr.print(i);
			pr.print(" ");
			pr.print(d[i]);
//			pr.print(" ");
//			pr.print(prev[i]);
//			pr.print(" ");
//			pr.print(k[i]);
			pr.println("");
		}

		pr.close();
		sc.close();
	}
	
	private static class Scanner {
		InputStreamReader isr;
		BufferedReader br;
		StreamTokenizer st;
		
		Scanner (InputStream in) {
			isr = new InputStreamReader(in);
			br = new BufferedReader(isr);
			st = new StreamTokenizer(br);
		}
		
		String next() throws RuntimeException  {
			try {
				if (st.nextToken() != StreamTokenizer.TT_WORD) {
				}
			} catch (IOException e) {
				throw new IllegalStateException();
			}
			
			return st.sval;
		}
		
		int nextInt() throws RuntimeException {
			try {
				if (st.nextToken() != StreamTokenizer.TT_NUMBER) {
					throw new InputMismatchException();
				}
			} catch (IOException e) {
				throw new IllegalStateException();
			}
			
			return (int)st.nval;
		}

		void close() {
		}
	}
	
	private static class Printer {
		PrintStream out;
		StringBuffer strbuf;
		int bufSize;
		final String CR;

		Printer(PrintStream out) {
			this.out = out;
			strbuf = new StringBuffer();
			bufSize = 64 * 1024;
			CR = System.getProperty("line.separator");
		}

		void println(String str) {
			strbuf.append(str);
			strbuf.append(CR);
			checkStringBuffer();
		}

		void print(String str) {
			strbuf.append(str);
			checkStringBuffer();
		}

		void println(int n) {
			strbuf.append(n);
			strbuf.append(CR);
			checkStringBuffer();
		}

		void print(int n) {
			strbuf.append(n);
			checkStringBuffer();
		}

		void print(char c) {
			strbuf.append(c);
			checkStringBuffer();
		}

		void printArray(int[] array) {
			for (int i = 0; i < array.length; i++) {
				checkStringBuffer();
				strbuf.append(array[i]);
				strbuf.append(" ");
			}
			strbuf.delete(strbuf.length() - 1, strbuf.length());
			strbuf.append(CR);
		}

		void close() {
			flashStringBuffer();
		}
		
		private void flashStringBuffer() {
			if (strbuf.length() > 0) {
				out.print(strbuf);
				strbuf.setLength(0);
			}
		}
		
		private void checkStringBuffer() {
			if (strbuf.length() > bufSize) {
				out.print(strbuf);
				strbuf.setLength(0);
			}
		}
	}
}