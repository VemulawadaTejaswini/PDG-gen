import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int v = sc.nextInt();
		int b = sc.nextInt();
		int w = sc.nextInt();
		int t = sc.nextInt();

		if (Math.abs(a - b) <= (v - w) * t) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}