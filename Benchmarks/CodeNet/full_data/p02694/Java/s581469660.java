import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		sc.close();
		int money = 100;
		long count = 0;
		while (true) {
			count++;
			money = (int) (money * 1.01d);
			if (money >= x) {
				System.out.println(count);
				return;
			}
		}
	}
}
