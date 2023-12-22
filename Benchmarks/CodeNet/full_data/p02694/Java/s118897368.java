import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x = sc.nextDouble();
		double money = 100;
		double answer = 0;
		while(money < x) {
			answer++;
			money = Math.floor(money * ((double)101 /(double)100));
		}

		System.out.println((int)answer);
	}
}