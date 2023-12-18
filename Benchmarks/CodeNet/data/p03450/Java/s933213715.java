import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 要素の入力、格納
		int N = sc.nextInt();
		int M = sc.nextInt();
		int L[] = new int[M];
		int R[] = new int[M];
		int D[] = new int[M];
		for (int i = 0; i < M; i++) {
			L[i] = sc.nextInt();
			R[i] = sc.nextInt();
			D[i] = sc.nextInt();
		}
		String ans = "Yes";
		double x[] = new double[N + 1];
		Arrays.fill(x, 0);
		int team[] = new int[N + 1];
		Arrays.fill(team, 0);
		int teamno = 0;

		for (int i = 0; i < M; i++) {
			if (team[L[i]] == 0 && team[R[i]] == 0) {
				teamno++;
				x[L[i]] = 0;
				x[R[i]] = D[i];
				team[L[i]] = teamno;
				team[R[i]] = teamno;
			} else if (team[L[i]] == 0) {
				x[L[i]] = x[R[i]] - D[i];
				team[L[i]] = team[R[i]];
			} else if (team[R[i]] == 0) {
				x[R[i]] = x[L[i]] + D[i];
				team[R[i]] = team[L[i]];
			} else if (team[L[i]] != team[R[i]]) {
				if (team[L[i]] < team[R[i]]) {
					x[R[i]] = x[L[i]] + D[i];
					team[R[i]] = team[L[i]];
				} else {
					x[L[i]] = x[R[i]] - D[i];
					team[L[i]] = team[R[i]];
				}
			} else {
				if (x[R[i]] - x[L[i]] != D[i]) {
					ans = "No";
					break;
				}
			}
		}

		// 出力
		System.out.println(ans);
	}
}
