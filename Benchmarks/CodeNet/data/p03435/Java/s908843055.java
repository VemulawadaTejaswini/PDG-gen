import java.util.*;

public class Main {
	public static void main(String... args) {
		Scanner sc = new Scanner(System.in);
		int[][] c = new int[3][3];
		for (int i = 0 ; i < 3 ; i++) {
			c[0][i] = sc.nextInt();
			c[1][i] = sc.nextInt();
			c[2][i] = sc.nextInt();
		}

		for (int i = 1 ; i < 3 ; i++) {
			for (int j = 1 ; j < 3 ; j++) {
				if (c[i-1][j-1] - c[i][j-1] != c[i-1][j] - c[i][j]) {
					System.out.println("No");
					System.exit(0);
				}
			}
		}
		System.out.println("Yes");
	}
}
