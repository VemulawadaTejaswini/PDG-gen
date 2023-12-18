
import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		new Main().exec();
	}

	void exec() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double total = 0d;
		for (int i = 0; i < n; i++) {
			double d = sc.nextDouble();
			String unit = sc.next();
			switch (unit) {
				case "JPY":
					total += d;
					break;
				case "BTC":
					total += d * 380000d;
					break;
				default:
					break;
			}
		}
		System.out.println(total);
		sc.close();
	}

}
