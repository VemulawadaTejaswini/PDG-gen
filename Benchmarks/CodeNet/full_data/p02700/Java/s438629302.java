import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[2];
		int[] b = new int[2];
		boolean act = true;
		a[0] = sc.nextInt();
		a[1] = sc.nextInt();
		b[0] = sc.nextInt();
		b[1] = sc.nextInt();
		while (a[0] > 0 && b[0] > 0) {
			if (act) {
				b[0] -= a[1];
				act = !act;
			} else {
				a[0] -= b[1];
				act = !act;
			}
		}
		if (b[0] <= 0) {
			System.out.println("Yes");
		} else if (a[0] <= 0) {
			System.out.println("No");
		}
	}
}
