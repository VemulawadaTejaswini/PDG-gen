import java.util.Scanner;

public class Main {

	int next[];
	long c[];
	int count;
	long depth[];
	
	static Main edge[];
	
	public Main(int next[], long c[], int count, long depth[]) {
		this.next = next;
		this.c = c;
		this.count = count;
		this.depth = depth;
	}
	
	public void dfs(int v, int p, long d) {
		depth[v] = d;
		int n = edge.length;
		for(int i = 0; i < n; ++i) {
			int next = edge[v].next[i];
			if(next == 0)break;
			if(next == p)continue;
			long cost = edge[v].c[i];
			dfs(next, v, d + cost);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n, a, b, q, k, x, y;
		long c;
		n = sc.nextInt();
		edge = new Main[n + 1];
		for(int i = 0; i <= n; ++i) {
			edge[i] = new Main(new int[n], new long[n], 0, new long[n + 1]);
		}
		for(int i = 0; i < n - 1; ++i) {
			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextLong();
			int tmp = edge[a].count;
			edge[a].next[tmp] = b;
			edge[a].c[tmp] = c;
			edge[a].count++;
			tmp = edge[b].count;
			edge[b].next[tmp] = a;
			edge[b].c[tmp] = c;
			edge[b].count++;
		}
		
		q = sc.nextInt();
		k = sc.nextInt();
		edge[k].dfs(k,  -1,  0);
		for(int i = 0; i < q; ++i) {
			x = sc.nextInt();
			y = sc.nextInt();
			long ans = edge[k].depth[x] + edge[k].depth[y];
			System.out.println(ans);
		}
		sc.close();
	}

}
