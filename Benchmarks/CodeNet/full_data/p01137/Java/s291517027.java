import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		while (true) {
			int e = nextInt();
			if (e == 0) {
				break;
			}

			int m = Integer.MAX_VALUE;
			for (int z = 0; z * z * z <= e; z++) {
				for (int y = 0; y * y + z * z * z <= e; y++) {
					int x = e - z * z * z - y * y;
					m = Math.min(m, x + y + z);
				}
			}
			System.out.println(m);
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