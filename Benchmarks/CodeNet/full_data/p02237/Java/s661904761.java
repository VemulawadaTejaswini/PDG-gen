import java.util.Scanner;

public class Main {

	static int n;
	static boolean[][] adj;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = Integer.parseInt(sc.next());
		adj = new boolean[n][n];
		for (int i = 0; i < n; i++) {
			Integer.parseInt(sc.next());
			int m = Integer.parseInt(sc.next());
			for (int j = 0; j < m; j++) {
				int to = Integer.parseInt(sc.next()) - 1;
				adj[i][to] = true;
			}
		}
		print();
	}

	public static void print() {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - 1; j++) {
				System.out.print(adj[i][j] ? 1 : 0);
				System.out.print(" ");
			}
			System.out.println(adj[i][n - 1] ? 1 : 0);
		}

	}

}

