import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int percent8 = (int) (a / 0.08);
		int minPercent10 = b * 10;
		int maxPercent10 = b * 10 + 9;

		if (minPercent10 <= percent8 && percent8 <= maxPercent10) {
			System.out.println(percent8);
		} else {
			System.out.println("-1");
		}

	}
}