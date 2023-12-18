import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		

		// Scanner in = new Scanner(System.in);
		int n = Integer.parseInt(in.readLine()); //nextInt();
		int q = Integer.parseInt(in.readLine()); //in.nextInt();

		// 子をキーにして親を記録 → 木なので根以外は必ず単一の親を持つ
		HashMap<Integer, Integer> map = new HashMap<>();
		for ( int i = 1; i < n; i++ ) {
			int a = Integer.parseInt(in.readLine()); //in.nextInt();
			int b = Integer.parseInt(in.readLine()); //in.nextInt();
			map.put(b, a);
		}

		long[] cnt = new long[n + 1];
		for ( int i = 1; i <= q; i++ ) {
			int p = Integer.parseInt(in.readLine()); //in.nextInt();
			int x = Integer.parseInt(in.readLine()); //in.nextInt();
			cnt[p] += x;
		}

		System.out.println( cnt[1] );
		for ( int i = 2; i <= n; i++ ) {
			// 子に親から降りてきたカウントを加算して表示			
			System.out.println( cnt[i] += cnt[map.get(i)] );
		}
		
		in.close();
		// br.close();
	}
}
