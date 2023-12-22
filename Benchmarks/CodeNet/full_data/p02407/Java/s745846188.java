import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Integer n = sc.nextInt();

		Integer[] array = new Integer[n];

		for (Integer i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}

		for (Integer j = n; j > 0; j--) {
			if (j - 1 == 0) {
				System.out.println(array[j - 1]);
				return;
			}
			System.out.print(array[j - 1]);
			System.out.print(" ");
		}

	}

}

