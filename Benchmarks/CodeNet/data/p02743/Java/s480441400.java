import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			double a = Math.sqrt(sc.nextInt());
			double b = Math.sqrt(sc.nextInt());
			double c = Math.sqrt(sc.nextInt());

			String ans;
			if (a+b < c) {
				ans = "Yes";
			}
			else {
				ans = "No";
			}

			System.out.println(ans);
		} finally {
			sc.close();
		}
	}
}
