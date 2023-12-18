import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int P = sc.nextInt();
		V[] vs = new V[N];
		for (int i = 0; i < N; i++)
			vs[i] = new V(i);
		for (int i = 0; i < M; i++) {
			int a = sc.nextInt() - 1;
			int b = sc.nextInt() - 1;
			int c = P - sc.nextInt();
			vs[a].add(new int[] {b, c});
		}
		int[] reachable = new int[N];
		reachable[0] = 1;
		reachable[N-1] = 2;
		for (int i = 0; i < N; i++) {
			for (V v: vs) {
				for (int[] e: v) {
					if (reachable[v.id] % 2 == 1)
						reachable[e[0]] |= 1;
					if (reachable[e[0]] / 2 == 1)
						reachable[v.id] |= 2;
				}
			}
		}
		int[] d = new int[N];
		Arrays.fill(d, 1 << 25);
		d[0] = 0;
		for (int k = 0; k < N; k++) {
			for (V v: vs) {
				if (reachable[v.id] % 2 == 0) continue;
				for (int[] e: v) {
					if (reachable[e[0]] / 2 == 1 && d[e[0]] > d[v.id] + e[1]) {
						d[e[0]] = d[v.id] + e[1];
						if (k == N - 1) {
							System.out.println(-1);
							return;
						}
					}
				}
			}
		}
		System.out.println(d[N-1] == 1 << 25 ? -1 : Math.max(0, -d[N-1]));
	}
	static class V extends ArrayList<int[]> {
		int id;
		V(int _id) {id = _id;}
	}
}