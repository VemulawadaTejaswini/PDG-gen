import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n, m;
		String before[] = new String[100];
		String after[] = new String[100];
		String a;
		
		n = scanner.nextInt();
		while (n != 0) {
			for (int i = 0; i < n; i++) {
				before[i] = scanner.next();
				after[i] = scanner.next();
			}
			m = scanner.nextInt();
			for (int i = 0; i < m; i++) {
				a = scanner.next();
				for (int j = 0; j < n; j++) {
					if (a.equals(before[j])) {
						a = after[j];
						break;
					}
				}
				System.out.print(a);
			}
			System.out.println();
			n = scanner.nextInt();
		}
	}
}