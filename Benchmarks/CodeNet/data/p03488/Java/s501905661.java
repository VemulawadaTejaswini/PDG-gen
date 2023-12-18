import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] s = sc.nextLine().toCharArray();
		int x = sc.nextInt();
		int y = sc.nextInt();

		List<Integer> xa = new ArrayList<>();
		List<Integer> ya = new ArrayList<>();
		boolean isX = true;
		for (int i = 0; i < s.length; i++) {
			if (s[i] == 'T') {
				isX = !isX;
				continue;
			}

			int t = 0;
			while (i < s.length && s[i] == 'F') {
				i++;
				t++;
			}

			if (t == 0) continue;
			if (isX) xa.add(t);
			else ya.add(t);
			i--;
		}

		boolean[][] dpx = new boolean[xa.size() + 1][16002];
		boolean[][] dpy = new boolean[ya.size() + 1][16002];
		dpx[0][8000] = true;
		dpy[0][8000] = true;

		if (s[0] == 'F') {
			dpx[1][8000 + xa.get(0)] = true;
			dpx[1][8000 - xa.get(0)] = true;
			for (int i = 1; i < xa.size(); i++) {
				for (int j = 0; j < dpx[0].length; j++) {
					if (dpx[i][j]) {
						dpx[i + 1][j + xa.get(i)] = true;
						dpx[i + 1][j - xa.get(i)] = true;
					}

				}
			}

			for (int i = 0; i < ya.size(); i++) {
				for (int j = 0; j < dpy[0].length; j++) {
					if (dpy[i][j]) {
						dpy[i + 1][j + ya.get(i)] = true;
						dpy[i + 1][j - ya.get(i)] = true;
					}

				}
			}
		} else {
			for (int i = 0; i < xa.size(); i++) {
				for (int j = 0; j < dpx[0].length; j++) {
					if (dpx[i][j]) {
						dpx[i + 1][j + xa.get(i)] = true;
						dpx[i + 1][j - xa.get(i)] = true;
					}
				}
			}

			for (int i = 0; i < ya.size(); i++) {
				for (int j = 0; j < dpy[0].length; j++) {
					if (dpy[i][j]) {
						dpy[i + 1][j + ya.get(i)] = true;
						dpy[i + 1][j - ya.get(i)] = true;
					}

				}
			}
		}

		if (dpx[xa.size()][8000 + x] && dpy[ya.size()][8000 + y]) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
