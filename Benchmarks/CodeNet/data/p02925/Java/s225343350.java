import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Deque<Integer>[] A = new Deque[N];
		for(int i = 0; i < N; i++) {
			A[i] = new ArrayDeque<>();
			for(int j = 0; j < N-1; j++) {
				A[i].push(sc.nextInt()-1);
			}
		}
		int[] depth = new int[N];
		Deque<Integer> d = new ArrayDeque<>();
		int[] w = new int[N];
		Arrays.fill(w, -1);
		for(int i = 0; i < N; i++)
			d.push(i);
		while(d.size() > 0) {
			int x = d.poll();
			if(A[x].size() == 0)
				continue;
			int y = A[x].pop();
			if(w[y] == x) {
				depth[x] = depth[y] = Math.max(depth[x], depth[y])+1;
				d.push(x);
				d.push(y);
			}
			else
				w[x] = y;
		}
		for(int i = 0; i < N; i++) {
			if(A[i].size() != 0) {
				System.out.println(-1);
				return;
			}
		}
		System.out.println(Arrays.stream(depth).max().getAsInt());

	}

}
