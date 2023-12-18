import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	static final int WHITE = 0;
	static final int BLACK = 1;
	static int[] color;

	private static boolean dfs2(int from, int to, ArrayList<ArrayList<Edge>> graph, int sum) {
		boolean flg = false;
		ArrayList<Edge> nextV = graph.get(from);
		for(int i = 0; i < nextV.size(); i++) {
			sum += nextV.get(i).weight;
			if(nextV.get(i).to == to) {
				if(sum % 2 == 0) {
					// OK
					flg = true;
				}else {
					// NG
					flg = false;
				}
			}else {
				// 探索を再帰的に呼び出す
				flg = dfs2(i, to, graph, sum);
			}
		}
		return flg;
	}


	private static boolean dfs(ArrayList<ArrayList<Edge>> graph, int v, int c){
		// vを探索済みにする
		color[v] = c;

		// 全ての頂点について調べる
		for(int i = 0; i < graph.size(); i++) {
			if(i == v || color[i] == -1) {
				continue;
			}
			// 同じ色に塗られた任意の2頂点について、その距離が偶数であるかを確認する
			if(color[i] == c) {
				if(dfs2(v, i, graph, 0)) {
					// OK
					continue;
				}else {
					// NG
					return false;
				}
			}
		}
		return true;

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		ArrayList<ArrayList<Edge>> graph = new ArrayList<ArrayList<Edge>>();
		for(int i = 0; i < n + 1; i++) {
			graph.add(new ArrayList<Edge>());
		}

		int v1, v2, weight;
		// グラフ情報入力
		for(int i = 0; i < n - 1; i++) {
			v1 = scan.nextInt();
			v2 = scan.nextInt();
			weight = scan.nextInt();
			graph.get(v1).add(new Edge(v2,weight));
			graph.get(v2).add(new Edge(v1, weight));
		}

		scan.close();
		color = new int[n + 1];
		for(int i = 0; i < n; i++) {
			color[i] = -1;
		}

		// 探索
		for(int i = 1; i < n + 1; i++) {
			// iが探索済みであれば探索しない
			if(color[i] != -1) {
				continue;
			}
			if(dfs(graph, i, WHITE)) {
				// OK
			}else {
				dfs(graph, i, BLACK);
			}
		}
		for(int i = 1; i < n + 1; i++) {
			System.out.println(color[i]);
		}
	}
}
class Edge{
	int to;
	int weight;
	Edge(int to, int weight){
		this.to = to;
		this.weight = weight;
	}
}
