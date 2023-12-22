import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] arg) {
		while (true) {
			int a = sc.nextInt();
			int L = sc.nextInt();
			if (L == 0) break;
			int[] as = new int[21];
			as[0] = a;
			OUT: for (int i = 1;; ++i) {
				as[i] = next(as[i - 1], L);
				for (int j = 0; j < i; ++j) {
					if (as[j] == as[i]) {
						System.out.println(j + " " + as[i] + " " + (i - j));
						break OUT;
					}
				}
			}
		}
	}

	static int next(int a, int L) {
		int[] d = new int[L];
		for (int i = 0; i < L; ++i) {
			d[i] = a % 10;
			a /= 10;
		}
		Arrays.sort(d);
		int hi = 0;
		int lo = 0;
		for (int i = 0; i < L; ++i) {
			hi *= 10;
			hi += d[L - 1 - i];
			lo *= 10;
			lo += d[i];
		}
		return hi - lo;
	}

}