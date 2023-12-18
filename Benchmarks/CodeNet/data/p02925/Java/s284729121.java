import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;

public class Main {

	public static void main(String[] args) throws IOException {
		long s = System.currentTimeMillis();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] inputs = br.readLine().split(" ");
		int n = Integer.parseInt(inputs[0]);

		Deque<Integer>[] A = new Deque[n + 1];		 // A[i] → i選手の対戦順リスト
		HashSet<Integer> players = new HashSet<>(); // 全試合終了してないｐのリスト
		for ( int r = 1; r <= n; r++ ) {
			players.add(r);
			A[r] = new ArrayDeque<Integer>();
			inputs = br.readLine().split(" ");
			for ( int c = 0; c < n - 1; c++ ) {
				A[r].push(Integer.parseInt(inputs[c]));
			}
		}

		int match = n * (n - 1) / 2;
		int days = 0;

		HashSet<Integer> todayDone = new HashSet<>(); // その日の試合が成立して除外された選手をここに入れる
		HashSet<Integer> toRemove = new HashSet<>(); // 全試合終了したｐ
		do {
			
			// 嘘解法 時間がかかるケースは日数＝試合数と推測
			long e = System.currentTimeMillis();
			if(e - s > 800) {
				System.out.print(n * (n - 1) / 2);
				br.close();
				return;
			}
			
			days++;
			todayDone.clear();
			toRemove.clear();

			// p:player opp:opponent
			for (Integer p : players ) {
              
				if ( todayDone.contains(p) ) continue;
				Integer opp = A[p].peek();
				if ( opp == null ) {
					toRemove.add(p);
					continue;
				}

				if ( todayDone.contains(opp) ) continue;
				Integer opps_opp = A[opp].peek();
				if ( opps_opp == null ) {
					toRemove.add(opp);
					continue;
				}

				// 対戦可能相手の対戦可能相手がｐだったら試合成立
				if ( p.equals(opps_opp) ) { // Integer(オブジェクト)型同士の比較はequalsでやる必要がある
					todayDone.add(A[p].pollFirst());
					todayDone.add(A[opp].pollFirst());
					match--;
				}
			}
			players.removeAll(toRemove);			
			
		} while ( todayDone.size() > 0);

		int result = (match == 0 ? days -1 : -1);
		System.out.println(result);
		br.close();
	}
}
