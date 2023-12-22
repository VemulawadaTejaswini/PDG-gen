
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		//int[] A = new int[N];
		HashMap<Integer, Integer> A = new HashMap<Integer, Integer>();
		for (int i = 1; i <= N; i++) {
			int tmp = sc.nextInt();
			if (tmp <= 199998) {
				A.put(i, tmp);
			} else {
			}
		}
		HashSet<Integer> s = new HashSet<Integer>();
		for (int i : A.keySet()) {
			for (int j : A.keySet()) {
				if (i == j) {
				} else if (Math.abs(i - j) == A.get(i) + A.get(j)) {
					s.add(i + j);
				}

			}
		}

		System.out.println(s.size());

	}
}
