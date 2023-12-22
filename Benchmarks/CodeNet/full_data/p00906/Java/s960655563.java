import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		while (true) {
			int N = nextInt();
			if (N == 0) {
				break;
			}

			int M = nextInt();
			int A = nextInt();
			int B = nextInt();
			int C = nextInt();
			int T = nextInt();

			long[][] S = new long[T + 1][N];
			for (int i = 0; i < S[0].length; i++) {
				S[0][i] = nextInt();
			}
			for (int t = 0; t + 1 <= T; t++) {
				for (int i = 0; i < N; i++) {
					long AS = i == 0 ? 0 : A * S[t][i - 1];
					long CS = i + 1 >= N ? 0 : C * S[t][i + 1];
					S[t + 1][i] = (AS + B * S[t][i] + CS) % M;
				}
			}

			for (int i = 0; i < S[T].length; i++) {
				System.out.print(S[T][i] + " ");
			}
			System.out.println();

		}

	}

	static int nextInt() {
		int c;
		try {
			c = System.in.read();
			while (c != '-' && (c < '0' || c > '9'))
				c = System.in.read();
			if (c == '-')
				return -nextInt();
			int res = 0;
			while (c >= '0' && c <= '9') {
				res = res * 10 + c - '0';
				c = System.in.read();
			}
			return res;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return -1;
	}
}