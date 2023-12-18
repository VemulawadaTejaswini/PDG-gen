import java.util.Scanner;

public class Main {
	public static void main(String... args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		System.out.println(getSmaller(a,b) + getSmaller(c,d));
	}

	private static int getSmaller(int a, int b) {
		if (a < b) {
			return a;
		} else {
			return b;
		}
	}
}