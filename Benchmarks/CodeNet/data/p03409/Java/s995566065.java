import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	private boolean nakayoshi(int[] p, int[] q) {
		return p[0] < q[0] && p[1] < q[1];
	}

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int N = sc.nextInt();

		int[][] red = new int[N][2];
		int[][] blue = new int[N][2];

		for (int i = 0; i < N; i++) {
			red[i] = new int[] { sc.nextInt(), sc.nextInt() };
		}
		for (int i = 0; i < N; i++) {
			blue[i] = new int[] { sc.nextInt(), sc.nextInt() };
		}

		sc.close();

		Comparator<int[]> cmp = (o1, o2) -> Integer.compare(o2[0], o1[0]);
		cmp = cmp.thenComparing((o1, o2) -> Integer.compare(o2[1], o1[1]));
		Arrays.sort(red, cmp);

		Arrays.sort(blue, (o1, o2) -> Integer.compare(o1[1], o2[1]));

		boolean[] used = new boolean[N];

		int ans = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (used[j])
					continue;

				if (nakayoshi(red[i], blue[j])) {
					ans++;
					used[j] = true;
					break;
				}
			}
		}

		out.println(ans);
	}

	public static void main(String[] args) {
		new Main()._main(args);
	}
}
