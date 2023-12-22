import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n;
		int taro[]   = new int[200];
		int hanako[] = new int[200];
		int a;
		int field;
		int faze;
		boolean flag;
		int taroCount, hanakoCount;

		n = scanner.nextInt();
		while (n != 0) {
			for (int i = 0; i < 2 * n; i++) {
				taro[i] = 0;
				hanako[i] = 1;
			}
			for (int i = 0; i < n; i++) {
				a = scanner.nextInt();
				taro[a - 1] = 1;
				hanako[a - 1] = 0;
			}

			field = 0;
			faze = 1;
			flag = true;
			taroCount = n;
			hanakoCount = n;
			while (flag) {
				if (faze == 1) {
					for (; field < 2 * n; field++) {
						if (taro[field] == 1) {
							taro[field] = 0;
							faze = 0;
							taroCount--;
							break;
						}
					}
					if (taroCount == 0) {
						flag = false;
					}
					if (2 * n <= field) {
						faze = 0;
						field = 0;
					}
				} else {
					for (; field < 2 * n; field++) {
						if (hanako[field] == 1) {
							hanako[field] = 0;
							faze = 1;
							hanakoCount--;
							break;
						}
					}
					if (hanakoCount == 0) {
						flag = false;
					}
					if (2 * n <= field) {
						faze = 1;
						field = 0;
					}
				}
			}
			System.out.println(hanakoCount);
			System.out.println(taroCount);
			n = scanner.nextInt();
		}
	}
}