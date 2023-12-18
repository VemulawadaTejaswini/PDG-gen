import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();

		if (a - c <= d && -d <= a - c)
			System.out.println("Yes");
		else if (a - b <= d && -d <= a - b) {
			if (c - b <= d && -d <= c - b)
				System.out.println("Yes");
		}
		else
			System.out.println("No");
	}
}