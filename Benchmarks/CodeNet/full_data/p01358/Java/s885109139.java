import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static int[] card;
	static Board b1;
	static Board b2;
	static int N, M, U, V;

	static class Board {
		int[] pos, row, col, diag;

		Board() {
			pos = new int[1000001];
			Arrays.fill(pos, -1);
			row = new int[N];
			col = new int[N];
			diag = new int[2];
		}

		int count(int turn, int prev) {
			int diff = prev < turn ? 1 : -1;
			for (int i = prev < turn ? prev + 1 : turn + 1; i <= (prev < turn ? turn : prev); ++i) {
				int p = pos[card[i]];
				if (p == -1) continue;
				int r = p >> 10;
				int c = p & 1023;
				row[r] += diff;
				col[c] += diff;
				if (r == c) diag[0] += diff;
				if (r == N - 1 - c) diag[1] += diff;
			}
			int ret = 0;
			for (int i = 0; i < N; ++i) {
				if (row[i] == N) ret++;
				if (col[i] == N) ret++;
			}
			if (diag[0] == N) ret++;
			if (diag[1] == N) ret++;
			return ret;
		}
	}

	public static void main(String[] args) throws Exception {
		N = sc.nextInt();
		U = sc.nextInt();
		V = sc.nextInt();
		M = sc.nextInt();
		b1 = new Board();
		b2 = new Board();
		for (int i = 0; i < N; ++i) {
			for (int j = 0; j < N; ++j) {
				b1.pos[Integer.parseInt(sc.next())] = (i << 10) + j;
			}
		}
		for (int i = 0; i < N; ++i) {
			for (int j = 0; j < N; ++j) {
				b2.pos[Integer.parseInt(sc.next())] = (i << 10) + j;
			}
		}
		card = new int[M];
		for (int i = 0; i < M; ++i) {
			card[i] = Integer.parseInt(sc.next());
		}
		Result res = solve();
		if (res == Result.USAGI) {
			System.out.println("USAGI");
		} else if (res == Result.NEKO) {
			System.out.println("NEKO");
		} else {
			System.out.println("DRAW");
		}
	}

	static Result solve() {
		Result resEnd = getResult(M - 1, -1);
		if (resEnd != Result.BOTH) {
			return resEnd;
		}
		int lo = 0;
		int hi = M - 1;
		int prev = M - 1;
		while (true) {
			int mid = (lo + hi) / 2;
			if (mid == prev) return Result.NONE;
			Result res = getResult(mid, prev);
			if (res == Result.USAGI || res == Result.NEKO) return res;
			if (res == Result.NONE) {
				lo = prev = mid;
			} else {
				hi = prev = mid;
			}
		}
	}

	static Result getResult(int turn, int prev) {
		int c1 = b1.count(turn, prev);
		int c2 = b2.count(turn, prev);
		if (c1 >= U) {
			return c2 >= V ? Result.BOTH : Result.USAGI;
		} else {
			return c2 >= V ? Result.NEKO : Result.NONE;
		}
	}

	enum Result {
		USAGI, NEKO, BOTH, NONE;
	}

}