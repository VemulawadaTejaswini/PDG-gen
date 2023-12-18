import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), d = sc.nextInt();
		sc.close();
		if (Math.abs(a - b) <= d && Math.abs(b - c) <= d||Math.abs(a-c)<=d) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
