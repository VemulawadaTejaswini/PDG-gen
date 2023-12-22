import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		long X = scan.nextLong();
		int answer = 0;
		double money = 100;

		while (money < X) {
			money *= 1.01;
			money = Math.floor(money);
			answer++;
		}

		System.out.println(answer);

	}
}