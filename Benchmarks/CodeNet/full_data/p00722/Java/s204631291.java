import java.io.IOException;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		while (true) {
			int a = nextInt();
			int d = nextInt();
			int n = nextInt();
			if (a == 0) {
				break;
			}

			ArrayList<Integer> list = new ArrayList<Integer>();
			if (a == 1) {
				a += d;
			}
			if (a == 2) {
				list.add(a);
				a += d;
			}
			while (list.size() < n) {
				boolean is_prime = true;
				if (a % 2 == 0) {
					is_prime = false;
				} else {
					for (int i = 1; 2 * i + 1 <= Math.sqrt(a); i++) {
						if (a % (2 * i + 1) == 0) {
							is_prime = false;
							break;
						}
					}
				}
				if (is_prime) {
					list.add(a);
				}
				a += d;
			}

			System.out.println(list.get(n - 1));
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