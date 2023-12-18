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

		ArrayList<Integer>[] chld = new ArrayList[n + 1];
		for ( int i = 0; i <= n; i++ ) {
			chld[i] = new ArrayList<Integer>();
		}

		HashSet<Integer> q = new HashSet<Integer>();
		for ( int i = 0; i < m; i++ ) {
			inputs = br.readLine().split(" ");
			int x = Integer.parseInt(inputs[0]), y = Integer.parseInt(inputs[1]);
			chld[x].add(y);
			q.add(x);
		}
		br.close();

		int ans = 0;
		for ( int len = 0; len <= m; len++ ) {

			HashSet<Integer> newq = new HashSet<Integer>();
			for ( Integer i : q ) {
				//				System.out.print(i);
				newq.addAll(chld[i]);
			}
			//			System.out.println();
			q = newq;

			if ( q.size() == 0 ) {
				ans = len;
				break;
			}
		}
		System.out.println(ans);
	}
}
