import java.util.*;

// ABC 51-D
// https://abc051.contest.atcoder.jp/tasks/abc051_d

public class Main {

	static int N;
	static int[][] map;
	static Set<Path> paths;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		N = in.nextInt();
		int M = in.nextInt();
		paths = new TreeSet<Path>();
		map = new int[N][N];
		
		for (int i = 0; i < M; i++) {
			int a = in.nextInt() - 1;
			int b = in.nextInt() - 1;
			int c = in.nextInt();
			
			map[a][b] = c;
			map[b][a] = c;
		}
		
		for (int i = 0; i < N; i++) {
			for (int j = i + 1; j < N; j++) {
				dijkstra(i, j);
			}
		}
		System.out.println(M - paths.size());
	}
	
	public static void dijkstra(int start, int end) {
		int[] visited = new int[N];
		PriorityQueue<Custom_Pair> queue = new PriorityQueue<Custom_Pair>();
		queue.add(new Custom_Pair(start, 0));
		
		while (queue.size() > 0) {
			Custom_Pair p = queue.poll();
			
			if (visited[p.p] == 1) {
				continue;
			}
			visited[p.p] = 1;
			p.path.add(p.p);
			
			if (p.p == end) {
//				System.out.printf("(%d, %d)\n", start, end);
				for (int i = 0; i < p.path.size() - 1; i++) {
					Path pp = new Path(p.path.get(i), p.path.get(i + 1));
//					System.out.printf("  %d => %d", pp.a, pp.b);
					if (!paths.contains(pp)) {
						paths.add(pp);
//						System.out.printf(" (NEW)");
					}
//					System.out.println();
				}
				break;
			}
			
			for (int i = 0; i < N; i++) {
				if (map[p.p][i] > 0 && visited[i] == 0) {
					try {
						Custom_Pair newPair = (Custom_Pair) p.clone();
						newPair.p = i;
						newPair.cost += map[p.p][i];
						queue.add(newPair);
					} catch (Exception e) {
						
					}
				}
			}
		}
	}
}

class Custom_Pair implements Comparable<Custom_Pair> {
	int p;
	int cost;
	ArrayList<Integer> path;
	
	public Custom_Pair(int p, int cost) {
		super();
		this.p = p;
		this.cost = cost;
		this.path = new ArrayList<Integer>();
	}

	@Override
	public int compareTo(Custom_Pair o) {
		return this.cost - o.cost;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Custom_Pair p = new Custom_Pair(this.p, this.cost);
		for (int i = 0; i < this.path.size(); i++) {
			p.path.add(this.path.get(i));
		}
		return p;
	}
}

class Path implements Comparable<Path> {
	int a;
	int b;
	
	public Path(int a, int b) {
		super();
		this.a = Math.min(a, b);
		this.b = Math.max(a, b);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Path) {
			Path o = (Path) obj;
			 return this.a == o.a && this.b == o.b;
		} else {
			return false;
		}
	}

	@Override
	public int compareTo(Path o) {
		if (this.a == o.a && this.b == o.b) {
			return 0;
		} else {
			return 1;
		}
	}
}