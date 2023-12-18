import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Integer[] scanResult = scan();
		Arrays.sort(scanResult, Comparator.reverseOrder());

		System.out.println(calc(scanResult));
	}

	private static Integer[] scan() {

		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		Integer[] arr = new Integer[size];
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		return arr;
	}

	private static int calc(Integer[] arr) {

		int aliceTotal = 0;
		int bobTotal = 0;

		for (int i = 0; i < arr.length; i++) {

			if (i % 2 == 0) {
				aliceTotal += arr[i];
			} else {
				bobTotal += arr[i];
			}
		}
		return aliceTotal - bobTotal;
	}
}