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

		int red[] = new int[K];
		int green[] = new int[K];
		int blue[] = new int[K];

		red[0]=A;
		green[0]=B;
		blue[0]=C;
		for (int i=1; i < K; i++) {
			red[i+1]=red[i]*2;
			green[i+1]=green[i]*2;
			blue[i+1]=blue[i]*2;
		}


		int red_n=0;
		int green_n=0;
		int blue_n=0;
		for (int i=0; i < K; i++) {
			red_n++;
			if (check(red[red_n],green[green_n],blue[blue_n])) {
				ans = true;
				break;
			}
			green_n++;
			if (check(red[red_n],green[green_n],blue[blue_n])) {
				ans = true;
				break;
			}
			blue_n++;
			if (check(red[red_n],green[green_n],blue[blue_n])) {
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
