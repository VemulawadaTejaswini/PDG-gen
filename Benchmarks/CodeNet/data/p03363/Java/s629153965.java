import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int N = s.nextInt();
		long[] numArr = new long[N];
		int count = 0;

		for (int i = 0; i < N; i++) {
			numArr[i] = Long.parseLong(s.next());
		}

		for (int i = 0; i < N - 1; i++) {
			for (int j = i + 1; j < N; j++) {
				if (numArr[i] <= 0 && numArr[j] >= 0 ||
						numArr[i] >= 0 && numArr[j] <= 0) {
					if (numArr[i] + numArr[j] == 0) {
						count++;
					}
				}

				numArr[i] += numArr[j];
			}
		}

		System.out.println(count);

	}
}
