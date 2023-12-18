package abc160;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);

		long x = scanner.nextLong();

		long max500 = x/500;
		long max5 = x/5;
		long result = 0;
		for(long i = 0; i <= max500; i++){
			long current5 = (x-500*i)/5;
			result = Math.max(result, i*1000+current5*5);
		}

		System.out.println(result);
		scanner.close();
	}

}
