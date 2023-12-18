import java.util.Scanner;

public class Main {

	static int n, m;
	static int[] a, b;
	static boolean[][] graph;
	static boolean[] vis;

	public static void main(String[] args) {
		//入力受付
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		//枝の端点の配列
		a = new int[m];
		b = new int[m];
		graph = new boolean[n][n]; 					//ノードペア（枝）のデータ
		vis = new boolean[n]; 							//あるノードから別のノードへ行けるかどうか
		for (int i = 0; i < m; i++) {
			a[i] = sc.nextInt() - 1; 					//4-5を結ぶ枝はgraphの(3.4),(4,3)成分のtrueに対応
			b[i] = sc.nextInt() - 1;
			graph[a[i]][b[i]] = graph[b[i]][a[i]] = true;	//隣接アークの端点に対応するところはtrueにする
		}

		long ans = 0;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				vis[j] = false;							//vis初期化
			}
			graph[a[i]][b[i]] = graph[b[i]][a[i]] = false;	//枝を一か所切ってみる
			dfs(0);											//ノード1から到達可能か深さ優先探索

			boolean bridge = false;
			//枝を切って到達不能になったノードがあるならbridgeをtrueに
			for (int j = 0; j < n; j++) {
				if (!vis[j]) {
					bridge = true;
				}
			}
			//bridgeがtrueならansを1増やす
			if (bridge)
				ans++;
			graph[a[i]][b[i]] = graph[b[i]][a[i]] = true;//切った枝を元に戻す
		}
		System.out.println(ans);
		sc.close();
	}


	public static void dfs(int x) {
		//すでに別の経路で到達可能と分かっていたら何もしない
		if (vis[x])
			return;
		//初めて到達可能と分かった場所はtrueに書き換え
		vis[x] = true;
		//xに隣接しているノードiについて深さ優先探索
		for (int i = 0; i < n; i++) {
			if (graph[x][i] == false)
				continue;
			dfs(i);
		}
	}
}
