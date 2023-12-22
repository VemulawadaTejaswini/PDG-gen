import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		int[][] gyoretu = new int[num1][num2];
		int[] retu = new int[num2];

		for(int i = 0;i < gyoretu.length; i++ ) {
			for(int j = 0;j < gyoretu[i].length;j++) {
				gyoretu[i][j] = sc.nextInt();
			}
		}
		for(int i = 0;i < retu.length ;i++) {
			retu[i] = sc.nextInt();
		}
		int[] ans = new int[num1];
		for(int i = 0; i < gyoretu.length; i++ ) {
			ans[i] = 0;
			for(int j = 0;j < gyoretu[i].length;j++) {

				ans[i] += gyoretu[i][j] * retu[j];

			}
		}

		for(int i = 0;i < ans.length;i++) {
			System.out.println(ans[i]);
		}
	}
}