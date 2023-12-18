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

		int result = 1;
		int beforeCount = 1;
		int count = 0;
		int num = 0;

		for (int i : array) {
			if (i != num) {
				num += 1;
				beforeCount = count;
				count = 0;
			}
			count ++;

			result = (result * beforeCount % 998244353);


		}

		System.out.println(result);
	}

}