import java.util.Scanner;
import java.util.StringJoiner;

class Main {

	static int n;

	static int[] inOrd;
	static int[] preOrd;
	static int[] postOrd;

	static int cIdx = 0;
	static int rIdx = 0;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();

		inOrd = new int[n];
		for (int i = 0; i < n; i++) inOrd[i] = sc.nextInt();

		preOrd = new int[n];
		for (int i = 0; i < n; i++) preOrd[i] = sc.nextInt();

		sc.close();

		postOrd = new int[n];
		postOrder(0, n);

		StringJoiner sj = new StringJoiner(" ");
		for (int i = 0; i < n; i++) {
			sj.add(String.valueOf(postOrd[i]));
		}
		System.out.println(sj);

	}

	private static void postOrder(int l, int r) {

		if(l >= r) return;

		int next = inOrd[cIdx];
		cIdx++;

		int m = -1;
		for (int i = 0; i < r; i++) {
			if (preOrd[i] == next) {
				m = i;
				break;
			}
		}

		postOrder(l, m);
		postOrder(m+1, r);

		postOrd[rIdx] = next;
		rIdx++;
	}
}