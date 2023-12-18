import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Scanner;

public class F {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int[] A = new int[N];
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < N; i++) {
			int a = scn.nextInt();
			A[a - 1]++;
		}

		for (int i = 0; i < N; i++) {
			if (A[i] == 0)
				continue;
			map.put(i, A[i]);
		}

		int shurui = map.size();
		for (int i = 1; i <= N; i++) {
			if (i > shurui) {
				System.out.println(0);
				continue;
			}
			if(i == 1) {
				System.out.println(N);
				continue;
			}

			int ans = 0;
			PriorityQueue<Pair> PQ = new PriorityQueue<Pair>();// (数, 数値)
			setPQ(PQ, A);

			while (PQ.size() >= i) {
				Pair[] P = new Pair[i];
				for (int j = 0; j < i; j++) {
					P[j] = PQ.poll();
				}
				ans += P[i - 1].first;
				for (int j = 0; j < i; j++) {
					P[j].first -= P[i - 1].first;
				}
				for(int j = 0;j < i;j++) {
					if(P[j].first!=0) {
						PQ.add(P[j]);
					}
				}
			}
			System.out.println(ans);
		}

	}

	public static void setPQ(PriorityQueue<Pair> PQ, int[] A) {
		for (int i = 0; i < A.length; i++) {
			if (A[i] == 0)
				continue;
			PQ.add(new Pair(A[i], i));
		}

	}
}

class Pair implements Comparable<Pair> {
	int first, second;

	public Pair(int f, int s) {
		this.first = f;
		this.second = s;
	}

	@Override
	public int compareTo(Pair o) {// Comparatorを自由記述せよ(これはfirstが小さい順, secondが小さい順)
		if (this.first > o.first) {
			return -1;
		}
		if (this.first < o.first) {
			return 1;
		}
		if (this.second < o.second) {
			return -1;
		}
		if (this.second > o.second) {
			return 1;
		}

		return 0;
	}
}