import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();
		sc.close();
		long money = 100;
		long count = 0;
		while (true) {
			count++;
			money = (long) (money * 1.01d);
			if (money >= x) {
				System.out.println(count);
				return;
			}
		}
	}
}
