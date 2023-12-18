import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] array = new int[n];
		int count = 0;

		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}

		for (int i = 0; i < n - 1; i++) {
			if (array[i+1] - array[i] != 1) {
				count += 1;
			}
		}

		String message = (count == 0 || count == 2) ? "YES" : "NO";
		System.out.println(message);

	}

}
