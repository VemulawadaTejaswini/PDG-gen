package jp.co.nttdata;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		// A B C

		int one = sc.nextInt();
		int two = sc.nextInt();;
		int three = sc.nextInt();

//		int one = Integer.parseInt(args[0]);
//		int two = Integer.parseInt(args[1]);
//		int three = Integer.parseInt(args[2]);
		
		if (three - one > 0 && three - one <= two) {
			System.out.print("YES");
		} else {
			System.out.print("NO");
		}
		
		sc.close();
	}
}
