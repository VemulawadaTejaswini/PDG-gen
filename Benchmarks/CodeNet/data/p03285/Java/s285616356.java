import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int cake = 0; cake <= 20; cake++) {
			for (int donut = 0; donut <= 15; donut++) {
				if (cake*4 + donut*7 == n) {
					System.out.println("Yes");
					return;
				}
			}
		}
		System.out.println("No");
	}
}
