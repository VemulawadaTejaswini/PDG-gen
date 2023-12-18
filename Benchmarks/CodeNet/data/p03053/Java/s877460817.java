import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();

		char[][] a = new char[h][w];

		ArrayList<Integer> cor_x_white = new ArrayList<>();
		ArrayList<Integer> cor_y_white = new ArrayList<>();
		ArrayList<Integer> cor_x_black = new ArrayList<>();
		ArrayList<Integer> cor_y_black = new ArrayList<>();

		final char dot = '.';
		final char sharp = '#';

		for (int i = 0; i < h; i++) {
			String tmpa = "";
			tmpa = sc.next();
			for (int j = 0; j < w; j++) {
				a[i][j] = tmpa.charAt(j);
				if (a[i][j] == dot) {
					cor_y_white.add(i);
					cor_x_white.add(j);
				} else {
					cor_y_black.add(i);
					cor_x_black.add(j);
				}
			}
		}

		int globalMax = 0;
		int localMin = h + w - 2;

		for (int i = 0; i<cor_y_white.size() ; i++) {
				localMin = h + w - 2;
				for (int j = 0; j < cor_y_black.size(); j++) {
						localMin = Math.min(localMin, Math.abs(cor_y_white.get(i) - cor_y_black.get(j)) + Math.abs(cor_x_white.get(i) - cor_x_black.get(j)));
				}
				globalMax = Math.max(localMin, globalMax);
			}
		System.out.println(globalMax);
	}
}
