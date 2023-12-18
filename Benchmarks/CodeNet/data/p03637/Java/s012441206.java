import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean count2 = false;
		int count4 = 0;
		int countodd = 0;
		boolean ok = false;
		int n = scan.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = scan.nextInt();
			if (a[i] % 2 == 0 && a[i] % 4 != 0) {
				count2 = true;
			}
			if (a[i] % 4 == 0) {
				count4++;
			}
			if (a[i] % 2 != 0) {
				countodd++;
			}
		}

		if (count2) {
			if (count4 >= countodd) {
				ok = true;
			}
		} else {
			if ((count4 + 1) >= countodd ) {
				ok = true;
			}
		}

		if (ok) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		System.out.println("");
	}
}
