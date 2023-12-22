import java.util.ArrayList;
import java.util.BitSet;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		while (true) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			if (N == 0) break;
			boolean[][] g = new boolean[N][N];
			for (int i = 0; i < M; ++i) {
				int a = sc.nextInt() - 1;
				int b = sc.nextInt() - 1;
				g[a][b] = g[b][a] = true;
			}
			ArrayList<Integer> fr = new ArrayList<Integer>();
			for (int i = 0; i < N; ++i) {
				if (g[0][i]) fr.add(i);
			}
			fr.add(0);
			BitSet bs = new BitSet(N);
			for (int f : fr) {
				for (int i = 0; i < N; ++i) {
					if (g[f][i]) bs.set(i);
				}
			}
			bs.clear(0);
			System.out.println(bs.cardinality());
		}
	}

}