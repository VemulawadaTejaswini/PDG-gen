import java.util.Scanner;

// Main
class Main {
	static final int INIT = 8;
	static int[] grow(int[] s) {
		int[] d = new int[s.length * 2];
		System.arraycopy(s, 0, d, 0, s.length);
		return d;
	}

	static class Stack {
		private int[] data;
		public Stack() {
			data = new int[INIT];
			// data[0] を項目数にする
		}
		public boolean isEmpty() {
			return data[0] == 0;
		}
		public void push(int x) {
			int next = data[0] + 1;
			if (next >= data.length) {
				data = grow(data);
			}
			data[next] = x;
			data[0] = next;
		}
		public int getTop() {
			return data[data[0]];
		}
		public void pop() {
			if (!isEmpty()) {
				data[0] -= 1;
			}
		}
	}

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			Stack[] s = new Stack[n];
			for (int i = 0; i < n; i++) {
				s[i] = new Stack();
			}
			int q = sc.nextInt();
			for (int i = 0; i < q; i++) {
				int c = sc.nextInt();
				int t = sc.nextInt();
				switch (c) {
				case 0:
					int x = sc.nextInt();
					s[t].push(x);
					break;
				case 1:
					if (!s[t].isEmpty()) {
						System.out.println(Integer.toString(s[t].getTop()));
					}
					break;
				case 2:
					s[t].pop();
					break;
				}
			}
		}
	}
}

