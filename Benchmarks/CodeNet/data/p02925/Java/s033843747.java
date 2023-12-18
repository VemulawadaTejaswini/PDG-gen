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
		HashSet<Integer> toRemove = new HashSet<>(); // 削除予定をここに入れる
		do {
			stalemate = true; // 手詰まりと仮定
			days++;
			toRemove.clear();
			
			// p:player
			for ( int p = 1; p <= n; p++ ) {

				Integer temp1 = A[p].peek();
				if ( temp1 == null ) continue;
				Integer temp2 = A[temp1].peek();
				if ( temp2 == null ) continue;

				if ( p == temp2 ) {
					toRemove.add(p);
					toRemove.add(temp1);
					stalemate = false;
				}

			}
			for ( Integer i : toRemove ) {
				A[i].removeFirst();
			}

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
