package atcoder;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws java.io.IOException {
		// TODO 自動生成されたメソッド・スタブ
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int initiala = a;
		int c = 0;
		int result = 0;
		for (;a <= b; a++) {
			if (a == initiala) {
				c = a * (a + 1);
			} else {
				c = c * a;
			}
			result = c;
			if (result == 0) {
				break;
			}
		}
		if(result > 0){
			System.out.println("Positive");
		} else if(result < 0){
			System.out.println("Negative");
		} else if (result == 0) {
			System.out.println("Zero");
		}
	}
}
