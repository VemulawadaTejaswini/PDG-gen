import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int H = sc.nextInt();

		int W = sc.nextInt();

		int[][] a = new int[H][W];

		for(int i=0;i<H;i++) {

			for(int j=0;j<W;j++) {

				a[i][j] = sc.nextInt();
			}
		}

		int m = 0;

		int min = Integer.MAX_VALUE;

		for(int i=0;i<H;i++) {

			for(int j=0;j<W;j++) {

				m = solve(a,i,j,H,W);

				if(m<min) min = m;

			}
		}

		System.out.println(min);

	}

	static int solve(int[][] a, int x, int y, int H, int W) {

		int m = 0;

		int diffH = 0;

		int diffW = 0;

		for(int i=0;i<H;i++) {

			for(int j=0;j<W;j++) {

				diffH = Math.abs(x-i);

				diffW = Math.abs(y-j);

				m += Math.min(diffH, diffW) * a[i][j];

			}
		}

		return m;

	}
}

