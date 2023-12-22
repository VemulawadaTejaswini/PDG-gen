import java.util.*;
import java.util.Map.Entry;
import java.math.*;
import java.awt.geom.*;
import java.io.*;
      
      
public class Main {	
	static char[] tank = new char[] {'^','>','v','<'};
	static int[] vx = new int[] {0,1,0,-1};
	static int[] vy = new int[] {-1,0,1,0};
	static final int INF = 2 << 28;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			int L = sc.nextInt();
			if(N == 0 && M == 0 && L == 0) break;
			int[] A = new int[M];
			int[] B = new int[M];
			int[] D = new int[M];
			int[] E = new int[M];
			Node[] node = new Node[N];
			for(int i = 0; i < N; i++) {
				node[i] = new Node(i+1);
			}
			for(int i = 0; i < M; i++) {
				A[i] = sc.nextInt();
				B[i] = sc.nextInt();
				D[i] = sc.nextInt();
				E[i] = sc.nextInt();
				node[A[i]-1].to.add(new Edge(node[B[i]-1],D[i],E[i]));
				node[B[i]-1].to.add(new Edge(node[A[i]-1],D[i],E[i]));
			}
			int[][] dp = new int[N][L+1];
			for(int i = 0; i < N; i++) {
				Arrays.fill(dp[i], INF);
			}
			PriorityQueue<Data> queue = new PriorityQueue<Data>();
			queue.add(new Data(node[0],0,L));
			int MIN = INF;
			while(!queue.isEmpty()) {
				Data tmp = queue.poll();
				Node now = tmp.now;
				if(dp[now.id-1][tmp.l] <= tmp.cost) continue;
				dp[now.id-1][tmp.l] = tmp.cost;
				if(now.id == N) {
					MIN = Math.min(MIN, tmp.cost);
					break;
				}
				for(int i = 0; i < now.to.size(); i++) {
					Edge next = now.to.get(i);
					queue.add(new Data(next.to,tmp.cost + next.e,tmp.l));
					if(tmp.l - next.d >= 0) {
						queue.add(new Data(next.to,tmp.cost,tmp.l - next.d));
					}
				}
			}
			System.out.println(MIN);
			
			
		}
	}
	static class Data implements Comparable<Data>{
		Node now;
		int cost;
		int l;
		Data(Node a, int b, int c) {
			now = a;
			cost = b;
			l = c;
		}
		public int compareTo(Data o) {
			return this.cost - o.cost;
		}
	}
	
	static class Node {
		int id;
		ArrayList<Edge> to = new ArrayList<Edge>();
		Node(int a) {
			id = a;
		}
	}
	static class Edge {
		Node to;
		int  d;
		int  e;
		Edge(Node a,int b, int c) {
			to = a;
			d = b;
			e = c;
		}
	}
	
 }