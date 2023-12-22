import java.util.Scanner;

public class Main {
	public static void main(String[] arges) {
		int[] e = new int[10000];
		int[] e2 = new int[10000];
		String[] s = new String[10000];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < e.length; i++) {
			String line = sc.nextLine();
			String[] k = line.split(" ");

			e[i] = Integer.parseInt(k[0]);
			e2[i] = Integer.parseInt(k[2]);
			s[i] = k[1];
			if (s[i].equals("?")) {
				break;
			}
		}

		for (int i = 0; i < s.length; i++) {
			if (s[i].equals("?")) {
				break;
			}
			if (s[i].equals("+")) {
				System.out.println(e[i] + e2[i]);
			}
			if (s[i].equals("-")) {
				System.out.println(e[i] - e2[i]);
			}
			if (s[i].equals("*")) {
				System.out.println(e[i] * e2[i]);
			}
			if (s[i].equals("/")) {
				System.out.println(e[i] / e2[i]);
			}
		}
	}
}