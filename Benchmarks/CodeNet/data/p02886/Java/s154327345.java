import java.util.Scanner;

public class Main {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		Integer n = sc.nextInt();
		int[] array = new int[n];
		int sum = 0;
		int result2 = 0;

		for (int i = 0; i < n; i ++) {
			array[i] = sc.nextInt();
			sum += array[i];
		}

		for (int i : array) {
			result2 += i * (sum - i);
		}

		int result = result2 / 2;
		System.out.println(result);
	}



}
