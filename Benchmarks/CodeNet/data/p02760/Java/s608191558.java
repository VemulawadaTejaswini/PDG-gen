import java.util.*;

class Main {
	Scanner sc;
	int[][] A;
	int N;
	
	private void calc() {
		sc = new Scanner(System.in);
		A = new int[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				A[i][j] = sc.nextInt();
			}
		}
		N = sc.nextInt();
		for (int i = 0; i < N; i++) {
			int b = sc.nextInt();
			for (int j = 0; j < 3; j++) {
				for (int k = 0; k < 3; k++) {
					if (A[j][k] == b) A[j][k] = -1;
				}
			}
		}
		// 判定
		// 横
		for (int i = 0; i < 3; i++) {
			int j = 0;
			for (; j < 3; j++) {
				if (A[i][j] != -1) break;
			}
			if (j == 3) {
				System.out.println("Yes");
				return;
			}
		}
		// 縦
		for (int i = 0; i < 3; i++) {
			int j = 0;
			for (; j < 3; j++) {
				if (A[j][i] != -1) break;
			}
			if (j == 3) {
				System.out.println("Yes");
				return;
			}
		}
		// 左上から右下
		int i = 0;
		for (; i < 3; i++) {
			if (A[i][i] != -1) break;
		}
		if (i == 3) {
			System.out.println("Yes");
			return;
		}
		
		// 左上から右下
		i = 0;
		for (; i < 3; i++) {
			if (A[i][2-i] != -1) break;
		}
		if (i == 3) {
			System.out.println("Yes");
			return;
		}
		System.out.println("No");
	}

	public static void main(String[] args) {
		new Main().calc();
	}
}
