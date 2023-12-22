import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			String b = sc.next();
			if (b.equals("-")) {
				break;
			} else {
				char[] a = b.toCharArray();
				int m = sc.nextInt();
				for (int i = 1; i <= m; i++) {
					int h = sc.nextInt();
					for (int j = h - 1; j >= 0; j--) {
						int t = (int) (Math.random() * h);
						char x = a[j];
						a[j] = a[t];
						a[t] = x;
					}
				}
				System.out.println(a);
			}
		}
	}
}