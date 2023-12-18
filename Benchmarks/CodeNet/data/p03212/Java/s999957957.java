import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double ans = 0;

		ans = Math.pow(3, String.valueOf(n).length() - 1) - (3 + 3 * Math.pow(2, String.valueOf(n).length() - 1));

		if (Integer.valueOf(String.valueOf(n).substring(0, 1)) >= 7) {
			ans += 3 * Math.pow(2, String.valueOf(n).length() - 1);
		} else if (Integer.valueOf(String.valueOf(n).substring(0, 1)) >= 5) {
			ans += 2 * Math.pow(2, String.valueOf(n).length() - 1);
		} else if (Integer.valueOf(String.valueOf(n).substring(0, 1)) >= 3) {
			ans += Math.pow(2, String.valueOf(n).length() - 1);
		}
		
		System.out.println((int)ans);

		sc.close();
	}

}
