import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long line = sc.nextInt();
		long row = sc.nextInt();
		if (line == 1 && row == 1) {
			System.out.println(1);
		} else if (line == 1) {
			System.out.println(row - 2);
		} else if (row == 1) {
			System.out.println(line - 2);
		} else {
			System.out.println((line - 2) * (row - 2));
		}
	}
}