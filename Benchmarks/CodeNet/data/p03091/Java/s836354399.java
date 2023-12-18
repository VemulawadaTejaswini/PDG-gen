import java.util.*;

public class Main {
	int N, M;
	int[] a, b;
	List<Set<Integer>> edges;
	int sixOver = 0, four = 0, two = 0, odds = 0;

	Main() {
		Scanner in = new Scanner(System.in);
		N = in.nextInt();
		M = in.nextInt();
		a = new int[M];
		b = new int[M];
		for (int i = 0; i < M; ++i) {
			a[i] = in.nextInt();
			b[i] = in.nextInt();
		}
		in.close();
	}

	void count() {
		this.edges = new ArrayList<>(N);
		for (int i = 0; i < N; ++i) {
			this.edges.add(new HashSet<Integer>());
		}
		for (int i = 0; i < M; ++i) {
			this.edges.get(a[i] - 1).add(b[i] - 1);
			this.edges.get(b[i] - 1).add(a[i] - 1);
		}
	}

	void isValid() {
		for (int i = 0; i < N; ++i) {
			int size = this.edges.get(i).size();
			if (size % 2 != 0) {
				this.odds++;
			} else if (size == 2) {
				this.two++;
			} else if (size == 4) {
				this.four++;
			} else {
				this.sixOver++;
			}
		}
		if (this.odds != 0) {
			System.out.println("No");
		} else if (this.four >= 2) {
			System.out.println("Yes");
		} else if (this.sixOver >= 1) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

	public static void main(String[] args) {
		Main ins = new Main();
		ins.count();
		ins.isValid();
	}

}