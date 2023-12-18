import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int h = sc.nextInt();
		int w = sc.nextInt();
		char[][] area = new char[h][w];
		for (int i = 0; i < h; i++) {
			area[i] = sc.next().toCharArray();
		}
		ArrayList<Integer> hh = new ArrayList<>();
		ArrayList<Integer> ww = new ArrayList<>();
		boolean b;
		for (int i = 0; i < h; i++) {
			b = true;
			for (int j = 0; j < w; j++) {
				if (area[i][j] == '#') {
					b = false;
					break;
				} else {

				}
			}
			if (!b) {
				hh.add(i);
			}
		}

		for (int i = 0; i < w; i++) {
			b = true;
			for (int j = 0; j < h; j++) {
				if (area[j][i] == '#') {
					b = false;
					break;
				} else {

				}
			}
			if (!b) {
				ww.add(i);
			}
		}

		for (int i : hh) {
			for (int j : ww) {
				sb.append(area[i][j]);
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}
}
