import java.util.*;

public class Main {
	static class Value {
		int r,c,a;

		public Value(int r, int c, int a) {
			this.r = r;
			this.c = c;
			this.a = a;
		}
		
	}
	static class Node {
		ArrayList<Integer> to = new ArrayList<>();
		ArrayList<Integer> diff = new ArrayList<>();

		public void addPath(int to, int diff) {
			this.to.add(to);
			this.diff.add(diff);
		}
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int R = sc.nextInt();
		int C = sc.nextInt();
		int N = sc.nextInt();
		Value[] v = new Value[N];
		for(int i=0; i<N; i++)
			v[i] = new Value(sc.nextInt()-1, sc.nextInt()-1, sc.nextInt());
		
		if(solve(R, C, N, v))
			System.out.println("Yes");
		else
			System.out.println("No");
		sc.close();
	}
	
	static boolean solve(int R, int C, int N, Value[] v1) {
		Value[] v2 = new Value[N];
		long base = v1[0].a;
		for(int i=0; i<N; i++)
			v2[i] = new Value(v1[i].c, v1[i].r, v1[i].a);
		
		if(!check(R, C, N, v1, 0))
			return false;
		
		if(!check(C, R, N, v2, 1))
			return false;
		
		return minv[0] + (minv[1]-base)>=0;
	}
	static long[] minv = new long[2];
	
	static boolean check(int R, int C, int N, Value[] v, int dim) {
		LinkedList<Pos> q = new LinkedList<>();
		q.add(new Pos(v[0].c, v[0].a));
		Arrays.sort(v, new Comparator<Value>() {
			public int compare(Value v1, Value v2) {
				if(v1.r==v2.r)
					return v1.c-v2.c;
				else
					return v1.r-v2.r;
			}
		});
		
		Node[] nodes = new Node[C];
		for(int i=0; i<C; i++)
			nodes[i] = new Node();
		for(int i=0; i<N-1; i++) {
			if(v[i].r==v[i+1].r) {
				nodes[v[i].c].addPath(v[i+1].c, v[i+1].a-v[i].a);
				nodes[v[i+1].c].addPath(v[i].c, v[i].a-v[i+1].a);
			}
		}
		
		long[] x = new long[C];
		boolean[] visited = new boolean[C];
		minv[dim]=Long.MAX_VALUE;
		
		while(q.size()>0) {
			Pos next = q.poll();
			if(visited[next.cur]) {
				if(next.v != x[next.cur]) {
					return false;
				} else {
					continue;
				}
			}
			x[next.cur] = next.v;
			minv[dim] = Math.min(minv[dim], x[next.cur]);
			for(int i=0; i<nodes[next.cur].to.size(); i++) {
				q.add(new Pos(nodes[next.cur].to.get(i), x[next.cur]+nodes[next.cur].diff.get(i)));
			}
			
			visited[next.cur]=true;
		}
		
		return true;
	}
	
	static class Pos {
		int cur;
		long v;
		public Pos(int cur, long v) {
			this.cur = cur;
			this.v = v;
		}
		
	}
}
