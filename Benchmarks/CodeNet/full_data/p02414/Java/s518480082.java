import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();

		//????????????????????????????????£?¨?
		int[][] gyoretu1 = new int[num1][num2];
		//?????????????????????????????????????????£?¨?
		int[][] gyoretu2 = new int[num2][num3];

		//??????????????£??\
		for(int i = 0;i < gyoretu1.length; i++ ) {
			for(int j = 0;j < gyoretu1[i].length;j++) {
				gyoretu1[i][j] = sc.nextInt();
			}
		}
		for(int i = 0;i < gyoretu2.length ;i++) {
			for(int j = 0;j < gyoretu2[i].length; j++){
				gyoretu2[i][j] = sc.nextInt();
			}
		}



		int[][] ans = new int[num1][num3];

		for(int i = 0;i < ans.length;i++) {
			for(int j = 0;j < ans[i].length;j++) {
				for(int y = 0;y < gyoretu2.length;y++) {
					ans[i][j] += gyoretu1[i][y] * gyoretu2[y][j];
				}
			}
		}

		for(int i = 0;i < ans.length;i++) {
			for(int j = 0;j < ans[i].length;j++) {
				System.out.print(ans[i][j] + " ");
			}
			System.out.println();
		}
	}
}