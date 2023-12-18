import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] inputs = br.readLine().split(" ");
		int N = Integer.parseInt(inputs[0]);

		int rival[][] = new int[N + 1][N]; // pのn番目の対戦相手 r = rival[p][n]  (1-origin 
		int mday[][] = new int[N + 1][N];  // pのn番目の試合日   d = mday[p][n]  (1-origin 

		// p:player  r:rival
		for ( int p = 1; p <= N; p++ ) {
			inputs = br.readLine().split(" ");
			for ( int n = 1; n <= N - 1; n++ ) {
				rival[p][n] = Integer.parseInt(inputs[n - 1]);
			}
		}

		ArrayDeque<Integer> q = new ArrayDeque<Integer>(); // マッチメイクを試行するpのキュー
		int[] mcnt = new int[N + 1];				   			// p が何試合目まで進んだか =  prog[p]
		// 初日に成立する試合を見ていく
		for ( int p = 1; p <= N; p++ ) {
			int r = rival[p][1];
			
			if ( p == rival[r][1] && mday[p][1] * mday[r][1] == 0 ) {
				mday[p][1] = mday[r][1] = 1;
				mcnt[p] = mcnt[r] = 1;
				q.addLast(p);
				q.addLast(r);
			}
		}

		// 2日目以降
		while ( 0 < q.size() ) {
			int p = q.pollFirst();
			int pn = mcnt[p] + 1;
			if ( pn >= N ) continue;
			
			int r = rival[p][pn];
			int rn = mcnt[r] + 1;
			if ( rn >= N ) continue;

			// 試合が成立したら試合日テーブルに記入
			if ( p == rival[r][rn] ) {

				mday[p][pn] = mday[r][rn] = Math.max(mday[p][pn - 1] + 1, mday[r][rn - 1] + 1);

				mcnt[p]++;
				mcnt[r]++;
				q.addLast(p);				
				q.addLast(r);
			}
		}

		// pごとに最後の試合日を見てMaxを取る
		int mdayMax = 0;
		for ( int p = 1; p <= N; p++ ) {
			int d = mday[p][N - 1];
			if ( d == 0 ) {
				mdayMax = -1;
				break;
			} else {
				mdayMax = Math.max(mdayMax, d);
			}
		}
		System.out.println(mdayMax);
		br.close();
	}
}
