import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;
import java.lang.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Problem ThanhYeuThu = new Problem();
		ThanhYeuThu.solve();
	}
	static class Graph {
		int n,m;
		private ArrayList<Integer> a[]; 
		private ArrayList<Integer> Topo;
		public void TaoDoThi(int N,int M) {
			n = N;
			m = M;
			a = new ArrayList[n + 1];
			for (int i = 0; i <= n; i++) a[i] = new ArrayList<>();
		}
		public void addEdge(int u,int v) {
			a[u].add(v);
		}
	}
	static class TopoSort {
		private ArrayList<Integer> Topo = new ArrayList<>();
		boolean KT[];
		void init(Graph G) {
			KT = new boolean[G.n + 1];
			for (int i = 0; i <= G.n; i++) KT[i] = false;
		}
		void DFS(Graph G,int u) {
			KT[u] = true;
			for (int v : G.a[u]) {
				if (KT[v] == false) DFS(G,v);
			}
			Topo.add(u);
		}
	}
	static class Problem {
		public void solve() {
			Scanner sc = new Scanner(System.in);
			int N = sc.nextInt();
			int M = sc.nextInt();
			Graph G = new Graph();
			G.TaoDoThi(N, M);
			for (int i = 0; i < M; i++) {
				int u = sc.nextInt();
				int v = sc.nextInt();
				G.addEdge(u, v);
			}
			TopoSort TP = new TopoSort();
			TP.init(G);
			for (int i = 1; i <= N; i++) {
				if (TP.KT[i] == false) {
					TP.DFS(G,i);
				}
			}
			Collections.reverse(TP.Topo);
//			for (int x : TP.Topo) System.out.print(x + " ");
			int DP[] = new int[N + 1];
			int Res = 0;
			for (int u : TP.Topo) {
				DP[u] = Math.max(DP[u],1);
				Res = Math.max(Res, DP[u]);
				for (int v : G.a[u]) {
					DP[v] = Math.max(DP[v],DP[u] + 1);
				}
			}
			System.out.print(Res - 1);
		}
	}

}
