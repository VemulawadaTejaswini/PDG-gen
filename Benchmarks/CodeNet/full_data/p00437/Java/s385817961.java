import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int a, b, c;
		a = scanner.nextInt();
		b = scanner.nextInt();
		c = scanner.nextInt();
		int parts[] = new int [a + b + c];
		int m = scanner.nextInt();
		int order[][] = new int[1000][4];

		for (int i = 0; i < parts.length; i++) {
			parts[i] = 2;
		}
		for (int i = 0; i < m; i++) {
			order[i][0] = scanner.nextInt();
			order[i][1] = scanner.nextInt();
			order[i][2] = scanner.nextInt();
			order[i][3] = scanner.nextInt();
			if (order[i][3] == 1) {
				parts[order[i][0] - 1] = 1;
				parts[order[i][1] - 1] = 1;
				parts[order[i][2] - 1] = 1;
			}
		}
		for (int i = 0; i < m; i++) {
			if (parts[order[i][0] - 1] + parts[order[i][1] - 1] + parts[order[i][2] - 1] == 4) {
				for (int j = 0; j < 3; j++) {
					if (parts[order[i][j] - 1] == 2) {
						parts[order[i][j] - 1] = 0;
					}
				}
			}
		}
		
		for (int i = 0; i < parts.length; i++) {
			System.out.println(parts[i]);
		}
	}
}