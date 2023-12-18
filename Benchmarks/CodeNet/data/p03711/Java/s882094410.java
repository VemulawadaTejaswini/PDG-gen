import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();

		// 1 3 5 7 8 10 12
		// 4 6 9 11
		// 2
		if (checkGroup(x) == checkGroup(y)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

	private static int checkGroup(int n) {
		int result = 0;
		switch (n) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			result = 1;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			result = 2;
			break;
		case 2:
			result = 3;
			break;
		}
		return result;
	}

}
