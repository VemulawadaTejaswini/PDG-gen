import java.util.Scanner;
public class Main {
	private static int[][] A = null;
	private static int W = -1;
	private static int H = -1;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		W = sc.nextInt();
		H = sc.nextInt();
		int N = sc.nextInt();
		A = new int[H][W];
		for (int n=0; n<N; n++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			int a = sc.nextInt();
			set(x, y, a);
		}
		int res = 0;
		for (int i=0; i<H; i++) {
			for (int j=0; j<W; j++) {
				if (A[i][j] == 0) res++;
			}
		}
		System.out.println(res);
	}
	public static void set(int x, int y, int a) {
		if (a == 1) {
			for (int i=0; i<H; i++) {
				for (int j=0; j<x; j++) {
					A[i][j] = 1;
				}
			}
		}else if (a ==2) {
			for (int i=0; i<H; i++) {
				for (int j=x; j<W; j++) {
					A[i][j] = 1;
				}
			}
		}else if (a ==3) {
			for (int i=0; i<y; i++) {
				for (int j=0; j<W; j++) {
					A[i][j] = 1;
				}
			}
		}else if (a ==4) {
			for (int i=y; i<H; i++) {
				for (int j=0; j<W; j++) {
					A[i][j] = 1;
				}
			}
		}
	}
}
