import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {

		while(sc.hasNext()) {
			int[] arr = inputRan();
			int limit = (int)Math.sqrt(arr.length);
			prime(arr, limit);
		}


	}
	private static void prime(int[] arr, int limit) {
		int cnt = 0;

		for (int j = 2 ; j <= limit; j++) {
			for(int k = 2; k * j <= arr.length; k++) {
				arr[(k * j) - 1] = 1;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 1) {
				cnt++;
			}
		}

		System.out.println(cnt);

	}
	private static int[] inputRan() {
		int x = sc.nextInt();
		int[] arr = new int[x];

		for (int i = 0; i < x; i++) {
			arr[i] = i + 1;
		}

		return arr;
	}

}
