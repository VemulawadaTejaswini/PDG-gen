import java.util.*;

public class currency {
	public static void main(String[] a) {
		Scanner input = new Scanner(System.in);
		int loop = input.nextInt();
		int max = -1;
		int[] num = new int[loop];

		if (loop >= 2 && loop <= 200000) {

			for (int i = 0; i < loop; i++) {
				int newNum = input.nextInt();

				if (newNum >= 1 && newNum <= 1000000000) {
					num[i] = newNum;
					if (i == 1)
						max = num[1] - num[0];

					if (i > 0) {

						for (int j = 0; j < i; j++) {
							max = newNum - num[j] >= max ? newNum - num[j]
									: max;
						}
					}
				}

			}

			System.out.println(max);

		}

	}

}