import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int n = stdIn.nextInt();
		int min = stdIn.nextInt();
		int max = stdIn.nextInt();

		if(extracted(n, min, max)) {
			System.out.println("OK");
		} else {

			System.out.println("NG");
		}



		stdIn.close();
	}

	private static boolean extracted(int n, int min, int max) {
		for (int i = min; i <= max; i++) {
			if(i % n == 0) {
				return true;
			}
		}

		return false;
	}
}
