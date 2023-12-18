import java.awt.Point;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		List<Point>[] edge = new ArrayList[N];
		for(int i = 0; i < N; i++)
		    edge[i] = new ArrayList<>();
		for (int i = 0; i < N-1; i++) {
		    int a = sc.nextInt()-1;
		    int b = sc.nextInt()-1;
		    int c = sc.nextInt();
		    edge[a].add(new Point (b, c));
		    edge[b].add(new Point (a, c));
		}
		int Q = sc.nextInt();
		int K = sc.nextInt()-1;
		long[] d = new long[N];
		boolean[] used = new boolean[N];
		used[K] = true;
		Queue<Integer> q = new ArrayDeque<>();
		q.offer(K);
		while(q.size() > 0) {
			int x = q.poll();
			for(Point y : edge[x]) {
				if(!used[y.x]) {
					q.offer(y.x);
					d[y.x] = d[x] + y.y;
					used[y.x]= true; 
				}
			}
		}
		for(int i = 0; i < Q; i++)
			System.out.println(d[sc.nextInt()-1] + d[sc.nextInt()-1]);
	}

}