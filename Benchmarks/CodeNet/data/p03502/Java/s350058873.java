import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int fn = 0;
		int t = n;

		while (true) {
			fn += t % 10;
			t = t / 10;
			if (t == 0)
				break;
		}
		if (n % fn == 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		sc.close();
	}
}