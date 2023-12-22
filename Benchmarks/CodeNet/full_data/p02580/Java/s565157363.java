import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	static class Pair {
		int h, w;
		public Pair(int h, int w) {
			this.h = h;
			this.w = w;
		}
		public boolean equals(Pair p) {
			if (this.h == p.h && this.w == p.w)
				return true;
			return false;
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String[] tokens = in.readLine().split(" ");
		int h = Integer.parseInt(tokens[0]);
		int w = Integer.parseInt(tokens[1]);
		int m = Integer.parseInt(tokens[2]);
		int[] nh = new int[h+1];
		int[] nw = new int[w+1];
		String[] split = new String[2];
		int ah, aw;
		ArrayList<Pair> list = new ArrayList<Pair>();
		for (int i = 0; i < m; i++) {
			split = in.readLine().split(" ");
			ah = Integer.parseInt(split[0]);
			aw = Integer.parseInt(split[1]);
			nh[ah]++;
			nw[aw]++;
			list.add(new Pair(ah, aw));
		}
		int maxH = 0, maxW = 0;
		for (int i = 1; i <= h; i++)
			maxH = Math.max(maxH, nh[i]);
		for (int i = 1; i <= w; i++)
			maxW = Math.max(maxW, nw[i]);
		int maxA = maxH+maxW-1;
		ArrayList<Integer> listH = new ArrayList<Integer>();
		ArrayList<Integer> listW = new ArrayList<Integer>();
		for (int i = 1; i <= h; i++) {
			if (nh[i] == maxH)
				listH.add(i);
		}
		for (int i = 1; i <= w; i++) {
			if (nw[i] == maxW)
				listW.add(i);
		}
		outerloop:
		for (int i : listH) {
			innerloop:
			for (int j : listW) {
				for (Pair p : list) {
					if (p.h == i && p.w == j)
						continue innerloop;
				}
				maxA++;
				break outerloop;
			}
		}
		System.out.println(maxA);
 	}
}
