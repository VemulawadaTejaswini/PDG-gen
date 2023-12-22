import java.text.ParseException;
import java.util.Scanner;

public class Main {

	public static void main(String[] arges) throws ParseException {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		int v = Integer.parseInt(line);

		int[][] daice = new int[v][6];
		for (int i = 0; i < v; i++) {
			String line2 = sc.nextLine();
			String[] ks = line2.split(" ");
			for (int j = 0; j < 6; j++) {
				daice[i][j] = Integer.parseInt(ks[j]);
			}
		}
		int count = 0;
		for (int i = v - 1; i > 0; i--) {
			for (int j = i - 2; j > -1; j--) {
				for (int j2 = 0; j2 < 4; j2++) {
					if (daice[i][0] == daice[j][0]) {
						break;
					}
					Daice.south(daice, i);

					if (j2 == 3 && daice[i][0] != daice[j][0]) {
						Daice.west(daice, i);
					}

				}
				for (int j2 = 0; j2 < 4; j2++) {
					if (daice[i][0] == daice[j][0]) {
						break;
					}
					Daice.south(daice, i);
				}
				if (daice[i][0] != daice[j][0]) {
					break;
				} else {
					for (int j2 = 0; j2 < 4; j2++) {
						Daice.kaiten(daice, i);
						if (daice[i][1] == daice[i][2]) {
							break;
						}

					}
					if (daice[i][0] == daice[j][0]
							&& daice[i][1] == daice[j][1]
							&& daice[i][2] == daice[j][2]
							&& daice[i][3] == daice[j][3]
							&& daice[i][4] == daice[j][4]
							&& daice[i][5] == daice[j][5]) {
						count++;
					} else {
						

					}
				}

			}
		}
		if (count == 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

	public static class Daice {

		public static void south(int[][] daice, int i) {
			int[] fs = new int[] { daice[i][0], daice[i][1], daice[i][2],
					daice[i][3], daice[i][4], daice[i][5] };
			daice[i][5] = fs[1];
			daice[i][1] = fs[0];
			daice[i][0] = fs[4];
			daice[i][4] = fs[5];

		}

		public static void west(int[][] daice, int i) {
			int[] fs = new int[] { daice[i][0], daice[i][1], daice[i][2],
					daice[i][3], daice[i][4], daice[i][5] };
			daice[i][5] = fs[3];
			daice[i][2] = fs[5];
			daice[i][0] = fs[2];
			daice[i][3] = fs[0];
		}

		public static void kaiten(int[][] daice, int i) {
			int[] fs = new int[] { daice[i][0], daice[i][1], daice[i][2],
					daice[i][3], daice[i][4], daice[i][5] };
			daice[i][1] = fs[3];
			daice[i][2] = fs[1];
			daice[i][3] = fs[4];
			daice[i][4] = fs[2];
		}
	}
}