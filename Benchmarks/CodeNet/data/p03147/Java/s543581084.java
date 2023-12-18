import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] h = new int[N];
		boolean[] isZero = new boolean[N];
		for (int i = 0; i < N; i++) {
			h[i] = sc.nextInt();
			if (h[i] == 0) {
				isZero[i] = true;
			}
		}
		sc.close();

		int cnt = 0;
		for (int i = 0; i < N; i++) {
			while (h[i] > 0) {
				for (int j = i; j < N; j++) {
					if (isZero[j]) {
						break;
					}

					h[j]--;
					if (h[j] == 0 && !isZero[j]) {
						isZero[j] = true;
					}
				}
				cnt++;
			}

		}

		System.out.println(cnt);
	}
}
