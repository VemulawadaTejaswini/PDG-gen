import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		sc.close();

		if (n % 2 == 1) {
			System.out.println("No");
			return;
		}

		int n2 = n / 2;
		for (int i = 0; i < n2; i++) {
			if (s.charAt(i) != s.charAt(i + n2)) {
				System.out.println("No");
				return;
			}
		}
		System.out.println("Yes");
	}
}
