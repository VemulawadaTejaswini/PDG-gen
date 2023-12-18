import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String s = sc.next();

		int white = 0;
		int black = 0;

		int mostleft_black = -1;
		int mostright_white = -1;

		for (int i = 0; i < N; i++) {
			if (s.charAt(i) == '#') {
				if (black == 0)
					mostleft_black = i;
				black++;
			} else {
				mostright_white = i;
				white++;
			}
		}

		if (mostleft_black == -1 || mostright_white == -1) {
			System.out.println(0);
			return;
		} else {
			int wb = white - mostleft_black;
			int bw = black - (s.length() - mostright_white - 1);
			System.out.println(Math.min(wb, bw));
		}
	}

}
