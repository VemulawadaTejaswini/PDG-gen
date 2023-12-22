import java.util.Scanner;

class Main {

	public static void main(String[] args) {

		System.out.println();
		Scanner sc = null;
		try {
			sc = new Scanner(System.in);
			while (sc.hasNextDouble()) {
				double x = sc.nextDouble();

				int n = (int)Math.ceil(((((x / 9.8) * (x / 9.8) * 4.9) + 5) / 5));
				System.out.println(n);
			}
		} finally {
			sc.close();
		}
	}
}