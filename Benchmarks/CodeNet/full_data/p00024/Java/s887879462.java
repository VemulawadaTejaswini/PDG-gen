import java.util.Scanner;

class Main {

	public static void main(String[] args) {

		Scanner sc = null;
		try {
			sc = new Scanner(System.in);
			while (sc.hasNextDouble()) {
				double x = sc.nextDouble();

				 double n = Math.ceil(((((x/9.8)*(x/9.8)*4.9)+5)/5));
				System.out.println((int)n);
			}
		} finally {
			sc.close();
		}
	}
}