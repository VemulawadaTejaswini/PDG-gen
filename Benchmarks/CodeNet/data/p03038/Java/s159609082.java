import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		Queue<Long> pq = new PriorityQueue<Long>(N);
		for (int i = 0; i < N; i++) {
			pq.add(sc.nextLong());
		}
		for (int i = 0; i < M; i++) {
			int cnt = 0;
			int maxCnt = sc.nextInt(); // B[i]
			long num = sc.nextLong(); // C[i]
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
		sc.close();
	}
}