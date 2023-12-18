import java.util.*;
public class Main {

	public static void main(String[] args) {
		int INF = Integer.MAX_VALUE/2;
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		List<Integer>[] edge = new ArrayList[N];
		for(int i = 0; i < N; i++)
		    edge[i] = new ArrayList<>();
		for (int i = 0; i < N-1; i++) {
		    int a = sc.nextInt()-1;
		    int b = sc.nextInt()-1;
		    edge[a].add(b);
		    edge[b].add(a);
		}
		Queue<Integer> q = new ArrayDeque<>();
		q.add(0);
		int[] d1 = new int[N];
		Arrays.fill(d1, 1, N, INF);
		while(q.size() > 0) {
			int x = q.poll();
			for(int y : edge[x]) {
				if(d1[y] == INF) {
					d1[y] = d1[x] + 1;
					q.add(y);
				}
			}
		}
		q.add(N-1);
		int[] d2 = new int[N];
		Arrays.fill(d2, 0, N-1, INF);
		while(q.size() > 0) {
			int x = q.poll();
			for(int y : edge[x]) {
				if(d2[y] == INF) {
					d2[y] = d2[x] + 1;
					q.add(y);
				}
			}
		}
		int fn = 0;
		for(int i = 0; i < N; i++)
			if(d1[i] <= d2[i])
				fn++;
		System.out.println(fn >= N-fn ? "Fennec" : "Snuke");
	}

}