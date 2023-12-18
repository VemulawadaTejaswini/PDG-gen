import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int h = sc.nextInt();
		int w = sc.nextInt();
		String[] s = new String[h + 2];
		StringBuilder[] sb = new StringBuilder[h + 2];
		String tmp = ".";

		for (int i = 0; i < h + 2; i++) {
			sb[i] = new StringBuilder();
		}

		for (int i = 0; i < w + 2; i++) {
			sb[0].append(tmp);
			sb[h + 1].append(tmp);
		}

		for (int i = 1; i < h + 1; i++) {
			s[i] = sc.next();
			sb[i].insert(0, "." + s[i] + ".");
		}

		for (int i = 1; i < h + 1; i++) {
			for (int j = 1; j < w + 1; j++) {
				if (sb[i - 1].substring(j, j + 1).equals(".") &&
						sb[i + 1].substring(j, j + 1).equals(".") &&
						sb[i].substring(j - 1, j).equals(".") &&
						sb[i].substring(j + 1, j + 2).equals(".") &&
						sb[i].substring(j, j + 1).equals("#")) {
					System.out.println("No");
					System.exit(0);
				}
			}
		}

		System.out.println("Yes");

		sc.close();
	}
}