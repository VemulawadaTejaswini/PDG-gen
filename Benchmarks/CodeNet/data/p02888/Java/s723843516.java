import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.next());
		int[] arr = new int[n];
		int count = 0;
		int a = 0;
		int b = 0;
		int c = 0;

		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(sc.next());
		}

		for (int i = 0; i < n - 2; i++) {
			for (int j = i + 1; j < n - 1; j++) {
				for (int k = j + 1; k < n; k++) {
					a = arr[i];
					b = arr[j];
					c = arr[k];
					if (a < b + c) {
						if (b < c + a) {
							if (c < a + b) {
								count++;
							}
						}
					}
				}
			}
		}

		System.out.println(count);

	}
}
