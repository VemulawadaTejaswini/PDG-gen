import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		int D = sc.nextInt();
		int A[][] = new int[H][W];
		for (int i = 0; i < H; i++) {
			for (int j = 0; j < W; j++) {
				A[i][j] = sc.nextInt();
			}
		}
		int Q = sc.nextInt();
		int L[] = new int[Q];
		int R[] = new int[Q];
		for (int i = 0; i < Q; i++) {
			L[i] = sc.nextInt();
			R[i] = sc.nextInt();
		}
		int x = 0;
		int count = 0;
		int komatate = 0;
		int komayoko = 0;
		for (int i = 0; i < Q; i++) {
			x = L[i];
			while (x != R[i]) {
				for (int j = 0; j < H; j++) {
					for (int k = 0; k < W; k++) {
						if (A[j][k] == x) {
							komatate = j;
							komayoko = k;
						}
					}
				}
				for (int j = 0; j < H; j++) {
					for (int k = 0; k < H; k++) {
						if (A[j][k] == x + D) {
							count += Math.abs(j - komatate) + Math.abs(k - komayoko);
							x += D;
						}
					}
				}
			}
			System.out.println(count);
			count = 0;
		}
	}
}
