import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt(), k = scan.nextInt();
		int[] array = new int[n];
		long count = 0;
		for (int i = 0; i < n; i++) {
			array[i] = scan.nextInt();
		}
		Arrays.sort(array);
		for (int i = n - 1; i > 0; i--) {
			if (array[i] > array[i - 1]) {
				count += i;
			} else {
				break;
			}
		}
		System.out.println((count*(k+1))%(Math.pow(10, 9)+7));
	}
}
