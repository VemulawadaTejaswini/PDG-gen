import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] d = new int[N];
		Arrays.fill(d, -1);
		Map<Integer, Map<Integer, Integer>> l = new HashMap<>();
		Map<Integer, List<Integer>> m = new HashMap<>();
		for(int i = 0; i < N; i++) {
			m.put(i, new ArrayList<>());
			l.put(i, new HashMap<Integer, Integer>());
		}
		for(int i = 0; i < N-1; i++) {
			int u = sc.nextInt()-1;
			int v = sc.nextInt()-1;
			int w = sc.nextInt() % 2;
			m.get(u).add(v);
			m.get(v).add(u);
			l.get(u).put(v, w);
			l.get(v).put(u, w);
		}
		d[0] = 0;
		Deque<Integer> q = new ArrayDeque<>();
		q.add(0);
		while(q.size() > 0) {
			int r = q.pollFirst();
			for(int p : m.get(r)) {
				if(d[p] != -1)
					continue;
				d[p] = d[r] + l.get(r).get(p);
				q.offerFirst(p);
			}
		}
		for(int i = 0; i < N; i++) {
			if(d[i] % 2 == 0)
				System.out.println(0);
			else
				System.out.println(1);
		}
	}

}