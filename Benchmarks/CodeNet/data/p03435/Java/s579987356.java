

import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[][] c = new int[3][3];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				c[i][j] = sc.nextInt();
			}
		}

		if (c[1][1] - c[2][1] == c[1][2] - c[2][2])
			if (c[1][1] - c[2][1] == c[1][3] - c[2][3])
				if (c[1][1] - c[3][1] == c[1][2] - c[3][2])
					if (c[1][1] - c[3][1] == c[1][3] - c[3][3])
						if (c[2][1] - c[3][1] == c[2][2] - c[3][2])
							if (c[2][1] - c[3][1] == c[2][3] - c[3][3])
								System.out.println("Yes");
							else
								System.out.println("No");

	}

}
