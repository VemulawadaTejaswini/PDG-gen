import java.util.*;
import java.math.*;
import java.lang.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] aArray = new int[n];
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		// List<Integer> valueList = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			// aArray[i] = Integer.parseInt(sc.next());
			pq.add(sc.nextInt());
		}
		// Arrays.sort(aArray);
		// int minimumValue = aArray[0];
		for (int i = 0; i < m; i++) {
			// System.out.println(pq.size());
			int b = sc.nextInt();
			int c = sc.nextInt();
			int minimumValue = pq.peek();
			if (c < minimumValue) {
				// pq.add(minimumValue);
				continue;
			}
			for (int j = 0; j < b; j++) {
				int curA = pq.poll();
				if (curA < c) {
					pq.add(c);
				} else {
					pq.add(curA);
					break;
				}
			}
			// Arrays.sort(aArray);
		}

		// Collections.sort(valueList);
		// Collections.reverse(valueList);

		long result = 0;
		// System.out.println(pq.size());

		for (int i = 0; i < n; i++) {
			result += pq.poll();
			// System.out.println(result);
		}

		System.out.println(result);

	}

}
