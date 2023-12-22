import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);
		// Scanner scan = new Scanner(new
		// File("D:\\UserArea\\J0124567\\Downloads\\ALDS1_6_A-in9.txt"));

		int q = scan.nextInt();

		for (int i = 0; i < q; i++) {
			String s1 = scan.next();
			String s2 = scan.next();
			for (int x = 0; x < save.length; x++)
				for (int y = 0; y < save[0].length; y++)
					save[x][y] = -1;
			System.out.println(Msubs(s1, s2, 0, 0));
		}

		scan.close();
		System.exit(0);
	}

	static int[][] save = new int[1000][1000];

	private static int Msubs(String s1, String s2, int p1, int p2) {
		if (p1 == s1.length() || p2 == s2.length())
			return 0;
		if (save[p1][p2] == -1) {
			if (s1.charAt(p1) == s2.charAt(p2))
				save[p1][p2] = 1 + Msubs(s1, s2, p1 + 1, p2 + 1);
			else
				save[p1][p2] = Math.max(Msubs(s1, s2, p1 + 1, p2), Msubs(s1, s2, p1, p2 + 1));
		}
		return save[p1][p2];
	}
}

