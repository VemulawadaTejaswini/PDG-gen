package atcoder.begineer;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input1 = sc.nextInt();
		int input2 = sc.nextInt();
		sc.close();

		if (input1 > 9 || input2 > 9) {
			System.out.println(-1);
		}else {
			System.out.println(input1*input2);
		}
	}

}
