
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int W = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int ans = 0;
		if (a > b + W) {
			ans = a - (b + W);
		} else if (b > a + W) {
			ans = b - (a + W);
		}
		System.out.println(ans);
		sc.close();
	}

}