// Space-Time Sugoroku Road
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] road = new int[N];
		for (int i = 0; i < N; i++)
			road[i] = sc.nextInt();
		int[] to = new int[N];
		Set<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < N; i++) {
			if (to[i] != -1) {
				if (road[i] == 0) {
					to[i] = i;
					continue;
				}
				int t = i;
				while (set.add(t) && road[t] != 0)
					t += road[t];
				if (road[t] != 0)
					for (Integer j : set)
						to[j] = -1;
				else
					for (Integer j : set)
						to[j] = t;
				set.clear();
			}
		}
		int[] turn = new int[N];
		for (int i = 1; i <= 6; i++) {
			int t = i;
			if (t < N && to[t] >= t && turn[to[t]] == 0) {
				turn[to[t]] = 1;
			}
		}
		for (int i = 0; i < N; i++)
			if (turn[i] > 0) {
				for (int j = 1; j <= 6; j++) {
					int t = i + j;
					if (t < N && to[t] >= t && turn[to[t]] == 0)
						turn[to[t]] = turn[i] + 1;
				}
			}
		// for (int i = 0; i < N; i++)
		// System.out.println(to[i]);
		// System.out.println();
		// for (int i = 0; i < N; i++)
		// System.out.println(turn[i]);
		// System.out.println();
		System.out.println(turn[N - 1]);
		sc.close();
	}
}