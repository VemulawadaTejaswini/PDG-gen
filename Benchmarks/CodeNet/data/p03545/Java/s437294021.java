import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		char[] c = new char[s.length()];
		for (int i = 0; i < s.length(); i++) {
			c[i] = s.charAt(i);
		}
		int[] x = new int[4];
		for (int i = 0; i < s.length(); i++) {
			x[i] = Character.getNumericValue(c[i]);
		}

		int[] a = new int[8];
		a[0] = x[0]-x[1]-x[2]-x[3];
		a[1] = x[0]-x[1]-x[2]+x[3];
		a[2] = x[0]-x[1]+x[2]-x[3];
		a[3] = x[0]+x[1]-x[2]-x[3];
		a[4] = x[0]-x[1]+x[2]+x[3];
		a[5] = x[0]+x[1]+x[2]-x[3];
		a[6] = x[0]+x[1]-x[2]+x[3];
		a[7] = x[0]+x[1]+x[2]+x[3];

		for (int i = 0; i < 8; i++) {
			if (a[0] == 7) {
				System.out.printf("%d-%d-%d-%d=7", x[0], x[1], x[2], x[3]);
				return;
			} else if (a[1] == 7) {
				System.out.printf("%d-%d-%d+%d=7", x[0], x[1], x[2], x[3]);
				return;
			} else if (a[2] == 7) {
				System.out.printf("%d-%d+%d-%d=7", x[0], x[1], x[2], x[3]);
				return;
			} else if (a[3] == 7) {
				System.out.printf("%d+%d-%d-%d=7", x[0], x[1], x[2], x[3]);
				return;
			} else if (a[4] == 7) {
				System.out.printf("%d-%d+%d+%d=7", x[0], x[1], x[2], x[3]);
				return;
			} else if (a[5] == 7) {
				System.out.printf("%d+%d+%d-%d=7", x[0], x[1], x[2], x[3]);
				return;
			} else if (a[6] == 7) {
				System.out.printf("%d+%d-%d+%d=7", x[0], x[1], x[2], x[3]);
				return;
			} else if (a[7] == 7) {
				System.out.printf("%d+%d+%d+%d=7", x[0], x[1], x[2], x[3]);
				return;
			}
		}
	}
}
