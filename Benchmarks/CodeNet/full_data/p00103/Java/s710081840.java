import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n = Integer.parseInt(sc.nextLine());
			for (int i = 0; i < n; i++) {
				System.out.println( inning() );
			}

	}

	private static int inning() {
		int score = 0;
		boolean[] base = new boolean[4];
		int o = 0;
		String event = "";

			for (; o < 3 ;) {
				event = sc.nextLine();

				switch (event) {
					case "HIT":
						for (int i = 3; i > 0; i--) {
							if (base[i]) {

								if (i == 3) {
									score++;
								} else {
									base[i + 1] = true;
								}

								base[i] = false;
							}
						}
						base[1] = true;
						break;

					case "HOMERUN":
						for (int i = 1; i < 4; i++) {
							if (base[i]) {
								score++;
								base[i] = false;
							}
						}
						score++;
						break;

					case "OUT":
						o++;
						break;
				}
			}
		return score;
	}
}

