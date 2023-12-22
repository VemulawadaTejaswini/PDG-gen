import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		String name[] = { "S", "H", "C", "D" };
		boolean num[][] = new boolean[4][13];

		for (int i = 0; i < n; i++) {
			String x = scan.next();
			int y = scan.nextInt();
			int z = 0;
			while (true) {
				if (x.equals(name[z]))
					break;
				z++;
			}
			num[z][y] = true;
		}
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 13; j++) {
				if (num[i][j] == false)
					System.out.println(name[i] + " " + j+1);
			}
		}
	}
}