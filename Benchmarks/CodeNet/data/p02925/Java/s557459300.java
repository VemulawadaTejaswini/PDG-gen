import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;

public class Main {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] inputs = br.readLine().split(" ");
		int n = Integer.parseInt(inputs[0]);

		Deque<Integer>[] A = new Deque[n + 1];
		for ( int r = 1; r <= n; r++ ) {
			A[r] = new ArrayDeque<Integer>();
			inputs = br.readLine().split(" ");
			for ( int c = 0; c < n - 1; c++ ) {
				A[r].push(Integer.parseInt(inputs[c]));
			}
		}

		int days = 0;
		boolean stalemate;
		HashSet<Integer> removed = new HashSet<>(); // その日の試合が成立して除外された選手をここに入れる
		do {
			stalemate = true; // 手詰まりと仮定
			days++;
			removed.clear();
			
			// p:player opp:opponent
			for ( int p = 1; p <= n; p++ ) {
				if(removed.contains(p))continue;
				Integer opp = A[p].peek();
				if ( opp == null ) continue;
				Integer opps_opp = A[opp].peek();
				if ( opps_opp == null ) continue;

				// 対戦可能相手の対戦可能相手がｐだったら試合成立
				if ( p == opps_opp ) {
					// ループ内でリムーブするとWA（次の日に成立するはずの試合相手が見えてしまう）
					A[p].removeFirst();
					A[opp].removeFirst();
					removed.add(p);
					removed.add(opp);
					stalemate = false;
				}
			}

		// 手詰まりになったら終了
		} while ( !stalemate );

		for ( int i = 1; i <= n; i++ ) {
			if ( A[i].size() != 0 ) {
				System.out.println("-1");
				br.close();
				return;
			}
		}
		System.out.println(days - 1);
		br.close();
	}
}
