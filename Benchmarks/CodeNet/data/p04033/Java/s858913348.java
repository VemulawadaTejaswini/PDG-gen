import java.util.Scanner;

class Main {
	static int x;
	static int minI;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		String ans;
		if (a > 0) {
			ans = "Positive";
		} else if (a == 0) {
			ans = "Zero";
		} else {
			if (b >= 0) {
				ans = "Zero";
			} else if ((a - b) % 2 == 0) {
				ans = "Negative";
			} else {
				ans = "Positive";
			}
		}

		System.out.println(ans);

		sc.close();
	}

}
