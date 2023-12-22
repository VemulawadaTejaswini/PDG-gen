import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int N = sc.nextInt();
		Integer[] p = new Integer[N];
		for (int i = 0; i < N; i++) {
			p[i] = sc.nextInt();
		}
		sc.close();

		Arrays.sort(p);

		int cnt = Arrays.asList(p).indexOf(X);
		// Xが含まれない場合
		if (cnt == -1) {
			System.out.println(X);
			return;
		} else {
			// -1, +2, -3, +4という順番で調べていく
			for (int i = 1; i < 200; i++) {
				int num;
				if (i % 2 == 1) {
					num = X - i;
				} else {
					num = X + i;
				}

				if (Arrays.asList(p).indexOf(num) == -1) {
					System.out.println(num);
					return;
				}
			}
		}
	}
}
