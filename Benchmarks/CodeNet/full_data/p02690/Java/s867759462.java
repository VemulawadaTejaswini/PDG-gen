import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		long x = stdIn.nextLong();
		stdIn.close();

		for (int a = -120; a <= 120; a++) {
			for (int b = -120; b <= 120; b++) {
				if(isCollect(a, b, x)) {
					System.out.println(a +" " + b);
					return;
				}

			}

		}



	}

	private static boolean isCollect(long a, long b, long x) {
		return a*a*a*a*a - b*b*b*b*b == x;
	}
}
