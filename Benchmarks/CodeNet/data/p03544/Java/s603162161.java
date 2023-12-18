package atcoder079_b;

import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = luka(x);
		System.out.print(y);
	}


	public static int luka(int n) {
		if(n>1) {
			return luka(n-1) + luka(n-2);
		}
		if(n==0) {
			return 2;
		}
		else {
			return 1;
		}
	}

}
