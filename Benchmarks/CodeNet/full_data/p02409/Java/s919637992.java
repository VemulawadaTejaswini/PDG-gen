import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int[][][] room = new int[4][3][10];

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		for(int i = 0;i<4;i++) {
			for(int j = 0;j<3;j++) {
				for(int k = 0;k<10;k++) {
					room[i][j][k] = 0;
				}
			}
		}

		int n = sc.nextInt();
		for(int i = 0;i<n;i++) {
			int d = sc.nextInt();
			int f = sc.nextInt();
			int r = sc.nextInt();
			int v = sc.nextInt();
			room[d-1][f-1][r-1] += v;
		}

		for(int i = 0;i<4;i++) {
			for(int j = 0;j<3;j++) {
				for(int k = 0;k<10;k++) {
					System.out.print(" "+room[i][j][k]);
				}
				System.out.println();
			}
			if(i != 3) System.out.println("####################");
		}
	}
}

