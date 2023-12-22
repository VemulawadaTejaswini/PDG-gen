import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		int n = Integer.parseInt(line);

		int Tpt = 0;
		int Hpt = 0;
		for (int i = 0; i < n; i++) {
			String string = sc.nextLine();
			String[] str = string.split(" ");
			String T = str[0];
			String H = str[1];
			if (T.equals(H)) {
				Tpt += 1;
				Hpt += 1;
			} else {

				for (int j = 0; j < T.length(); j++) {
					if (T.substring(j, j + 1).equals(H.substring(j, j + 1))) {
						if (T.length() > H.length()) {
							Tpt += 3;
							break;

						} else if (T.length() < H.length()) {
							Hpt += 3;
							break;
						} else {
							continue;
						}
					} else {
						if ((T.substring(j, j + 1)).compareTo(H.substring(j,
								j + 1)) > 0) {
							Tpt += 3;
						} else if ((T.substring(j, j + 1)).compareTo(H
								.substring(j, j + 1)) < 0) {
							Hpt += 3;
						}
						break;
					}

				}

			}

		}
		System.out.println(Tpt + " " + Hpt);
	}

}