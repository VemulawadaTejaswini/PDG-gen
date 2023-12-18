import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int H = scn.nextInt();
		int W = scn.nextInt();
		scn.nextLine();
		int[][] block = new int[H][W];
		ArrayList<ArrayList<Integer>> Y = new ArrayList<ArrayList<Integer>>();
		ArrayList<ArrayList<Integer>> T = new ArrayList<ArrayList<Integer>>();

		int[][] yoko = new int[H][W];
		int[][] tate = new int[H][W];

		for (int i = 0; i < H; i++) {
			char[] ch = scn.nextLine().toCharArray();
			for (int j = 0; j < W; j++) {
				block[i][j] = (ch[j] == '#') ? 0 : 1;
			}
		}

		for (int h = 0; h < H; h++) {
			ArrayList<Integer> buf = new ArrayList<Integer>();
			buf.add(-1);
			for (int w = 0; w < W; w++) {

				if (block[h][w] == 0) {
					buf.add(w);
				}
			}
			buf.add(W);
			Y.add(buf);
		}
		for (int w = 0; w < W; w++) {
			ArrayList<Integer> buf = new ArrayList<Integer>();
			buf.add(-1);
			for (int h = 0; h < H; h++) {

				if (block[h][w] == 0) {
					buf.add(h);
				}
			}
			buf.add(H);
			T.add(buf);
		}

		long ans = 0;
		for (int h = 0; h < H; h++) {
			ArrayList<Integer> nowY = Y.get(h);
			for (int w = 0; w < W; w++) {
				if (block[h][w] == 0)
					continue;

				int yl = 0, tl = 0;
				ArrayList<Integer> nowT = T.get(w);

				int yr = where(nowY,w);
				yl = (yr == -1)?W:nowY.get(yr) - nowY.get(yr-1) - 1;

				int tr = where(nowT,h);
				tl = (tr == -1)?H:nowT.get(tr) - nowT.get(tr-1) - 1;

				ans = Math.max(ans, yl + tl - 1);

			}
		}

		System.out.println(ans);
	}

	public static int where(ArrayList<Integer> A, int s) {
		int where = -1;
		int r = A.size()-1;
		int l = 0;
		if(r == 1)return -1;
		while(r-l > 1) {
			where = (r+l)/2;
			if(s > A.get(where)) {
				l = where;
			}else {
				r = where;
			}
		}

		return r;
	}
}
