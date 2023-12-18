import java.util.Scanner;
import java.util.Arrays;

public class Main {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		int N = s.nextInt();
		int[] numArr = new int[N];
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;

		for (int i = 0; i < N; i++) {
			numArr[i] = Integer.parseInt(s.next());
			min = Math.min(min, numArr[i]);
			max = Math.max(max, numArr[i]);
		}

		int tmp = 0;
		int count = 0;

		for (int X = min; X <= max; X++) {
			for (int i = 0; i < N; i++) {
				if (numArr[i] == X) {
					tmp++;
				} else if (numArr[i] - 1 == X) {
					tmp++;
				} else if (numArr[i] + 1 == X) {
					tmp++;
				}
				count = Math.max(count, tmp);
			}
			tmp = 0;
		}

		System.out.println(count);
	}
}