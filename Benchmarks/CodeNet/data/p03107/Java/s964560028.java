import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int answer = 0;

		answer = Math.min(S.replace("0", "").length(), S.replace("1", "").length()) * 2;

		System.out.println(answer);
	}
}