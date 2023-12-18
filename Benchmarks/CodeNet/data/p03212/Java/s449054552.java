import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str = String.valueOf(n).substring(0, 1);
		double ans = 0;
		ans = Math.pow(3, (String.valueOf(n).length() - 1)) - 3;
		
		if (Integer.valueOf(str) < 3) {
			ans -= (Math.pow(2, (String.valueOf(n).length() - 1)) - 2) * 3;
		} else if (Integer.valueOf(str) == 3) {
			ans -= (Math.pow(2, (String.valueOf(n).length() - 1)) - 2) * 2;
		} else if (Integer.valueOf(str) <= 5 ) {
			ans -= Math.pow(2, (String.valueOf(n).length() - 1)) - 2;
		}

		System.out.println((int)ans);
		
		sc.close();
	}

}
