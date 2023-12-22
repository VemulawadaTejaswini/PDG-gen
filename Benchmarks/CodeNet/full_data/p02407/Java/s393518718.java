import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] arr = new int[n];

		for(int i = 0; i < n; i++) {
			arr[n - 1 - i] = sc.nextInt();

		}

		for(int i = 0; i < n; i++) {
			System.out.print(arr[n - 1 - i]);
			if (i < n - 1) {
				System.out.print(" ");
			}
		}
		System.out.println();
		sc.close();
	}

}
