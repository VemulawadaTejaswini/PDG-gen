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

		for (int i = 0; i < N - 1; i++) {
			for (int j = i + 1; j < N; j++) {
				if ((bBoolArr[i] == true) && (bArr[i].equals(bArr[j]))) {
					bBoolArr[j] = false;
					originCount++;
				}
			}

			for (int k = 0; k < M; k++) {
				if ((bBoolArr[i] == true) && rArr[k].equals(bArr[i])) {
					originCount--;
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
