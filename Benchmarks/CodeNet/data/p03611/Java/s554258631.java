import java.util.Scanner;
import java.util.Arrays;

public class Main {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		int N = s.nextInt();
		int[] numArr = new int[N];

		for (int i = 0; i < N; i++) {
			numArr[i] = Integer.parseInt(s.next());
		}

		int tmp = 1;
		int count = 0;

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (i != j) {
					if (numArr[j] == numArr[i]) {
						tmp++;
					} else if (numArr[j] - 1 == numArr[i]) {
						tmp++;
					} else if (numArr[j] + 1 == numArr[i]) {
						tmp++;
					}
				}
			}
			count = Math.max(count, tmp);
			tmp = 1;
		}

		System.out.println(count);
	}
}