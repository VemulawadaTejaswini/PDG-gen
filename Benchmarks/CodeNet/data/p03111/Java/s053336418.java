import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	private int dfs(List<Integer> l, int a, int b, int c) {
		if(l.size() == 0) {
			if(a==0 || b==0 || c==0) {
				return 1_000_000_000;
			}else {
				return Math.abs(A-a) + Math.abs(B-b) + Math.abs(C-c) -30;
			}
		}

		int x = l.get(0);
		List<Integer> newL = l.subList(1, l.size());

		int ret0 = dfs(newL, a, b, c);
		int ret1 = dfs(newL, a + x, b, c) + 10;
		int ret2 = dfs(newL, a, b + x, c) + 10;
		int ret3 = dfs(newL, a, b, c + x) + 10;

		return Math.min(Math.min(ret0, ret1), Math.min(ret2, ret3));

	}

	int A, B, C, n;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		n = sc.nextInt();
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();

		List<Integer> l = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			l.add(sc.nextInt());
		}

		out.println(dfs(l, 0, 0, 0));

		sc.close();
	}

	public static void main(String[] args) {
		new Main()._main(args);
	}

}
