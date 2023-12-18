import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();

		S = S.replace("ABC", "");

		System.out.println((N - S.length()) / 3);
	}
}