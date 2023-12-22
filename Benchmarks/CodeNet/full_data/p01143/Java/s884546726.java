import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		while (true) {
			int N = nextInt();
			int M = nextInt();
			int P = nextInt();
			if (N == 0) {
				break;
			}

			int[] tickets = new int[N];// 売れたチケットの数
			int sum_tickets = 0;
			for (int i = 0; i < tickets.length; i++) {
				tickets[i] = nextInt();
				sum_tickets += tickets[i];
			}

			if (tickets[M - 1] == 0) {
				System.out.println(0);
			} else {
				int award = sum_tickets * (100 - P) / tickets[M - 1];
				System.out.println(award);
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