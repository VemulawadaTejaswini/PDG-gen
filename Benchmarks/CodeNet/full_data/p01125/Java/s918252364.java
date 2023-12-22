import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws java.io.IOException {
		Scanner sc = new Scanner(System.in);

		while (true) {
			boolean map[][] = new boolean[21][21];
			int n = sc.nextInt();
			if (n == 0)
				break;
			for (int i = 0; i < n; i++) {
				map[sc.nextInt()][sc.nextInt()] = true;
			}
			int m = sc.nextInt();
			int x = 10;
			int y = 10;
			int ans = 0;
			if(map[x][y])ans++;
			for (int i = 0; i < m; i++) {
				char d = sc.next().charAt(0);
				int mov = sc.nextInt();
				switch (d) {
				case 'N':
					for (int j = 0; j < mov; j++) {
						y++;
						if (map[x][y]) {
							ans++;
							map[x][y] = false;
						}

					}
					break;
				case 'W':
					for (int j = 0; j < mov; j++) {
						x--;
						if (map[x][y]) {
							ans++;
							map[x][y] = false;
						}

					}
					break;
				case 'E':
					for (int j = 0; j < mov; j++) {
						x++;
						if (map[x][y]) {
							ans++;
							map[x][y] = false;
						}

					}
					break;
				case 'S':
					for (int j = 0; j < mov; j++) {
						y--;
						if (map[x][y]) {
							ans++;
							map[x][y] = false;
						}

					}
					break;
				}
			}
			if (ans == n)
				System.out.println("Yes");
			else
				System.out.println("No");

		}
	}
}