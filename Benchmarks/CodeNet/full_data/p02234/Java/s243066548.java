import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.InputMismatchException;


public class Main {
	
	private static int[][] cache;
	private static int[] r;
	private static int[] c;
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 

		int n = sc.nextInt();
		cache = new int[n][n];
		r = new int[n];
		c = new int[n];

		for (int i = 0; i < n; i++) {
			r[i] = sc.nextInt();
			c[i] = sc.nextInt();
		}
		for (int j = 0; j < n; j++) {
			for (int i = 1; i <= n && i + j <= n; i++) {
				cache[i-1][i+j-1] = mcm(i, i + j);
//				System.out.println(i + " " + (i + j));
			}
		}

		System.out.println(cache[1 - 1][n - 1]);
		
		sc.close();
	}
	
	private static int mcm(int i, int j) {
		if (i == j) {
			return 0;
		} else {
			int min = Integer.MAX_VALUE;
			for (int k = 0; k < j - i; k++) {
				assert c[i+k-1] == r[i+k+1-1] : i + k + ":" + c[i+k-1] + "," + r[i+k+1-1];
				int result = cache[i-1][i+k-1] + r[i-1] * r[i+k+1-1] * c[j-1] + cache[i+k+1-1][j-1];
				if (result < min) {
					min = result;
				}
			}
			
			return min;
		}
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
}