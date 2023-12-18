

import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		String anser = "Yes";

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		int[] A = new int[N];
		for (int i = 0; i < N; i++) {
			A[i] = scan.nextInt();
			if (map.containsValue(A[i])) {
				anser = "No";
			} else {
				map.put(i, A[i]);
			}
		}

		System.out.println(anser);
	}

}
