import java.util.Scanner;

public class Main {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {

		int N = s.nextInt();
		String[] bArr = new String[N];
		boolean[] bBoolArr = new boolean[N];

		for (int i = 0; i < N; i++) {
			bArr[i] = s.next();
			bBoolArr[i] = true;
		}

		int M = s.nextInt();
		String[] rArr = new String[M];

		for (int i = 0; i < M; i++) {
			rArr[i] = s.next();
		}

		int originCount = 1;
		int nextCount = 0;

		if (N == 1) {
			for (int k = 0; k < M; k++) {
				if (rArr[k].equals(bArr[0])) {
					System.out.println(0);
					return;
				}
			}
			System.out.println(1);
			return;
		}

		for (int i = 0; i < N; i++) {
			if (bBoolArr[i] == true) {
				for (int j = i + 1; j < N; j++) {

					if (bArr[i].equals(bArr[j])) {
						bBoolArr[j] = false;
						originCount++;
					}
				}

				for (int k = 0; k < M; k++) {
					if (bArr[i].equals(rArr[k])) {
						originCount--;
					}
				}
			}

			if (nextCount < originCount) {
				nextCount = originCount;
			}

			originCount = 1;
			bBoolArr[i] = false;
		}
		System.out.println(nextCount);

	}
}
