import java.io.IOException;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		while (true) {
			int n = nextInt();
			int r = nextInt();

			if (n == 0) {
				break;
			}

			int[] p = new int[r];
			int[] c = new int[r];
			for (int i = 0; i < r; i++) {
				p[i] = nextInt() - 1;
				c[i] = nextInt();
			}

			int place = 1;
			for (int i = r - 1; i >= 0; i--) {
				if (place <= c[i]) {
					place += p[i];
				} else if (place > c[i] || place <= p[i] + c[i]) {
					place -= c[i];
				}
			}

			System.out.println(n + 1 - place);

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