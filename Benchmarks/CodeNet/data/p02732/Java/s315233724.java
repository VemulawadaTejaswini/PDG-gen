import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];

		for (int i = 0; i < A.length; i++) {
			A[i] = sc.nextInt();
		}

		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < A.length; i++) {

			if (map.get(A[i]) == null) {
				map.put(A[i], 1);
			} else {
				map.put(A[i], map.get(A[i]) + 1);
			}
		}

		int sum = 0;
		for (Entry<Integer, Integer> entry : map.entrySet()) {
			sum += entry.getValue() * (entry.getValue() - 1) / 2;
		}

		for (int i = 0; i < A.length; i++) {
			int result = (map.get(A[i]) - 1) * (map.get(A[i]) - 2) / 2;
			System.out.println(result);
		}
	}

}