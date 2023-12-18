import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int l = scan.nextInt();

		int[] apples = new int[n];
		for (int i = 0; i < n; i++) {
			apples[i] = l + i;
		}

		// 0に1番近い値を削除し、削除後の配列の合計を求める
		int answer = 1000;
		int check = 0;
		for (int i : apples) {
			check = Math.abs(i);
			if (check < answer) {
				answer = check;
			}
		}
		
		
		int answer2 = 0;
		for (int i : apples) {
			answer2 += i;
		}
		
		if (Math.abs(l) >= n) {
			System.out.println(answer2 + answer);
		} else {
			System.out.println(answer2 - answer);
		}
	}
}