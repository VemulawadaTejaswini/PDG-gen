import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;

public class Main {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] inputs;
		inputs = br.readLine().split(" ");
		int n = Integer.parseInt(inputs[0]), m = Integer.parseInt(inputs[1]);

		ArrayList<Integer>[] chld = new ArrayList[n + 1]; // 1オリジン
		for ( int i = 0; i <= n; i++ ) {
			chld[i] = new ArrayList<Integer>();
		}

		HashSet<Integer> sp = new HashSet<Integer>();
		HashSet<Integer> to = new HashSet<Integer>();
		for ( int i = 0; i < m; i++ ) {
			inputs = br.readLine().split(" ");
			int x = Integer.parseInt(inputs[0]), y = Integer.parseInt(inputs[1]);
			chld[x].add(y);
			sp.add(x);
			to.add(y);
		}
		br.close();

		// 始点を取り出す sp:start point
		sp.removeAll(to);

		int ans = 0;
		for ( Integer s : sp ) {
			if ( chld[s].size() == 0 ) continue;

			HashSet<Integer> next = new HashSet<>();
			next.addAll(chld[s]);

			for ( int len = 1; len <= m; len++ ) {
				HashSet<Integer> temp = new HashSet<>();

				for ( Integer c : next ) {
					temp.addAll(chld[c]);
				}
				next = temp;
				if ( next.size() == 0 ) {
					ans = Math.max(ans, len);
					break;
				}
			}
		}
		System.out.println(ans);
	}
}
