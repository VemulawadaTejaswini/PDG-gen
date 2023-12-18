import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.next());
		int[] p = new int[n];
		int idx;
		for (idx = 0; idx < n; idx++) {
			p[idx] = Integer.parseInt(sc.next());
		}

		int cnt = 0;
		for (idx = 1; idx < n - 1; idx++) {
			if (p[idx] <= p[idx - 1]) {
				if (p[idx] > p[idx + 1]) {
					++cnt;
				}
			} else { //if (p[idx] > p[idx -1]) {
				if (p[idx] <= p[idx + 1]) {
					++cnt;
				}
			}
		}

		System.out.println(cnt);

	}

}
