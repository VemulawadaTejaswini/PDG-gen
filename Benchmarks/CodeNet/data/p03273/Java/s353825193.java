import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int h = sc.nextInt();
		int w = sc.nextInt();

		int[][] a = new int[h][w];
		for(int i = 0; i < h; i++) {
			String str = sc.next();
			boolean Wcut = true;
			for(int j = 0; j < w; j++) {
				if(str.charAt(j) == '.') {
					a[i][j] = 0;
				} else {
					a[i][j] = 1;
					Wcut = false;
				}
			}
			if(Wcut) a[i][0] = -1;
		}


		for(int i = 0; i < w; i++) {
			boolean Hcut = true;
			for(int j = 0; j < h; j++) {
				if(a[j][i] == 1) {
					Hcut = false;
					break;
				}
			}
			if(Hcut) a[0][i] = -1;
		}

		for(int i = 0; i < h; i++) {
			if(a[i][0] == -1) continue;
			for(int j = 0; j < w; j++) {
				if(a[0][j] == -1) continue;
				if(a[i][j] == 0) {
					System.out.print(".");
				} else {
					System.out.print("#");
				}
			}
			System.out.println();
		}
	}
}