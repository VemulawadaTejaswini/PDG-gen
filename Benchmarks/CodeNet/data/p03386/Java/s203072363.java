import java.util.*;

public class Main {

	public static void main(String[] args) {

		// A 以上 B 以下の整数の中で、小さい方から K 番目以内であるか、大きい方から K 番目以内である
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		int K = sc.nextInt();

		int mem = B - A + 1;
		int num[] = new int[mem];
		int i, n;
		for (i = A, n = 0; i <= B; i++, n++) {
			num[n] = i;
		}

		Arrays.sort(num);

		for (i = 0; i < K && i < mem - 1; i++) {
			System.out.println(num[i]);
		}

		int t = mem - K;
		if (i >= t) {
			t = i;
		}

		for (i = t; i <= mem - 1; i++) {
			System.out.println(num[i]);
		}

	}
}

