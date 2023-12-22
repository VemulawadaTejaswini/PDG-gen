
import java.util.BitSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	Scanner sc;

	Main() {
		sc = new Scanner(System.in);
	}

	@SuppressWarnings("unchecked")
	void run() {
		for (;;) {
			int n = sc.nextInt();
			int m = sc.nextInt();

			if (n + m == 0) {
				break;
			}

			boolean first[] = new boolean[m + 1];
			int coin[] = new int[n];
			for (int i = 0; i < n; i++) {
				int v = sc.nextInt();
				if (v < m + 1) {
					coin[i] = v;
				}
			}
			first[0] = true;

			int cn = 0;
			for (int i = 0; i < n; i++) {
				for (int j = m; j >= coin[i]; j--) {
					if (first[j - coin[i]]) {
						if (!first[j]) {
							cn++;
							first[j] = true;
						}
					}
				}
			}

			int cin[] = new int[cn];
			int ppp = 0;
			for (int i = 1; i < m + 1; i++) {
				if (first[i]) {
					cin[ppp] = i;
					ppp++;
	//				System.out.println(i);
				}
			}

			int dp[] = new int[m + 1];
			for (int cnt = 1;; cnt++) {
				if (first[m]) {
					System.out.println(cnt);
					break;
				}
				boolean next[] = new boolean[m + 1];
				for (int i = 0; i < cn; i++) {
					for (int j = m; j >= cin[i]; j--) {
						if (first[j - cin[i]]) {
							next[j] = true;
						}
					}
				}
				first =next;
			}
		}
	}

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}

}