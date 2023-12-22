
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			String S = sc.next();
			if (S.equals("-")) {
				break;
			}
			char[] C = S.toCharArray();
			int m = sc.nextInt();
			for (int i = 0; i < m; i++) {
				int h = sc.nextInt();
				for (int j = 0; j < h; j++) {
					for (int k = 0; k < C.length- 1; k++) {
						char l = C[k];
						C[k] = C[k + 1];
						C[k + 1] = l;
					}
				}
			}
			for (int i = 0; i < C.length; i++) {
				System.out.print(C[i]);
			}
			System.out.println();
		}
	}
}

