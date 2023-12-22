import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a[];
		int b[];
		int c[];
		int d[];
		String st;
		boolean flag;

		a = new int[13];
		b = new int[14];
		c = new int[12];
		d = new int[10];
		while (sc.hasNext()) {
			st = sc.next();
			for (int i = 0; i < 13; i++) {
				a[i] = st.charAt(i) - '0';
			}
			for (int i = 1; i <= 9; i++) {
				flag = false;
				b[0] = i;
				d[i] = 0;
				for (int j = 0; j < 13; j++) {
					b[j + 1] = a[j];
				}
				sort(b);
				if (!isNotFifth(b)) {
					continue;
				}
				int head = 0;
				for (int j = 0; j < 13; j++) {
					if (b[j] == b[j + 1] && head < b[j]) {
						int index = 0;
						head = b[j];
						for (int k = 0; k < 14; k++) {
							if (k != j && k != j + 1) {
								c[index++] = b[k];
							}
						}
						if (check(c)) {
							flag = true;
						}
					}
				}
				if (flag) {
					d[i] = 1;
				}
			}
			String s = "";
			for (int i = 1; i <= 9; i++) {
				if (d[i] == 1) {
					System.out.print(s + i);
					s = " ";
				}
			}
			if (s == "") {
				System.out.print("0");
			}
			System.out.println();
		}
	}

	public static void sort(int a[]) {
		for (int i = 0; i < 14; i++) {
			int min = i;
			for (int j = i; j < 14; j++) {
				if (a[j] < a[min]) {
					min = j;
				}
			}
			int swap = a[min];
			a[min] = a[i];
			a[i] = swap;
		}
	}

	public static boolean isNotFifth(int a[]) {
		int count = 0;
		for (int i = 0; i < 13; i++) {
			if (a[i] == a[i + 1]) {
				count++;
			} else {
				count = 0;
			}
			if (4 <= count) {
				return false;
			}
		}
		return true;
	}

	public static boolean check(int a[]) {
		for (int i = 0; i < 4; i++) {
			if (a[0] == a[1] && a[1] == a[2]) {
				for (int j = 0; j < 12 - 3 * (i + 1); j++) {
					a[j] = a[j + 3];
				}
			} else {
				int dif = 1;
				for (int j = 1; j < 12 - 3 * i; j++) {
					if (a[j] - a[0] == dif) {
						a[j] = 0;
						dif++;
					}
					if (dif == 3) {
						a[0] = 0;
						int index = 0;
						for (int k = 0; k < 12 - 3 * i; k++) {
							if (a[k] != 0) {
								a[index++] = a[k];
							}
						}
						break;
					}
				}
				if (dif < 3) {
					return false;
				}
			}
		}
		return true;
	}
}