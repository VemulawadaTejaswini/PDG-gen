import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		boolean[] arr = new boolean[55000];
		int limit = (int)Math.sqrt(arr.length);
		arr =  prime(arr, limit);

		while(sc.hasNext()) {
			int t = sc.nextInt();
			prev_next_prime(arr, t);
		}

		sc.close();

	}

	private static void prev_next_prime(boolean[] arr, int t) {
		int p = t;
		int n = t;

		do {
			p--;
		}while(arr[p]);

		do {
			n++;
		}while(arr[n]);

		System.out.printf("%d %d\n",p ,n);


	}

	private static boolean[] prime(boolean[] arr, int limit) {
		for (int j = 2 ; j <= limit; j++) {
			for(int k = 2; k * j < arr.length; k++) {
				arr[k * j] = true;
			}
		}

		return arr;
	}

}
