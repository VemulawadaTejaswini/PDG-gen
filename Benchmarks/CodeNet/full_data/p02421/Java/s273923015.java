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
			if ((str[0].substring(0, 1)).equals(str[1].substring(0, 1))) {
				Tpt += 1;
				Hpt += 1;
			} else if ((str[0].substring(0, 1)).compareTo(str[1]
					.substring(0, 1)) > 0) {
				Tpt += 3;
			} else if ((str[0].substring(0, 1)).compareTo(str[1]
					.substring(0, 1)) < 0) {
				Hpt += 3;
			}

		}
		System.out.println(Tpt + " " + Hpt);
	}

}