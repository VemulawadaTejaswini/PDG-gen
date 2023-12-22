import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int e = sc.nextInt();
			if (e == 0)
				break;
			System.out.println(calc(e));
		}
		sc.close();
	}

	private static int calc(int e) {
		int min = e;
		int val = 0;
		int x = 0;

		for (int y = 0; y * y <= e; y++) {
			for (int z = 0; z * z * z <= e; z++) {
				val = y * y + z * z * z;
				x = e - (y * y + z * z * z);
				if (x < 0)
					break;
				if (min > x + y + z)
					min = x + y + z;
			}
		}
		return min;
	}
}