package game;

import java.util.Scanner;

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int c = 0;
		while(N  >  1000) {
			c = c + 1000;
		}
		if(c > N) {
			c= N-c;
		}
		System.out.println(c);
	}

}