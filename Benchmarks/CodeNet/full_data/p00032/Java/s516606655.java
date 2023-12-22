import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		judgeSquare();

	}

	private static void judgeSquare() {
		int lect = 0;
		int diamond = 0;


			while (sc.hasNext()) {
				int a = sc.nextInt();
				int b = sc.nextInt();
				int c = sc.nextInt();

					if ( c * c == a * a + b * b  ) {
						lect++;
					} else if ( a == b ) {
						diamond++;
					}
			}

		System.out.println(lect);
		System.out.println(diamond);

	}

}
