import java.util.Scanner;

public class Main{
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String[] temp = scanner.nextLine().split(" ");
		int n = Integer.parseInt(temp[0]);
		int a = Integer.parseInt(temp[1]);
		int b = Integer.parseInt(temp[2]);

		double cnt = Math.floor(n / (double)(a + b));
		int ans = (int)cnt * b;


		int diff = n - (int)cnt * (a + b);

		ans += diff > a ? diff - a : 0;

		System.out.println(n - ans);


	}
}