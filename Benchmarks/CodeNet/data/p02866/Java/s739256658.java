import java.util.Arrays;
import java.util.Scanner;

public class Main {
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] array = new int[n];
		int[] counts = new int[n];

		for (int i = 0; i < n; i ++) {
			array[i] = sc.nextInt();
		}

		Arrays.sort(array);

		long result = 1;
		long beforeCount = 1;
		long count = 0;
		long num = 0;

		if (array[1] == 0) {
			result = 0;
		} else {
			for (int i : array) {
				if (i != num) {
					if (i == num + 1) {
						num += 1;
						beforeCount = count;
						count = 0;
					} else {
						result = 0;
						break;
					}
				}
				count ++;

				long ibc = beforeCount % 998244353;

				result = (result * ibc % 998244353);


			}
		}

		System.out.println(result);
	}

}
