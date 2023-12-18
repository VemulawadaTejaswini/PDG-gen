import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int K = scn.nextInt();
		int[] P = new int[N];

		int b = 1;
		int check = 0;
		for (int i = 0; i < N; i++) {
			P[i] = scn.nextInt();
			if(i > 0) {
				if(P[i] > P[i-1]) {
					b++;
					if(b>= K)check++;
				}else {
					b = 1;
				}
			}
		}
		PriorityQueue<Integer> max = new PriorityQueue<Integer>(new MyComp());
		PriorityQueue<Integer> min = new PriorityQueue<Integer>();

		boolean[] used = new boolean[N + 1];
		int[] A_max = new int[N - K + 1];
		int[] A_min = new int[N - K + 1];
		for (int i = 0; i <= N; i++) {
			if (i < K) {
				max.add(P[i]);
				min.add(P[i]);
			} else {
				int ma, mi;
				while (true) {
					ma = max.poll();
					if (!used[ma])
						break;
				}
				while (true) {
					mi = min.poll();
					if (!used[mi])
						break;
				}
				A_max[i - K] = ma;
				A_min[i - K] = mi;
				used[P[i - K]] = true;
				if (i != N) {
					max.add(P[i]);
					min.add(P[i]);
					max.add(ma);
					min.add(mi);
				}
			}
		}
		int ans = 1;
		for(int i = 0;i < N-K;i++) {
			if(A_max[i] < P[i+K] && A_min[i] == P[i]) {

			}else {
				ans++;
			}
		}
		ans -= Math.max(check-1, 0);


		System.out.println(ans);

	}

}

class MyComp implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		if (o1 > o2) {
			return -1;
		}
		if (o1 < o2) {
			return 1;
		}
		return 0;
	}

}
