import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	long INF = Long.MAX_VALUE >> 1;

	
	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int N = sc.nextInt();
		int M = sc.nextInt();

		List<int[]> edges = new ArrayList<>();
		for (int i = 0; i < M; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			edges.add(new int[] { a, b, -c }); // 最短経路問題として解くために符号を反転する
		}

		sc.close();

		// gについて、1からNへの最短経路を求めれば、それ（の符号を反転したもの）が解

		// 1からのコスト
		long[] d = new long[N + 1];
		Arrays.fill(d, INF);

		d[1] = 0; // 始点

		// 負の閉路を経由して更新されたか
		boolean[] negative = new boolean[N+1];
		Arrays.fill(negative, false);

		// ベルマンフォード法
		for (int i = 0; i < N; i++) {
			for (int[] edge : edges) {
				int from = edge[0];
				int to = edge[1];
				int cost = edge[2];

				if (d[from] == INF) {
					// fromが決まっていないので計算できない
					continue;
				}

				if (d[to] > cost + d[from]) { // fromを経由したほうがcostが小さければ更新する
					d[to] = cost + d[from];

					if (i == N - 1) {
						// iのループ1回につき、少なくとも1つの頂点が決まる
						// 始点はコスト0で最初から決まっているので、N-1回のループですべての頂点についてきまるはず
						// にもかかわらず、N回目のループ（i==N-1）でも更新がある場合は、グラフに負の閉路がある場合
						negative[to] = true;
					}
				}

			}
		}
		
		
		// グラフ中に負の閉路があったとしても、そこを通ってNに到達できなければスコアを無限大にはできない。
		
		// 負の閉路を経由して到達可能なノードをすべて negative == true にする
		for(int i=1;i<=N;i++) {
			if(negative[i]) {
				for(int[] edge:edges) {
					if(edge[0] == i) {
						negative[edge[1]] = true;
					}
				}
			}
		}

		
		
		if (negative[N]) {
			out.println("inf");
		} else {
			out.println(-d[N]);
		}

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}
}
