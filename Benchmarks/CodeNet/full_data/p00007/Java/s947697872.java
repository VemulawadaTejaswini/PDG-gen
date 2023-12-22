import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			long amount = 100000;
			for (int i = 0; i < n; i++) {
				amount *= 1.05;
				amount += 999;
				amount /= 1000;
				amount *= 1000;
			}
			System.out.println(amount);
		}
	}
}