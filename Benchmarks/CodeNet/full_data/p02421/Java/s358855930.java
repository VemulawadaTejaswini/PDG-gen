import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		sc.nextLine();
		
		int[] score = new int[2];
		for (int i = 0; i < n; i++) {

			String[] taro_hana = sc.nextLine().split(" ");

			int res = taro_hana[0].compareTo(taro_hana[1]);

			if(res == 0) {
				score[0] += 1;
				score[1] += 1;
			} else if(res > 0) {
				score[0] += 3;
			} else {
				score[1] += 3;
			}
		}
		sc.close();

		System.out.println(score[0] + " " + score[1]);
	}
}