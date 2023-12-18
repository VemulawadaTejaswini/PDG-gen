import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] tokens = in.nextLine().split(" ");
		int a = Integer.parseInt(tokens[0]);
		int b = Integer.parseInt(tokens[1]);
		int c = Integer.parseInt(tokens[2]);
		int x = Integer.parseInt(tokens[3]);
		int y = Integer.parseInt(tokens[4]);

		if ((a + b) <= (2 * c)) {
			int result = a * x + b * y;
			System.out.println(result);
		} else {
			if (x <= y) {
				int cNum = 2 * x;
				int bNum = y - x;
				System.out.println(cNum * c + bNum * b);
			} else {
				int cNum = 2 * y;
				int aNum = x - y;
				int result = cNum * c + aNum * a;
				System.out.println(result);
			}
		}
		in.close();
	}

}