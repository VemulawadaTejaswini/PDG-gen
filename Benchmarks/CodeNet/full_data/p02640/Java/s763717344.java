import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		int flag = 0;
		
		if (y % 2 == 1) {
			flag = 2;
		}
		
		while (x >= 0 && y >= 0 && flag == 0) {
			if (y / 4 == x) {
				flag = 1;
				break;
			}
			x = x - 1;
			y = y - 2;
		}
		
		if (flag == 1) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

}
