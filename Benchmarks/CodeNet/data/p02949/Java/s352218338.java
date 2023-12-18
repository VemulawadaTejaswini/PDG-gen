import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().run();
	}
	public void run() {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int M = scan.nextInt();
		int P = scan.nextInt();
		ArrayList<ArrayList<Entry>> entries = new ArrayList<>();
		for (int i = 0 ; i < M; i++) {
			entries.add(new ArrayList<Entry>());
		}
		// 移動元順にリストに格納
		for (int i = 0 ; i < M; i++) {
			int fm = scan.nextInt() - 1;
			int to = scan.nextInt() - 1;
			// 日数分のポイントを減算しておく
			int point = scan.nextInt() - P;
			Entry ent = new Entry(fm, to, point);
			entries.get(fm).add(ent);
		}
		long[] scores = new long[N];
		for(int i = 0; i < N; i++) {
			scores[i] = Integer.MIN_VALUE;
		}
		scores[0] = 0;

		// 頂点数分ループして、最大値を置き換えることで獲得ポイントを付与していく。
		for (int t = 1; t <= N - 1; t++) {
			for(ArrayList<Entry> aEntry : entries) {
				for (Entry e : aEntry) {
					scores[e.getTo()] = Math.max(scores[e.getTo()], scores[e.getFm()] + e.getPoint());
				}
			}
		}

		// 収束するか確認する。
		long answer = scores[N - 1];
		for (int t = 1; t <= N - 1; t++) {
			for(ArrayList<Entry> aEntry : entries) {
				for (Entry e : aEntry) {
					scores[e.getTo()] = Math.max(scores[e.getTo()], scores[e.getFm()] + e.getPoint());
				}
			}
		}
		if (answer != scores[N - 1]) {
			System.out.println(-1);
		}
		else if (answer < 0) {
			System.out.println(0);
		}
		else {
			System.out.println(answer);
		}
	}

	/**
	 * 入力値を管理する内部クラス
	 */
	public class Entry {
		private int fm;
		private int to;
		private int point;

		public Entry(int fm, int to, int point) {
			this.fm = fm;
			this.to = to;
			this.point = point;
		}
		public int getFm() {
			return fm;
		}
		public int getTo() {
			return to;
		}
		public int getPoint() {
			return point;
		}
	}
}
