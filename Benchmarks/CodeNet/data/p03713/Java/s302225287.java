import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		int[][][] all = new int[4][][];
		all[0] = getArray(h - h / 3, w, h / 3 * w);
		all[1] = getArray(h - h / 3 - 1, w, (h / 3 + 1) * w);
		all[2] = getArray(h,  w - w / 3, w / 3 * h);
		all[3] = getArray(h, w - w / 3 - 1, (w / 3 + 1) * h);
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < all.length; i++) {
		    for (int j = 0; j < all[i].length; j++) {
		        min = Math.min(min, Math.max(Math.max(all[i][j][0], all[i][j][1]), all[i][j][2]) - Math.min(Math.min(all[i][j][0], all[i][j][1]), all[i][j][2]));
		    }
		}
		System.out.println(min);
	}
	
	static int[][] getArray(int h, int w, int piece) {
	    int[][] ans = new int[2][3];
	    ans[0][0] = h / 2 * w;
	    ans[0][1] = h * w - ans[0][0];
	    ans[0][2] = piece;
	    ans[1][0] = w / 2 * h;
	    ans[1][1] = h * w - ans[1][0];
	    ans[1][2] = piece;
	    return ans;
	}
}
