import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		double ans;

		if (num == 1) {
			ans = 1.0;
		} else if (num % 2 == 0) {
			ans = ((num / 2.0)) / num;
		} else {
			ans = ((num / 2.0) + 0.5) / num;
		}

		System.out.println(ans);

	}

}