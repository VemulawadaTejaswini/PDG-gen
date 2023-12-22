import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();
		char[] strs = new char[str.length()];
		int q = scanner.nextInt();
		for (int i = 0; i < str.length(); i++) {
			strs[i] = str.charAt(i);
		}
		for (int i = 0; i < q; i++) {
			String please = scanner.next();
			if (please.equals("print")) {
				int a = scanner.nextInt();
				int b = scanner.nextInt();
				for (int j = 0; a + j <= b; j++) {
					System.out.print(strs[a + j]);
				}
				System.out.println();

			} else if (please.equals("reverse")) {
				int a = scanner.nextInt();
				int b = scanner.nextInt();
				char oki;
				while ( a <= b) {
					oki = strs[a];
					strs[a] = strs[b];
					strs[b] = oki;
					a++;
					b--;
				}

			} else if (please.equals("replace")) {
				int a = scanner.nextInt();
				int b = scanner.nextInt();
				String nstr = scanner.next();
				char nstrs[] = new char[nstr.length()];
				for (int i2 = 0; i2 < nstr.length(); i2++) {
					nstrs[i2] = nstr.charAt(i2);
				}
				for (int j = 0; a <= b; j++) {
					strs[a] = nstrs[j];
					a++;
				}

			}

		}
		scanner.close();
	}
}
