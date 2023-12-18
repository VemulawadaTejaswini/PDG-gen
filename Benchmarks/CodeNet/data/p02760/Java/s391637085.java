import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		int[][] bingo = new int[3][3];
		for(int i = 0;i < 3;i++) {
			for(int j = 0;j < 3;j++) {
				bingo[i][j] = sc.nextInt();
			}
		}
		int n = sc.nextInt();

		for(int i = 0; i < n;i++) {
			int number = sc.nextInt();
			for(int j = 0;j < 3;j++) {
				for(int k = 0;k < 3;k++) {
					if(bingo[j][k] == number) {
						bingo[j][k] = 0;
					}
				}
			}
		}

		for(int i = 0; i < 3; i++) {
			if(bingo[i][0] == 0 && bingo[i][1] == 0 && bingo[i][2] == 0) {
				System.out.println("Yes");
				return;
			}
		}
		for(int i = 0; i < 3; i++) {
			if(bingo[0][i] == 0 && bingo[1][i] == 0 && bingo[2][i] == 0) {
				System.out.println("Yes");
				return;
			}
		}
		if(bingo[0][0] == 0 && bingo[1][1] == 0 && bingo[2][2] == 0) {
			System.out.println("Yes");
			return;
		}

		if(bingo[0][2] == 0 && bingo[1][1] == 0 && bingo[2][0] == 0) {
			System.out.println("Yes");
			return;
		}
		System.out.println("No");

	}
}