import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			double velocity = sc.nextDouble();
			double time = velocity / 9.8;

			double a = time * time;

			double height = 4.9 * a;

			int kai = 1;

			while (true) {
				if (height < 5 * kai - 5) {
					break;
				} else {
					kai++;
				}
			}
			System.out.println(kai);
		}

	}

}