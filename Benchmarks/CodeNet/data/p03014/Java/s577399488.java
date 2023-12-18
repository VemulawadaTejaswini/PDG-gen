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
				block[i][j] = (ch[j] == '#')?0:1;
			}
		}

		for(int h = 0;h < H;h++) {
			ArrayList<Integer> buf = new ArrayList<Integer>();
			for(int w = 0;w < W;w++) {
				if(block[h][w] == 0) {
					buf.add(w);
				}
			}
			Y.add(buf);
		}
		for(int w = 0;w < W;w++) {
			ArrayList<Integer> buf = new ArrayList<Integer>();
			for(int h = 0;h < H;h++) {
				if(block[h][w] == 0) {
					buf.add(h);
				}
			}
			T.add(buf);
		}


		long ans = 0;
		for(int h = 0;h < H;h++) {
			ArrayList<Integer> nowY = Y.get(h);
			for(int w = 0;w < W;w++) {
				if(block[h][w] == 0)continue;

				int yl = 0, tl = 0;
				ArrayList<Integer> nowT = T.get(w);

				int ys = -1;
				for(int i = 0;i < nowY.size();i++) {
					if(h < nowY.get(i)) {
						yl = nowY.get(i)-ys-1;
						break;
					}
					ys = nowY.get(i);
				}
				if(yl == 0)yl = W-ys - 1;

				int ts = -1;
				for(int i = 0;i < nowT.size();i++) {
					if(w < nowT.get(i)) {
						tl = nowT.get(i)-ts-1;
						break;
					}
					ts = nowT.get(i);
				}
				if(tl == 0)tl = H-ts - 1;

				ans = Math.max(ans, yl + tl-1);

			}
		}

		System.out.println(ans);
	}

}
