import java.util.*;

public class Main {
	Scanner sc;
	int N, M, P;
	int[][] nodes;
	int[][] edges;
	
	public Main() {
		sc = new Scanner(System.in);
	}
	
	private void calc() {
		N = sc.nextInt();
		M = sc.nextInt();
		P = sc.nextInt();
		
		nodes = new int[N+1][2];
		for (int i = 1; i <= N; i++) nodes[i][0] = Integer.MIN_VALUE;
		
		edges = new int[M+1][3];
		for (int i = 1; i <= M; i++) {
			edges[i][0] = sc.nextInt();
			edges[i][1] = sc.nextInt();
			edges[i][2] = sc.nextInt() - P;
		}
		
		nodes[1][0] = 0;
		nodes[N][1] = 1;
		boolean infinite = false;
		for (int i = 0; i < N; i++) {
			infinite = false;
			for (int j = 1; j <= M; j++) {
				nodes[edges[j][0]][1] |= nodes[edges[j][1]][1];
				int s = nodes[edges[j][0]][0];
				if (s == Integer.MIN_VALUE) continue;
				int p = s + edges[j][2];
				if (nodes[edges[j][1]][0] < p) {
					nodes[edges[j][1]][0] = p;
					if (nodes[edges[j][1]][1] > 0) infinite = true;
				}
			}
		}
		
		if (infinite) System.out.println(-1);
		else System.out.println(Math.max(0, nodes[N][0]));
		System.out.flush();
	}

	public static void main(String[] args) {
		new Main().calc();
	}
}
