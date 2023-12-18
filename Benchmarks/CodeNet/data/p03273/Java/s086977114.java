import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */

public class Main {
    public static void main(String[] args) {
        InputStream    inputStream    = System.in;
        OutputStream outputStream = System.out;
        InputReader    in                      = new InputReader(inputStream);
        PrintWriter      out                    = new PrintWriter(outputStream);
        Task                 solver               = new Task();
        solver.solve(1, in, out);
        out.close();
    }

    static class Task {
    	public void solve(int testNumber, InputReader in, PrintWriter out) {
    		int h = in.nextInt();
    		int w = in.nextInt();
    		String[] a = new String[h];
    		for (int i = 0; i < h; i++) {
    			a[i] = in.next();
    		}
     
    		boolean[] row = new boolean[h];
    		Arrays.fill(row, false);
    		boolean[] col = new boolean[w];
    		Arrays.fill(col, false);
    		for (int i = 0; i < h; i++) {
    			for (int j = 0; j < w; j++) {
    				if (a[i].charAt(j) == '#') {
    					row[i] = true;
    					col[j] = true;
    				}
    			}
    		}
     
    		for (int i = 0; i < h; i++) {
    			if (row[i]) {
    				for (int j = 0; j < w; j++) {
    					if (col[j]) {
    						System.out.print(a[i].charAt(j));
    					}
    				}
    				System.out.println();
    			}
    		}
    	}
    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}

