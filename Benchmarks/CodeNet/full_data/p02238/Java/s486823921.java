import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	int n;
	List<List<Integer>> g = new ArrayList<>();
	int[] d, f;
	int t = 1;

	void dfs(int x) {
		d[x] = t++;
		for (int c : g.get(x)) {
			if (d[c] == 0) {
				dfs(c);
			}
		}
		f[x] = t++;
	}

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		n = sc.nextInt();
		g = new ArrayList<>();
		g.add(new ArrayList<>());
		for (int i = 1; i <= n; i++) {
			g.add(new ArrayList<>());

			sc.nextInt();
			int k = sc.nextInt();
			for (int j = 0; j < k; j++) {
				g.get(i).add(sc.nextInt());
			}
		}

		d = new int[n + 1];
		f = new int[n + 1];

		sc.close();

		for(int i=1;i<=n;i++) {
			if(d[i] == 0) {
				dfs(i);
			}
		}
		
		for (int i = 1; i <= n; i++) {
			out.println(i + " " + d[i] + " " + f[i]);
		}

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}
}

