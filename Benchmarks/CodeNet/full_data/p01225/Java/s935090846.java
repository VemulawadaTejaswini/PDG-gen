import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int[] n = new int[9];
		String[] c = new String[9];
		for (int l = 0; l < T; l++) {
			for (int i = 0; i < 9; i++) {
				n[i] = sc.nextInt();
			}
			for (int i = 0; i < 9; i++) {
				c[i] = sc.next();
			}
			int count = 0;
			for (int i = 0; i < 9; i++) {
				if (n[i] == -2)
					continue;
				for (int j = i + 1; j < 9; j++) {
					if (c[i].equals(c[j])) {
						if (n[i] == n[j]) {
							for (int k = j + 1; k < 9; k++) {
								if (c[j].equals(c[k])) {
									if (n[j] == n[k]) {
										count++;
										n[i] = -2;
										n[j] = -2;
										n[k] = -2;
										break;
									}
								}
							}
							if (n[i] == -2)
								break;
						} else if (n[j] == n[i] + 1 || n[j] == n[i] - 1) {
							for (int k = j + 1; k < 9; k++) {
								if (c[j].equals(c[k])) {
									if (n[j] == n[i] + 1 && (n[k] == n[i] - 1 || n[k] == n[j] + 1)) {
										count++;
										n[i] = -2;
										n[j] = -2;
										n[k] = -2;
										break;
									}
									if (n[j] == n[i] - 1 && (n[k] == n[j] - 1 || n[k] == n[i] + 1)) {
										count++;
										n[i] = -2;
										n[j] = -2;
										n[k] = -2;
										break;
									}
								}
							}
							if (n[i] == -2)
								break;
						} else if (n[j] == n[i] + 2 || n[j] == n[i] - 2) {
							for (int k = j + 1; k < 9; k++) {
								if (c[j].equals(c[k])) {
									if (n[j] == n[i] + 2 && n[k] == n[i] + 1) {
										count++;
										n[i] = -2;
										n[j] = -2;
										n[k] = -2;
										break;
									}
									if (n[j] == n[i] - 2 && n[k] == n[j] + 1) {
										count++;
										n[i] = -2;
										n[j] = -2;
										n[k] = -2;
										break;
									}
								}
							}
							if (n[i] == -2)
								break;
						}
					}
				}
			}
			if (count == 3)
				System.out.println(1);
			else
				System.out.println(0);
		}
	}
}