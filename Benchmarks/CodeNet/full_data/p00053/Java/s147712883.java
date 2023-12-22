import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ArrayList<Integer> primes = prime(104740);
		Scanner sc = new Scanner(System.in);

			while (sc.hasNext()) {
				int n = sc.nextInt();

					if (n == 0) {
						break;
					}

				long sum = 0;

					for (int i = 0; i < n; i++) {
						sum += primes.get(i);
					}

				System.out.println(sum);
			}

		sc.close();

	}

	public static ArrayList<Integer> prime(int n) {
		boolean[] arr = new boolean[n];
		ArrayList<Integer> primes = new ArrayList<Integer>();
		int limit = (int)Math.sqrt(arr.length);

		for (int j = 2 ; j <= limit; j++) {
			for(int k = 2; k * j < arr.length; k++) {
				arr[k * j] = true;
			}
		}

		arr[0] = arr[1] = true;

		for (int i = 0; i < arr.length; i++) {
			if (!arr[i]) {
				primes.add(i);
			}
		}

		return primes;
	}
}
