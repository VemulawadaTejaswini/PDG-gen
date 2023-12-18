import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
		int n = sc.nextInt();
		String ans = "";

		if (n < 1200) {
			ans = "ABC";
		} else if (n < 2800) {
			ans = "ARC";
		} else {
			ans = "AGC";
		}

		System.out.println(ans);

		sc.close();
	}
}
