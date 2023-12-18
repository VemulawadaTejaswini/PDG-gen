import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int Q = sc.nextInt();
		String S = sc.next();
		int l[] = new int[Q];
		int r[] = new int[Q];

		for (int i = 0; i < Q; i ++) {
			String tmp = S.substring(sc.nextInt() - 1, sc.nextInt());
			System.out.print((tmp.length() -  tmp.replace("AC", "").length()) / 2);
			if (i != Q - 1) System.out.println(" ");
		}

		System.out.println();

	}
}