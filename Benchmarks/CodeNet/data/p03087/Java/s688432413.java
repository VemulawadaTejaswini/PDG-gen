
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		FastScanner fc = new FastScanner(System.in);
		int num = fc.nextInt();
		int q = fc.nextInt();
		String str = fc.next();
		String subStr = "";
		PrintWriter out = new PrintWriter(System.out);
		for (int k = 0; k < q; k++) {
			subStr = str.substring(fc.nextInt() - 1, fc.nextInt());
			out.println((subStr.length() - subStr.replaceAll("AC", "").length()) / 2);
			out.flush();
		}
	}

	  static class FastScanner {
	        private BufferedReader reader = null;
	        private StringTokenizer tokenizer = null;

	        public FastScanner(InputStream in) {
	            reader = new BufferedReader(new InputStreamReader(in));
	            tokenizer = null;
	        }

	        public String next() {
	            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
	                try {
	                    tokenizer = new StringTokenizer(reader.readLine());
	                } catch (IOException e) {
	                    throw new RuntimeException(e);
	                }
	            }
	            return tokenizer.nextToken();
	        }

	        public String nextLine() {
	            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
	                try {
	                    return reader.readLine();
	                } catch (IOException e) {
	                    throw new RuntimeException(e);
	                }
	            }

	            return tokenizer.nextToken("\n");
	        }

	        public long nextLong() {
	            return Long.parseLong(next());
	        }

	        public int nextInt() {
	            return Integer.parseInt(next());
	        }

	        public double nextDouble() {
	             return Double.parseDouble(next());
	         }

	        public int[] nextIntArray(int n) {
	            int[] a = new int[n];
	            for (int i = 0; i < n; i++)
	                a[i] = nextInt();
	            return a;
	        }

	        public long[] nextLongArray(int n) {
	            long[] a = new long[n];
	            for (int i = 0; i < n; i++)
	                a[i] = nextLong();
	            return a;
	        }
	    }
	}

