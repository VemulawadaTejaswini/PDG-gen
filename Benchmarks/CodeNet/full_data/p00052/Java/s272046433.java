import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {

		while(sc.hasNext()) {
			int x  = sc.nextInt();
				if (x == 0) {
					break;
				} else {
					System.out.println( length_of_zero(x) );
				}

		}

	}

	private static int length_of_zero(int x) {
		int ans = 0;

			for (int i = 0; Math.pow(5, i + 1) <= x; i++) {
				ans += x / Math.pow(5, i + 1);
			}

		return ans;
	}
}
