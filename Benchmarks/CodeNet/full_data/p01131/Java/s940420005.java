import java.util.Scanner;

public class Main {
	char[][] c;

	void init() {
		c = new char[10][];
		c[1] = new char[5];
		c[2] = new char[3];
		c[3] = new char[3];
		c[4] = new char[3];
		c[5] = new char[3];
		c[6] = new char[3];
		c[7] = new char[4];
		c[8] = new char[3];
		c[9] = new char[4];
		int i, j;
		i = 2;
		j = 0;
		for (int alphabet = 'a'; alphabet <= 'z'; alphabet++) {
			c[i][j] = (char)(alphabet);
			j++;
			if (c[i].length <= j) {
				i++;
				j = 0;
			}
		}
		c[1][0] = '.';
		c[1][1] = ',';
		c[1][2] = '!';
		c[1][3] = '?';
		c[1][4] = ' ';
	}

	void run() {
		Scanner sc = new Scanner(System.in);

		init();

		for (int T = sc.nextInt() - 1; 0 <= T; T--) {
			char[] f = sc.next().toCharArray();
			int i, j;
			i = j = -1;
			for (int k = 0; k < f.length; k++) {
				if (f[k] != '0') {
					if (k != 0 && f[k] == f[k - 1]) {
						j++;
						j %= c[i].length;
					} else {
						i = f[k] - '0';
						j = 0;
					}
				} else {
					if (i != -1 && j != -1) {
						System.out.print(c[i][j]);
					}
					i = -1;
					j = -1;
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}