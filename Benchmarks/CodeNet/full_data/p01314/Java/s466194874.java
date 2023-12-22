import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		while (true) {
			int m = nextInt();
			if (m == 0) {
				break;
			}

			int sum = 1;
			int pattern = 0;// パターン数
			for (int j = 2; j < 50; j++) {
				sum += j;
				if ((m - sum) < 0) {
					System.out.println(pattern);
					break;
				} else if ((m - sum) % j == 0) {
					pattern++;
				}
			}
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