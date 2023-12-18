import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		final int N = Integer.parseInt(scan.nextLine());
		final int[] array = new int[N];
		for (int i = 0; i < N; i++) {
			array[i] = Integer.parseInt(scan.next());
		}
		scan.close();

		int count = 0;
		for (int i = 0; i + 2 < N; i++) {
			if (array[i] < array[i + 1] && array[i + 1] < array[i + 2]) {
				count++;
			} else if (array[i + 2] < array[i + 1] && array[i + 1] < array[i]) {
				count++;
			}
		}

		System.out.println(count);

	}

}