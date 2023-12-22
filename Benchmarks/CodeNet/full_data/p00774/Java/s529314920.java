import java.util.Scanner;

public class Main {

	public static int check(int[][] stone, int line) {
		int point = 0, flag, i, j;
		for (i = 0; i < 3; i++) {
			flag = 1;
			for (j = i + 1; j < 5; j++) {
				if (stone[i][line] == stone[j][line]) {
					flag++;
				} else {
					break;
				}
			}
			if (flag >= 3) {
				point = stone[i][line] * flag;
				for (j = 0; j < flag; j++) {
					stone[i + j][line] = 0;
				}
				break;
			}
		}
		return point;
	}

	public static void fall(int[][] stone, int n) {
		int i, j,k;
		for (i = 0; i < 5; i++) {
			for (j = 0; j < n; j++) {
				if (stone[i][j] == 0) {
					if (j + 1 == n) {
						stone[i][j] = 0;
					} else {
						for(k=j;k<n;k++) {
							if(stone[i][k]>0) {
								stone[i][j]=stone[i][k];
								stone[i][k]=0;
								break;
							}
						}
						
					}
				}
			}
		}
	}

	public static void show(int[][] stone, int n) {
		for (int i = n - 1; i >= 0; i--) {
			if(i==4) {
				System.out.println("----------");
			}
			System.out.printf("%d %d %d %d %d\n", stone[0][i], stone[1][i], stone[2][i], stone[3][i], stone[4][i]);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while (true) {
			int point = 0;
			int n = scan.nextInt();
			if (n == 0) {
				break;
			}
			int[][] stone = new int[5][n];

			for (int i = n - 1; i >= 0; i--) {
				for (int j = 0; j < 5; j++) {
					stone[j][i] = scan.nextInt();
				}
			}

			while (true) {
				int add = 0;
				for (int i = 0; i < n; i++) {
					if (i < n) {
						add += check(stone, i);
					}
				}
				if (add == 0) {
					break;
				} else {
					point += add;
					fall(stone, n);
				}
			}

			System.out.println(point);
		}
		scan.close();
	}
}
