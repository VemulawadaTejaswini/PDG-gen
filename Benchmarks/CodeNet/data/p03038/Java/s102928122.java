import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

//	static Map<Integer, Integer> map = new HashMap<>();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[m];
		int[] c = new int[m];
		long sum = 0;
		long temp = 0;
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			pq.offer(a[i]);
//			mapSetKey(a[i]);
		}
		for (int i = 0; i < m; i++) {
			b[i] = sc.nextInt();
			c[i] = sc.nextInt();
			for (int j = 0; j < b[i]; j++) {
				pq.offer(c[i]);
			}
//			mapSetValue(c[i], b[i]);
		}
		for (int i = 0; i < n; i++) {
			temp = (int)pq.poll();
			sum += temp;
//			if (map.get(temp) == 1) {
//				map.remove(temp);
//			} else {
//				map.put(temp, (map.get(temp) - 1));
//			}
		}
		System.out.println(sum);
	}

//	private static void mapSetKey(int key) {
//		if (map.containsKey(key)) {
//			map.put(key, map.get(key) + 1);
//		} else {
//			map.put(key, 1);
//		}
//	}
//
//	private static void mapSetValue(int key, int value) {
//		if (map.containsKey(key)) {
//			map.put(key, map.get(key) + value);
//		} else {
//			map.put(key, value);
//		}
//	}
}