import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			String s = sc.next();
			if (s.equals("-")) {
				break;
			} else {
				int n = s.length();
				char[] alp = new char[n];
				for (int i = 0; i < n; i++) {
					alp[i] = s.charAt(i);
				}
				int m = sc.nextInt();
				for (int i = 0; i < m; i++) {
					int h = sc.nextInt();
					char[] tmp = new char[h];
					for (int j = 0; j < h; j++) {
						tmp[j] = alp[j];
					}
					for (int j = 0; j < n - h; j++) {
						alp[j] = alp[j + h];
					}
					for (int j = 0; j < h; j++) {
						alp[n - h + j] = tmp[j];
					}
				}
				for (int i = 0; i < n; i++) {
					System.out.print(alp[i]);
				}
				System.out.println();
			}
		}
		sc.close();
	}

}
