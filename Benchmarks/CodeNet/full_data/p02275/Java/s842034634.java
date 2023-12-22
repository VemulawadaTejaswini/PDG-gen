
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.Arrays;

public class Main {


	public static void main(String[] args) {
		Main main = new Main();
		main.solv();
	}

	private void solv() {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();

		int[] A = new int[n + 1];
		int[] B = new int[n + 1];
		for (int i = 1; i <= n; i++) {
			A[i] = input.nextInt();
		}
		
		// C[i]???i???????????°????¨????
		int[] C = new int[10000];
		for (int i = 1; i <= n; i++) {
			C[A[i]]++;
		}
		
		// C[i]???i??\????????°???????????°????¨??????????
		for (int i = 1; i < C.length; i++) {
			C[i] += C[i - 1];
		}
		
		for(int i = 1; i <= n; i++){
			B[C[A[i]]] = A[i];
			C[A[i]]--;
		}
		
		print(B);
	}

	private void print(Object[] xs) {
		StringBuilder sb = new StringBuilder();
		for (Object x : xs)
			sb.append(x.toString()).append(' ');
		System.out.println(sb.toString().trim());
	}

	private void print(int[] xs) {
		StringBuilder sb = new StringBuilder();
		int i = 0;
		for (int x : xs) {
			if (i == 0) {
				continue;
			}
			sb.append(x).append(' ');
			i++;
		}
		System.out.println(sb.toString().trim());
	}

	private static class Scanner {
		BufferedReader r;
		StreamTokenizer st;

		public Scanner(InputStream in) {
			r = new BufferedReader(new InputStreamReader(in));
			st = new StreamTokenizer(r);
		}

		public String next() {
			nextToken();
			return st.sval;
		}

		public Integer nextInt() {
			nextToken();
			return (int) st.nval;
		}

		private int nextToken() {
			int token = st.TT_EOF;
			try {
				token = st.nextToken();
			} catch (IOException e) {
			}
			return token;
		}
	}
}