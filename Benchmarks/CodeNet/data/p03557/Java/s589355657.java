import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] a = new String[n];
		String[] b = new String[n];
		String[] c = new String[n];

		for (int i = 0; i < n; i++) {
			a[i] = sc.next();
		}
		for (int i = 0; i < n; i++) {
			b[i] = sc.next();
		}
		for (int i = 0; i < n; i++) {
			c[i] = sc.next();
		}

		System.out.println(n);
		for (String string : a) {
			System.out.println(string);
		}
		for (String string : b) {
			System.out.println(string);
		}
		for (String string : c) {
			System.out.println(string);
		}


		int count = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (Long.parseLong(a[i]) < Long.parseLong(b[j])) {
					for (int k = 0; k < n; k++) {
						if (Long.parseLong(b[j]) < Long.parseLong(c[k])) {
							count++;
						}
					}
				}
			}
		}

		System.out.println("count:" + count);
	}

}
