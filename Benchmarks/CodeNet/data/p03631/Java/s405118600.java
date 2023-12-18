import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int palindrome = ((n % 10) * 100) + (((n % 100) / 10) * 10) + (n / 100);

		if (n == palindrome) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

		sc.close();
	}
}