import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String tile = sc.nextLine();
		sc.close();
		int ans = tile.length();

		for (int i = 0; i < 2; i++) {
			int cnt = 0;

			for (int j = 0; j < tile.length(); j++) {
				int current = Integer.parseInt(String.valueOf(tile.charAt(j)));
				if (j % 2 == 0 && tile.charAt(j) != (char) (i + '0')) {
					cnt++;
				}
				if (j % 2 == 1 && tile.charAt(j) == (char) (i + '0')) {
					cnt++;
				}
			}
			ans = Math.min(ans, cnt);

		}
		System.out.println(ans);

	}

}