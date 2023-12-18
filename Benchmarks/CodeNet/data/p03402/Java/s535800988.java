import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(sc.next()) - 1;
		int b = Integer.parseInt(sc.next()) - 1;
		String[][] s = new String[100][100];
		int w = 0;
		for (int i = 0; i < 50; i++)
			Arrays.fill(s[i], "#");
		for (int i = 50; i < 100; i++)
			Arrays.fill(s[i], ".");
		for (int i = 0; i < a; i++) {
			if (i % 100 < 50)
				s[i / 50][i % 50 * 2] = ".";
			else
				s[i / 50][i % 50 * 2 + 1] = ".";
		}
		for (int i = 0; i < b; i++) {
			if (i % 100 < 50)
				s[i / 50 + 51][i % 50 * 2] = "#";
			else
				s[i / 50 + 51][i % 50 * 2 + 1] = "#";
		}
		System.out.println("100 100");
		for (int i = 0; i < 100; i++) {
			for (int j = 0; j < 100; j++)
				System.out.print(s[i][j]);
			System.out.println();
		}
	}
}