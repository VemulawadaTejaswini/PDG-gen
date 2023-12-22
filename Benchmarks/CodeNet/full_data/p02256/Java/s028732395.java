import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String[] n = line.split(" ");

		int x = Integer.parseInt(n[0]);
		int y = Integer.parseInt(n[1]);

		int z = Math.max(x, y) % Math.min(x, y);

		int gcd = 1;

		if (x == y) {
			gcd = x;
		} else {
			for (int i = 1; i <= z; i++) {
				if (x % i == 0 && y % i == 0) {
					gcd = i;
				}
			}
		}

		System.out.println(gcd);

	}

}