import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int [][]d = new int[n][6];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < 6; j++) {
				d[i][j] = scan.nextInt();
			}
		}
		scan.close();
		int [][][]D = new int[n][24][6];
		for(int i = 0; i < n; i++) {
			int[]d0 = {d[i][0], d[i][1], d[i][2], d[i][3], d[i][4], d[i][5]};
			int[]d1 = {d[i][1], d[i][5], d[i][2], d[i][3], d[i][0], d[i][4]};
			int[]d2 = {d[i][2], d[i][0], d[i][1], d[i][4], d[i][5], d[i][3]};
			int[]d3 = {d[i][3], d[i][0], d[i][4], d[i][1], d[i][5], d[i][2]};
			int[]d4 = {d[i][4], d[i][0], d[i][2], d[i][3], d[i][5], d[i][1]};
			int[]d5 = {d[i][5], d[i][1], d[i][3], d[i][2], d[i][4], d[i][0]};
			for(int j = 0; j < 6; j++) {
				D[i][0][j] = d0[j];
				D[i][4][j] = d1[j];
				D[i][8][j] = d2[j];
				D[i][12][j] = d3[j];
				D[i][16][j] = d4[j];
				D[i][20][j] = d5[j];
			}
			for(int j = 0; j < 3; j++) {
				int[]k0 = rot(D[i][0]);
				int[]k1 = rot(D[i][j + 4]);
				int[]k2 = rot(D[i][j + 8]);
				int[]k3 = rot(D[i][j + 12]);
				int[]k4 = rot(D[i][j + 16]);
				int[]k5 = rot(D[i][j + 20]);

				for(int k = 0; k < 6; k++) {
					D[i][j + 1][k] = k0[k];
					D[i][j + 5][k] = k1[k];
					D[i][j + 9][k] = k2[k];
					D[i][j + 13][k] = k3[k];
					D[i][j + 17][k] = k4[k];
					D[i][j + 21][k] = k5[k];
				}
			}
		}
		for(int i = 0; i < n - 1; i++) {
			for(int j = i + 1; j < n; j++) {
				for(int k = 0; k < 24; k++) {
					boolean flag = true;
					for(int l = 0; l < 6; l++) {
						if(d[i][l] != D[j][k][l]) {
							flag = false;
							break;
						}
					}
					if(flag) {
						System.out.println("No");
						System.exit(0);
					}
				}
			}
		}
		System.out.println("Yes");

	}
	static int[] rot(int[] d) {
		int []t = new int[6];
		int []d1 = new int[6];
		for(int j = 0; j < 6; j++) {
			t[j] = d[j];
			d1[j] = d[j];
		}
		d1[1] = t[3];
		d1[2] = t[1];
		d1[3] = t[4];
		d1[4] = t[2];
		return d1;
	}
	static void disp(int[] d) {
		for(int i : d) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
}
