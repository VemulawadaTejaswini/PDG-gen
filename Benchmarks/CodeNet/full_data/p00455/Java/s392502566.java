import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int a[] = new int[6];
		int b[] = new int[6];
		int c[] = new int[6];
		int a2[] = new int[3];
		int b2[] = new int[3];
		int c2[] = new int[3];

		for (int i = 0; i < 6; i++) {
			a[i] = scanner.nextInt();
		}
		for (int i = 0; i < 6; i++) {
			b[i] = scanner.nextInt();
		}
		for (int i = 0; i < 6; i++) {
			c[i] = scanner.nextInt();
		}
		
		for (int i = 0; i < 3; i++) {
			a2[i] = a[i + 3] - a[i];
		}
		if (a2[2] < 0) {
			a2[2] += 60;
			a2[1]--;
		}
		if (a2[1] < 0) {
			a2[1] += 60;
			a2[0]--;
		}
		for (int i = 0; i < 3; i++) {
			b2[i] = b[i + 3] - b[i];
		}
		if (b2[2] < 0) {
			b2[2] += 60;
			b2[1]--;
		}
		if (b2[1] < 0) {
			b2[1] += 60;
			b2[0]--;
		}
		for (int i = 0; i < 3; i++) {
			c2[i] = c[i + 3] - c[i];
		}
		if (c2[2] < 0) {
			c2[2] += 60;
			c2[1]--;
		}
		if (c2[1] < 0) {
			c2[1] += 60;
			c2[0]--;
		}
		System.out.println(a2[0] + " " + a2[1] + " " + a2[2]);
		System.out.println(b2[0] + " " + b2[1] + " " + b2[2]);
		System.out.println(c2[0] + " " + c2[1] + " " + c2[2]);
	}
}