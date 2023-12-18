import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long h = scan.nextLong();
		Caracal caracal = new Caracal();

		System.out.println(caracal.attack(h));

		scan.close();
	}
}

class Caracal {
	long attack(long h) {
		if (h > 1) return attack(h / 2) * 2 + 1;
		if (h == 1) return 1;
		return 0;
	}
}
