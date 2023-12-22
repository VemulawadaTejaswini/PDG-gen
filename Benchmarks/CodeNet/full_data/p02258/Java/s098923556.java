import java.util.*;

public class Main {
	public static void main(String[] a) {
		Scanner input = new Scanner(System.in);
		int loop = input.nextInt();
		int max = -1;
		int[] num = new int[loop];

			for (int i = 0; i < loop; i++) {
				int newNum = input.nextInt();

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

			System.out.println(max);
	}

}