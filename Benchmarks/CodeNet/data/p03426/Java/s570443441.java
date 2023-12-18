import java.awt.Point;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		int D = sc.nextInt();
		int[][] A = new int[H][W];
		for(int i = 0; i < H; i++) {
			for(int j = 0; j < W; j++) {
				A[i][j] = sc.nextInt() - 1;
			}
		}
		int Q = sc.nextInt();
		int[] L = new int[Q];
		int[] R = new int[Q];
		for(int i = 0; i < Q; i++) {
			L[i] = sc.nextInt() - 1;
			R[i] = sc.nextInt() - 1;
		}
		sc.close();
		Point[] p = new Point[H * W];
		for(int i = 0; i < H; i++) {
			for(int j = 0; j < W; j++) {
				p[A[i][j]] = new Point(j, i);
			}
		}
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < Q; i++) {
			int sum = 0;
			int t = L[i];
			while(t != R[i]) {
				Point v1 = p[t];
				t += D;
				Point v2 = p[t];
				sum += Math.abs(v1.x - v2.x) + Math.abs(v1.y - v2.y);
			}
			sb.append(sum).append("\n");
		}
		System.out.print(sb.toString());
	}
}
