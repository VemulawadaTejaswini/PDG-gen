import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		String line = sc.nextLine();

		int black = 0;
		int whiteInRBlack = 0;
		int rBlack = 0;
		int whiteFrag = 0;
		int answer = 0;

		for (int i = 0; i < n; i++) {
			if (line.charAt(i) == '#')
				black++;
			if (black > 0 && line.charAt(i) == '.')
				whiteInRBlack++;
		}
		for (int i = n - 1; i > -1; i--) {
			if (whiteFrag == 0 && line.charAt(i) == '#')
				rBlack++;
			if (line.charAt(i) == '.')
				whiteFrag++;
		}

		if (black - rBlack < whiteInRBlack)
			answer = black - rBlack;
		else
			answer = whiteInRBlack;

		System.out.println(answer);

		sc.close();
	}
}