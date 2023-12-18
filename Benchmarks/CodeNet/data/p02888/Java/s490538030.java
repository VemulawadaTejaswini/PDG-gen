import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.next());
		Integer[] arr = new Integer[n];

		int count = 0;
		int a = 0;
		int b = 0;
		int c = 0;

		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(sc.next());
		}

		Arrays.sort(arr);

		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				a = arr[i];
				b = arr[j];
				for (int k = 0; k < n; k++) {
					if (arr[k] != a && arr[k] != b && arr[k] < a + b && arr[k] + a > b) {
						count++;
					} else {
						break;
					}
				}
			}
		}

		System.out.println(count);

	}
}