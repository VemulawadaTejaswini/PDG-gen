import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] c = new int[3][3];
		for (int i = 0; i < 3; i++)
			for (int j = 0; j < 3; j++)
				c[i][j] = Integer.parseInt(sc.next());
		int a1 = 0;
		int a2 = 0;
		int a3 = 0;
		int b1 = 0;
		int b2 = 0;
		int b3 = 0;
		int a1max = Math.max(Math.max(c[0][0], c[0][1]), Math.max(c[0][1], c[0][2]));
		int a2max = Math.max(Math.max(c[1][0], c[1][1]), Math.max(c[1][1], c[1][2]));
		int a3max = Math.max(Math.max(c[2][0], c[2][1]), Math.max(c[2][1], c[2][2]));
		int b1max = Math.max(Math.max(c[0][0], c[1][0]), Math.max(c[1][0], c[2][0]));
		int b2max = Math.max(Math.max(c[0][1], c[1][1]), Math.max(c[1][1], c[2][1]));
		int b3max = Math.max(Math.max(c[0][2], c[1][2]), Math.max(c[1][2], c[2][2]));
		/*
		int a1min = Math.min(Math.min(c[0][0], c[0][1]), Math.min(c[0][1], c[0][2]));
		int a2min = Math.min(Math.min(c[1][0], c[1][1]), Math.min(c[1][1], c[1][2]));
		int a3min = Math.min(Math.min(c[2][0], c[2][1]), Math.min(c[2][1], c[2][2]));
		int b1min = Math.min(Math.min(c[0][0], c[1][0]), Math.min(c[1][0], c[2][0]));
		int b2min = Math.min(Math.min(c[0][1], c[1][1]), Math.min(c[1][1], c[2][1]));
		int b3min = Math.min(Math.min(c[0][2], c[1][2]), Math.min(c[1][2], c[2][2]));
		*/
		boolean yes = false;
		for (a1 = 0; a1 <= a1max; a1++) {
			for (a2 = 0; a2 <= a2max; a2++) {
				for (a3 = 0; a3 <= a3max; a3++) {
					for (b1 = 0; b1 <= b1max; b1++) {
						for (b2 = 0; b2 <= b2max; b2++) {
							for (b3 = 0; b3 <= b3max; b3++) {
								if (a1 + b1 == c[0][0] &&
										a1 + b2 == c[0][1] &&
										a1 + b3 == c[0][2] &&
										a2 + b1 == c[1][0] &&
										a2 + b2 == c[1][1] &&
										a2 + b3 == c[1][2] &&
										a3 + b1 == c[2][0] &&
										a3 + b2 == c[2][1] &&
										a3 + b3 == c[2][2]) {
									yes = true;
									break;
								}
							}
							if(yes)
								break;
						}
						if(yes)
							break;
					}
					if(yes)
						break;
				}
				if(yes)
					break;
			}
			if(yes)
				break;
		}

		System.out.println((yes)? "Yes" : "No");
	}
}