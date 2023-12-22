import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner sc = new Scanner(System.in);

		isprime = new boolean[MAX_N + 1];
		numofprimes = new int[MAX_N + 1];

		Arrays.fill(isprime, true);
		isprime[0] = isprime[1] = false;
		for (int i = 2; i*i <= MAX_N; i++) {
			if (isprime[i] == false) continue;
			for (int j = i+1; j <=MAX_N; j++) {
				if (j % i == 0) isprime[j] = false;
			}
		}

		for (int i = 2; i <= MAX_N; i++) {
			if (isprime[i]) {
				numofprimes[i] = numofprimes[i-1] + 1;
			} else {
				numofprimes[i] = numofprimes[i-1];
			}
		}

		while ( sc.hasNext() ) {
			int n = sc.nextInt();
			System.out.println( numofprimes[n] );
		}
	}

	public static final int MAX_N = 999_999;

	public static int[] numofprimes;

	public static boolean[] isprime;

}