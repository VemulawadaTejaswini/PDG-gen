

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{

	public static void main(String argv[]) throws IOException {
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		int week = Integer.parseInt(br.readLine());
		double money = 100000;
		for (int i = 0; i < week; i++) {
			money = plusMoney(money);
		}
		System.out.printf("%.0f\n",money);
	}

	public static double plusMoney(double money) {
		money = money * 1.05;
		if (money % 1000 != 0) {
			money = money - money % 1000 + 1000;
		}
		return money;
	}

}