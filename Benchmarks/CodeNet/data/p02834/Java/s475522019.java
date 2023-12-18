import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int u = sc.nextInt(), v = sc.nextInt();
		Map<Integer, HashSet<Integer>> edge = new HashMap<>();
		for(int i = 1; i <= N; i++)
		        edge.put(i,  new HashSet<>());
		for (int i = 1; i <= N-1; i++) {
		        int A = sc.nextInt(), B = sc.nextInt();
		        edge.get(A).add(B);
		        edge.get(B).add(A);
		}
		int[] da = new int[N+1];
		Arrays.fill(da, -1);
		da[v] = 0;
		Queue<Integer> qa = new ArrayDeque<>();
		for(int i : edge.get(v)) {
			qa.offer(i);
			da[i] = 1;
		}
		while(qa.size() > 0) {
			int x = qa.poll();
			for(int i : edge.get(x)) {
				if(da[i] == -1) {
					da[i] = da[x] + 1;
					qa.offer(i);
				}
			}
		}
		int[] dt = new int[N+1];
		Arrays.fill(dt, -1);
		dt[u] = 0;
		Queue<Integer> qt = new ArrayDeque<>();
		for(int i : edge.get(u)) {
			qt.offer(i);
			dt[i] = 1;
		}
		while(qt.size() > 0) {
			int x = qt.poll();
			for(int i : edge.get(x)) {
				if(dt[i] == -1) {
					dt[i] = dt[x] + 1;
					qt.offer(i);
				}
			}
		}
		int ans = 0;
		for(int i = 1; i <= N; i++) {
			if(da[i] > dt[i])
				ans = Math.max(ans, (da[i]+dt[i])/2);
		}
		System.out.println(ans);

	}

}