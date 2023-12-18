import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int K = scanner.nextInt();
		int a[] = new int[103];
		int i, j, res = 0;

		for (i = 0; i < N; i++) {
			a[i] = scanner.nextInt();
		}
		LinkedList<Integer> list = new LinkedList<>();
		int R = Math.min(N, K);
		for (int A = 0; A <= R; A++) {
			for (int B = 0; B <= R - A; B++) {
				if (A == B && B == 0)
					continue;
				list.clear();
				for (i = 0; i < A; i++) {
					list.add(a[i]);
				}
				for (j = 0; j < B; j++) {
					list.add(a[N - 1 - j]);
				}
				Collections.sort(list);
				i = 0;
				while (i < K - (A + B) && i < A + B && list.get(i) < 0) {
					i++;
				}
				int s = 0;
				for (; i < A + B; i++) {
					s += list.get(i);
				}
				res = Math.max(s, res);
			}
		}
		String out = String.valueOf(res);

		System.out.println(out);
	}

}