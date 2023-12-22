import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static int N;
	static int[][][][] masks = new int[5][5][5][5];

	static int solve(int start) {
		HashSet<Integer> visited = new HashSet<Integer>();
		visited.add(start);
		ArrayList<Integer> cur = new ArrayList<Integer>();
		cur.add(start);
		for (int i = 0; i < 12; ++i) {
//			System.out.println(i + " " + cur.size());
			ArrayList<Integer> next = new ArrayList<Integer>();
			for (int v : cur) {
				int zero = Integer.numberOfTrailingZeros(v);
				int r = zero / 5;
				int c = zero % 5;
				for (int er = r; er < N; ++er) {
					for (int ec = c; ec < N; ++ec) {
						int n = v ^ masks[r][c][er][ec];
						if (n == 0) return i + 1;
						if (!visited.contains(n)) {
							visited.add(n);
							next.add(n);
						}
					}
				}
			}
			cur = next;
		}
		return 13;
	}

	static boolean bit(int state, int r, int c) {
		return (state & (1 << (r * 5 + c))) != 0;
	}

	public static void main(String[] args) throws Exception {
		for (int i = 0; i < 5; ++i) {
			for (int j = 0; j < 5; ++j) {
				for (int k = i; k < 5; ++k) {
					for (int l = j; l < 5; ++l) {
						for (int r = i; r <= k; ++r) {
							for (int c = j; c <= l; ++c) {
								masks[i][j][k][l] |= (1 << (r * 5 + c));
							}
						}
					}
				}
			}
		}
		while (true) {
			N = sc.nextInt();
			if (N == 0) break;
			int start = 0;
			for (int i = 0; i < N; ++i) {
				for (int j = 0; j < N; ++j) {
					int v = sc.nextInt();
					if (v == 1) start += (1 << (i * 5 + j));
				}
			}
			int ans = solve(start);
			for (int j = 0; j < ans; ++j) {
				System.out.print("myon");
			}
			System.out.println();
		}
	}
}