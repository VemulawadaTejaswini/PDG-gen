import java.io.IOException;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		while (true) {
			int w = nextInt();
			if (w == 1) {
				break;
			}

			System.out.print(w + ":");

			boolean[] is_prime = new boolean[w + 1];// 素数判定表
			Arrays.fill(is_prime, true);// まずは全部trueで埋める

			for (int i = 2; i <= w; i++) {
				if (i % 7 != 1 && i % 7 != 6) {
					// 月曜土曜数でなければスキップ
					continue;
				}

				if (is_prime[i]) {
					// 月曜土曜素数であれば割ってみる
					if (w % i == 0) {
						System.out.print(" " + i);
					}
					for (int j = i * 2; j <= w; j += i) {
						// iの整数倍は素数ではない
						is_prime[j] = false;
					}
				}

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

	static char nextChar() {
		try {
			int b = System.in.read();
			while (b != -1 && (b == ' ' || b == '\r' || b == '\n'))
				;
			if (b == -1)
				return 0;
			return (char) b;
		} catch (IOException e) {
		}
		return 0;
	}

}