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
			if (T.compareTo(H) == 0) {
				Tpt += 1;
				Hpt += 1;

			} else if (T.compareTo(H) > 0) {
				Tpt += 3;

			} else {
				Hpt += 3;

			}

		}
		System.out.println(Tpt + " " + Hpt);
	}

}