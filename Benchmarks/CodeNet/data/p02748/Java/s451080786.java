import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int M = sc.nextInt();
		int[] a = new int[A];
		int[] b = new int[B];
		int[][] xyc = new int[A][B];
		for(int i = 0; i < A; i++) {
			a[i] = sc.nextInt();
		}
		for(int i = 0; i < B; i++) {
			b[i] = sc.nextInt();
		}
		for(int i = 0; i < M; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			int c = sc.nextInt();
			if(xyc[x - 1][y - 1] < c) {
				xyc[x - 1][y - 1] = c;
			}
		}
		sc.close();
		int min = Integer.MAX_VALUE;
		for(int i = 0; i < A; i++) {
			for(int j = 0; j < B; j++) {
				int p = a[i] + b[j] - xyc[i][j];
				if(min > p) min = p;
			}
		}
		System.out.println(min);
	}
}