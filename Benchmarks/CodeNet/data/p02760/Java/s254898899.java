import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[][] a = new int[3][3];
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				a[i][j] = scan.nextInt();
			}
		}

		int n = scan.nextInt();
		for(int i = 0; i < n; i++) {
			int x = scan.nextInt();
			for(int j = 0; j < 3; j++) {
				for(int k = 0; k < 3; k++) {
					a[j][k] = a[j][k] == x ? 0 : a[j][k];
				}
			}
		}

		int[][] naname = new int[2][3];
		naname[0][0] = a[0][0];
		naname[0][1] = a[1][1];
		naname[0][2] = a[2][2];
		naname[1][0] = a[0][2];
		naname[1][1] = a[1][1];
		naname[1][2] = a[2][0];

		boolean f = false;
		for(int i = 0; i < 3; i++) {
			boolean f2 = true;
			for(int j = 0; j < 3; j++) {
				if(a[i][j] != 0) f2 = false;
			}
			if(f == false) {
				f = f2;
			} else {
				break;
			}
		}
		for(int i = 0; i < 2; i++) {
			boolean f2 = true;
			for(int j = 0; j < 3; j++) {
				if(naname[i][j] != 0) f2 = false;
			}
			if(f == false) {
				f = f2;
			} else {
				break;
			}
		}

		System.out.println(f ? "Yes" : "No");

		scan.close();

	}

}