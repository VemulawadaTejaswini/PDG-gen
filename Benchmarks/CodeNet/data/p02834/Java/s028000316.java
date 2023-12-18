import java.util.*;

class Main {
	Scanner sc;
	int N;
	int[] p = new int[2];
	List<Integer>[] to;
	int[][] d;
	
	@SuppressWarnings("unchecked")
	private void calc() {
		sc = new Scanner(System.in);
		N = sc.nextInt();
		p[0] = sc.nextInt()-1;
		p[1] = sc.nextInt()-1;
		to = new List[N];
		for (int i = 0; i < N; i++) to[i] = new ArrayList<>();
		
		for (int i = 0; i < N-1; i++) {
			int a = sc.nextInt()-1;
			int b = sc.nextInt()-1;
			to[a].add(b);
			to[b].add(a);
		}
		
		d = new int[3][N];
		for (int i = 0; i < N; i++) d[0][i] = d[1][i] = -1;
		Deque<Integer> stack = new ArrayDeque<>();
		for (int i = 0; i < 2; i++) {
			stack.push(p[i]);
			d[i][p[i]] = 0;
			while (!stack.isEmpty()) {
				int from = stack.pop();
				for (int vtx : to[from]) {
					if (d[i][vtx] > -1) continue;
					stack.push(vtx);
					d[i][vtx] = d[i][from] + 1;
				}
			}
		}
		
		System.arraycopy(d[1], 0, d[2], 0, N);
		for (int i = 0; i < N-1; i++)
			for (int j = 0; j < N; j++) {
				for (int v : to[j]) 
					if (d[0][v] < d[1][v]) d[2][v] = Math.max(d[2][v], d[2][j]);
			}
		System.out.println(d[2][p[0]]-1);
	}

	public static void main(String[] args) {
		new Main().calc();
	}
}