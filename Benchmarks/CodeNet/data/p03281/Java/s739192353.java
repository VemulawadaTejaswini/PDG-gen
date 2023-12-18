import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();

		cnt(n);

		stdIn.close();
	}

	private static int cnt(int n) {
		if(n >= 195) {
			return 3;
		}
		if(n >= 165) {
			return 2;
		}
		if(n >= 105) {
			return 1;
		}
		return 0;
	}
}
