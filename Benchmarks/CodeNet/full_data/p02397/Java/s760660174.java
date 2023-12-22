import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static int judge(int x, int y) {
		int result = 0;
		if (x > y) {
			result = 0;
		} else if (x < y) {
			result = 1;
		} else if (x == y && x != 0 || y != 0) {
			result = 2;
		} else if (x == 0 && y == 0) {
			result = 3;
		}
		return result;
	}

	public static void main(String[] args) throws IOException {
		int x = 0, y = 0;
		int count = 0; // ?????????????????°
		String str1, str2;

		while (count < 3000) { // ?????§3000???

			Scanner scan = new Scanner(System.in);
			str1 = scan.next();
			x = Integer.parseInt(str1);
			str2 = scan.next();
			y = Integer.parseInt(str2);

			if (judge(x, y) == 0) {
				System.out.println(y + (" ") + x);
			} else if (judge(x, y) == 1) {
				System.out.println(x + (" ") + y);
			} else if (judge(x, y) == 2) {
				System.out.println(x + (" ") + y);
			} else if (judge(x, y) == 3) {
				break;
			}

			count++; // ???????????????

		}
	}

}