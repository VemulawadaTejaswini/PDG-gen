import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int n, k;
		int ans = 0;
		Scanner scan = new Scanner(System.in);

		n = scan.nextInt();
		k = scan.nextInt();

		int a = n % k;

		if(a == 0) {
			System.out.println(0);
		} else {
			System.out.println(Math.min(a, Math.abs(a-k)));
		}
	}
}
