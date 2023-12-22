import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

			while(sc.hasNext()) {
				int n = sc.nextInt();
					if (n == 0) {
						break;
					}

				boolean[] arr = new boolean[n + 1];
				int limit = (int)Math.sqrt(arr.length);
				prime(arr, limit, n);
			}
		sc.close();


	}

	private static void prime(boolean[] arr, int limit, int n) {
		for (int j = 2 ; j <= limit; j++) {
			for(int k = 2; k * j < arr.length; k++) {
				arr[k * j] = true;
			}
		}
		arr[0] = arr[1] = true;

		for (int i = n; i > 2; i--) {
			if (arr[i] == false && arr[i - 2] == false) {
				System.out.printf("%d %d\n", i - 2, i);
				break;
			}
		}
	}
}
