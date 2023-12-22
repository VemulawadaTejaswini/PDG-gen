
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] a = scanner.nextLine().split(" ");
		int b = Integer.parseInt(scanner.nextLine());
		for (int i = 0; i < b; i++) {
			int c = scanner.nextInt();
			int d = scanner.nextInt();
			int result = 0;
			switch (c) {
			case 1:
			case 6:
				switch (d) {
				case 2:
					result = 3;
					break;
				case 3:
					result = 5;
					break;
				case 4:
					result = 2;
					break;
				default:
					result = 4;
					break;
				}
				break;
			case 2:
			case 5:
				switch (d) {
				case 1:
					result = 4;
					break;
				case 3:
					result = 1;
					break;
				case 4:
					result = 6;
					break;
				default:
					result = 3;
					break;
				}
				break;
			default:
				switch (d) {
				case 1:
					result = 2;
					break;
				case 2:
					result = 6;
					break;
				case 5:
					result = 1;
					break;
				default:
					result = 5;
					break;
				}
				break;
			}
			if (c == 4 || c == 5 || c == 6)
				result = 7 - result;
			System.out.println(a[result-1]);
		}
	}
}