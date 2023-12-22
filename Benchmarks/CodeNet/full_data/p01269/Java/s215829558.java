import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			int L = sc.nextInt();
			
			if (N + M + L == 0)
				break;
		
			int[][] D = new int[N+1][N+1];
			int[][] P = new int[N+1][N+1];
			for (int i = 0; i <= N; i++) {
				Arrays.fill(D[i], Integer.MAX_VALUE);
				Arrays.fill(P[i], Integer.MAX_VALUE);
			}
		
			for (int i = 0; i < M; i++) {
				int a = sc.nextInt();
				int b = sc.nextInt();
				D[a][b] = sc.nextInt();
				D[b][a] = D[a][b];
				P[a][b] = sc.nextInt();
				P[b][a] = P[a][b];
			}
			
			System.out.println(solve(N, M, L, D, P));
		}
	}
	
	public static int solve(int N, int M, int L, int[][] D, int[][] P) {
		boolean[][] visit = new boolean[N+1][L+1];
		PriorityQueue<Node> que = new PriorityQueue<Node>(11, new Comparator<Node>() {
			public int compare(Node n1, Node n2) {
				return n1.enemy - n2.enemy;
			}
		});
		que.add(new Node(1, L, 0));
		while(que.isEmpty() == false) {
			Node node = que.poll();
			if (visit[node.pos][node.money])
				continue;
			
			visit[node.pos][node.money] = true;
			if (node.pos == N)
				return node.enemy;
			
			for (int i = 1; i <= N; i++) {
				if (D[node.pos][i] == Integer.MAX_VALUE)
					continue;
				
				que.add(new Node(i, node.money, node.enemy + P[node.pos][i]));
				if (node.money >= D[node.pos][i]) {
					que.add(new Node(i, node.money - D[node.pos][i], node.enemy));
				}
			}
		}
		return 0;
	}
}

class Node {
	int pos;
	int money;
	int enemy;
	public Node(int p, int m, int e) {
		this.pos = p;
		this.money = m;
		this.enemy = e;
	}
}