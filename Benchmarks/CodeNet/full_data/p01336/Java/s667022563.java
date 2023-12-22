import java.util.*;
import static java.util.Arrays.*;
import static java.lang.Math.*;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static int N, M;
	static int[] C = new int[300], V = new int[300], D = new int[300], L = new int[300];
	static boolean read() {
		if (!sc.hasNextInt()) return false;
		N = sc.nextInt();
		M = sc.nextInt();
		for (int i = 0; i < N; i++) {
			String str;
			do {
				str = sc.next();
			} while (!Character.isDigit(str.charAt(0)));
			C[i] = Integer.parseInt(str);
			V[i] = sc.nextInt();
			D[i] = sc.nextInt();	
			L[i] = sc.nextInt();
		}
		return true;
	}
	
	static int[][] dp_V = new int[301][301], dp_D = new int[301][301], dp_L = new int[301][301];
	static void solve() {
		for (int i = 0; i < N; i++) {
			fill(dp_V[i], 0);
			fill(dp_D[i], 0);
			fill(dp_L[i], 0);
		}
		
		for (int i = 1; i <= N; i++) {
			for (int j = 0; j <= M; j++) {
				if (j >= C[i - 1]) {
					dp_V[i][j] = max(dp_V[i - 1][j], dp_V[i][j - C[i - 1]] + V[i - 1]);
					dp_D[i][j] = max(dp_D[i - 1][j], dp_D[i][j - C[i - 1]] + D[i - 1]);
					dp_L[i][j] = max(dp_L[i - 1][j], dp_L[i][j - C[i - 1]] + L[i - 1]);
				} else {
					dp_V[i][j] = dp_V[i - 1][j];
					dp_D[i][j] = dp_D[i - 1][j];
					dp_L[i][j] = dp_L[i - 1][j];
				}
			}
		}
		
		System.out.println(max(dp_V[N][M], max(dp_D[N][M], dp_L[N][M])));
	}
	
	public static void main(String[] args) {
		while (read())
			solve();
	}
}