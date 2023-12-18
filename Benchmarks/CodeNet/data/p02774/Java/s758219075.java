
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		int K = scan.nextInt();

		int[] A = new int[N];

		int countm = 0;
		int count0 = 0;
		int counts = 0;

		ArrayList<Integer> negative = new ArrayList<Integer>();
		ArrayList<Integer> positive = new ArrayList<Integer>();
		ArrayList<Integer> product = new ArrayList<Integer>();

		for (int i = 0; i < N; i++) {
			A[i] = scan.nextInt();
			if (A[i] < 0) {
				countm++;
				negative.add(A[i]);
			}
			if (A[i] == 0)
				count0++;
			if (A[i] > 0) {
				counts++;
				positive.add(A[i]);
			}
		}

		int anser = 0;

		if (K <= countm * counts) {
			for (int i : negative) {
				for (int j : positive) {
					product.add(i * j);
				}
			}
		} else if (K > countm * counts + count0 * countm + count0 * counts) {
			for (int i : negative) {
				for (int j : negative) {
					if (i < j)
						product.add(i * j);
				}
			}
			for (int i : positive) {
				for (int j : positive) {
					if (i < j)
						product.add(i * j);
				}
			}

		}

		Collections.sort(product);

		System.out.println(product.get(K - 1));

	}

}
