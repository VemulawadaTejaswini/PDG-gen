package atcoder078_3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		double jousuu = Math.pow(2, m);
		double warukazu = 1;
		double beforeTime = 20;
		double afterTime = 0;
		int teisuu = 100*n + 1800*m;

		while((int)beforeTime != (int)afterTime) {
			beforeTime = afterTime;
			warukazu = warukazu * jousuu;
			afterTime = afterTime +teisuu/warukazu;

		}
		int time = (int)beforeTime;

		System.out.print(time);

	}

}
