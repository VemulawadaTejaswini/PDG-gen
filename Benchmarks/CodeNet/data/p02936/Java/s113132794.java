package D_時間外再トライ;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	static ArrayList<Integer>[]	nextlists;	// i番目のノードの隣接ノードを記録する
	static long[]				cnt;		// i番目のノードの持ちカウントを記録する

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// 入力受け取り
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int q = in.nextInt();
		nextlists = new ArrayList[n + 1];
		for ( int i = 0; i <= n; i++ ) {
			nextlists[i] = new ArrayList<>();
		}
		for ( int i = 1; i < n; i++ ) {
			int a = in.nextInt();
			int b = in.nextInt();
			nextlists[a].add(b);
			nextlists[b].add(a);
		}

		//		for ( int i = 0; i <= n; i++ ) {
		//			System.out.println(i + " : " + nextlists[i] + " size is " + nextlists[i].size());
		//		}

		// ノードごとの基礎カウントを記録
		cnt = new long[n + 1];
		for ( int i = 1; i <= q; i++ ) {
			int p = in.nextInt();
			int x = in.nextInt();
			cnt[p] += x;
		}

		// カウントの伝播
		cntSpread(1, cnt[1], nextlists[1]);

		// 表示
		StringBuilder result = new StringBuilder();
		for ( int i = 1; i <= n; i++ ) {
			result.append(cnt[i]).append(" ");
		}
		System.out.println(result);
		in.close();
	}

	// 親のカウントを子に加算
	static void cntSpread(int prnt, long prntCnt, ArrayList<Integer> chldList) {

		// System.out.println("prnt is " + prnt);
		// 子がいなかったらリターン
		if ( chldList.size() < 1 /*&& nextList.get(0) == prnt*/ ) return;

		// 親が確定していればその隣接は子
		for ( Integer chld : chldList ) {
			cnt[chld] += prntCnt;
			nextlists[chld].remove(nextlists[chld].indexOf(prnt)); // ただしこの隣接ノードリストから親を削除する必要がある
			cntSpread(chld, cnt[chld], nextlists[chld]);
		}
	}
}
