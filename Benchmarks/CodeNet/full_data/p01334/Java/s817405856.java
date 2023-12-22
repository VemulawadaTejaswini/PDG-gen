import java.util.*;
import static java.util.Arrays.*;
import static java.lang.Math.*;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static int N, M;
	static int[][][] flr = new int[100][100][2];
	static boolean read() {
		N = sc.nextInt();
		if (N == 0) return false;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				flr[i][j][0] = sc.nextInt();
				flr[i][j][1] = sc.nextInt();
			}
		}
		
		return true;
	}

	static int[][] step = new int[100][100];
	static int sol;
	static void solve() {
		sol = 0;
		for (int i = 0; i < N; i++) fill(step[i], -1);
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				rec(j, i, i * N + j);
			}
		}
		System.out.println(sol);
	}
	
	static void rec(int x, int y, int s) {
		if (step[y][x] == s) {
			sol++;
		} else if (step[y][x] == -1) {
			step[y][x] = s;
			rec(flr[y][x][0], flr[y][x][1], s);
		}
	}
	
	public static void main(String[] args) {
		while (read())
			solve();
	}
}