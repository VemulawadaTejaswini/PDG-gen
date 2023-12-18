import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		FastScanner sc = new FastScanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		String str = "";
		char[][] matrix = new char[H][W];
		for (int i = 0; i < H; i++) {
			str = sc.next();
			for (int j = 0; j < W; j++) {
				matrix[i][j] = str.charAt(j);
			}
		}
		int total = 1;
		int max = 0;

		for (int i = 0; i < H; i++) {
			for (int j = 0; j < W; j++) {
				if (matrix[i][j] == '.') {
					for (int k = i + 1; k < H; k++) {
						if (matrix[k][j] == '.') {
							total++;
						} else {
							break;
						}
					}
					for (int k = i - 1; k >= 0; k--) {
						if (matrix[k][j] == '.') {
							total++;
						} else {
							break;
						}
					}
					for (int l = j + 1; l < W; l++) {
						if (matrix[i][l] == '.') {
							total++;
						} else {
							break;
						}
					}
					for (int l = j - 1; l >= 0; l--) {
						if (matrix[i][l] == '.') {
							total++;
						} else {
							break;
						}
					}
					if (total > max) {
						max = total;
					}
					total = 1;

				}

			}
		}
		System.out.println(max);
	}

}

class FastScanner {
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