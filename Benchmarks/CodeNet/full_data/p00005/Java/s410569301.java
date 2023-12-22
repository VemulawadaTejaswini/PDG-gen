import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		long[] arr = new long[2];
		while (scanner.hasNext()) {
			long a = scanner.nextInt();
			long b = scanner.nextInt();
			arr[0] = a;
			arr[1] = b;

			while (true) {
				if (arr[0] == arr[1]) {
					System.out.print(arr[0]);
					System.out.print(" ");
					System.out.println(a * b / arr[0]);
					break;
				}
				arr[0] = arr[0] - arr[1];
				sortDesc(arr);
			}
		}
	}

	private static void sortDesc(long[] arr) {
		if (arr[0] > arr[1]) {
			return;
		}
		long work = arr[0];
		arr[0] = arr[1];
		arr[1] = work;
	}
}