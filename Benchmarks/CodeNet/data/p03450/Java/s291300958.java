

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] L = new int[M];
		int[] R = new int[M];
		int[] D = new int[M];
		for(int i = 0; i < M; i++) {
			L[i] = sc.nextInt();
			R[i] = sc.nextInt();
			D[i] = sc.nextInt();
		}
		int[] x = new int[N + 1];
		for(int i = 1; i < N + 1; i++) {
			x[i] = -1;
		}
		boolean ans = true;
		for(int i = 0; i < M; i++) {
			if((x[L[i]] == -1) && (x[R[i]] == -1)) {
				x[L[i]] = 0;
				x[R[i]] = D[i];
			} else if((x[L[i]] == -1) && !(x[R[i]] == -1)) {
				if(x[R[i]] > D[i]) {
					x[L[i]] = x[R[i]] - D[i];
				} else {
					for(int j = 0; j < N; j++) {
						if(!(x[j] == -1)) {
							x[j] += D[i] - x[R[i]];
						}
						x[L[i]] = 0;
					}
				}
			} else if(!(x[L[i]] == -1) && (x[R[i]] == -1)) {
				x[R[i]] = x[L[i]] + D[i];
			} else {
				if(x[R[i]] - x[L[i]] != D[i]) {
					ans = false;
					break;
				}
			}
		}
		if(ans) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}
