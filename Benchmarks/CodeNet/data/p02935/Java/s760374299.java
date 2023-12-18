import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		float array[] = new float[2 * n - 1];
		for (int i = 0; i < n; i++) {
			array[i] = scan.nextInt();
		}
		if (n == 1) {
			System.out.print(array[n-1]);
		} else {
			for (int i = 0; i < n - 1; i++) {
				Arrays.sort(array);
				array[i] = (array[n + i - 1] + array[n + i]) / 2;
				array[n - 1] = 0;
				array[n] = 0;
			}
			System.out.print(array[n - 2]);
		}

	}
}