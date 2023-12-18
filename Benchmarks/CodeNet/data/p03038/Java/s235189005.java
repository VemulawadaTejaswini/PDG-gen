import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		Queue<Long> pq = new PriorityQueue<Long>(N, new SmallerComparator());
		for (int i = 0; i < N; i++) {
			pq.add(sc.nextLong());
		}
		int[] B = new int[M];
		long[] C = new long[M];
		for (int i = 0; i < M; i++) {
			B[i] = sc.nextInt();
			C[i] = sc.nextLong();
		}
		sc.close();

		for (int i = 0; i < M; i++) {
			int maxCnt = B[i];
			int cnt = 0;
			long num = C[i];
			while (true) {
				// 最小値がC[i]より小さければ置き換え
				if (pq.peek() < num) {
					pq.poll();
					pq.add(num);

					// B[i]まで来たら終わり
					cnt++;
					if (cnt == maxCnt) {
						break;
					}
				} else {
					break;
				}
			}
		}

		long ans = 0;
		for (int i = 0; i < N; i++) {
			ans += pq.poll();
		}
		System.out.println(ans);
	}
}

class SmallerComparator implements Comparator {
	public int compare(Object obj1, Object obj2) {
		long num1 = (long) obj1;
		long num2 = (long) obj2;

		if (num1 > num2) {
			return 1;
		} else if (num1 < num2) {
			return -1;
		} else {
			return 0;
		}
	}
}
