import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		FastScanner sc = new FastScanner(System.in);

		int A = sc.nextInt(); // Red
		int B = sc.nextInt(); // Green
		int C = sc.nextInt(); // Blue

		int K = sc.nextInt();

		boolean ans = false;

		int b1=B;
		int b2=B;
		int b3=B;

		int c1=C;
		int c2=C;
		int c3=C;
		for (int i=0; i < K; i++) {
			// case A(Red)
			//a1=a1*2;
			// case B(Green)
			b1=b1*2;
			// case C(Blue)
			c2=c2*2;

			if (i%2==0) {
				b3=b3*2;
			}
			else {
				c3=c3*2;
			}


			if (check(A, b1, c1) || check(A, b2, c2) || check(A, b3, c3)) {
				ans = true;
				break;
			}
		}

		if (ans) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}

	private static boolean check(int red, int green, int blue) {
		//System.out.println("red="+red+",green="+green+"blue="+blue);

		if (green > red && blue > green) {
			//System.out.println("true");
			return true;
		}
		//System.out.println("false");
		return false;
	}

	private static class FastScanner {
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

		public int nextInt() {
			return Integer.parseInt(next());
		}

	}
}
