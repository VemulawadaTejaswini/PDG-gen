import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main();
	}

	final int MAX = 100000;

	public Main() {
		Scanner sc = new Scanner(System.in);
		boolean sieve[] = new boolean[MAX + 1];
		Arrays.fill(sieve, true);
		Arrays.fill(sieve, 0, 2, false);
		for (int i = 2;i < sieve.length;++ i) if (sieve[i]) for (int j = 2 * i;j < sieve.length;j += i) sieve[j] = false; // エラトステネスの篩
		int cumsum[] = new int[MAX + 1];
		cumsum[0] = 0;
		for (int i = 1;i < cumsum.length;++ i) cumsum[i] = cumsum[i - 1] + (sieve[i] & sieve[(i + 1)/ 2] ? 1 : 0); // 累積和
		int Q = sc.nextInt();
		while(Q-- != 0) {
			int l = sc.nextInt(), r = sc.nextInt();
			System.out.println(cumsum[r] - cumsum[l - 1]);
		}
		sc.close();
	}
}
