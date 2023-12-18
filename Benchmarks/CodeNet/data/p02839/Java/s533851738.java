import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		int[][] field = new int[h][w];
		for (int i = 0; i < h; i++) {
		    for (int j = 0; j < w; j++) {
		        field[i][j] = sc.nextInt();
		    }
		}
		for (int i = 0; i < h; i++) {
		    for (int j = 0; j < w; j++) {
		        field[i][j] -= sc.nextInt();
		        field[i][j] = Math.abs(field[i][j]);
		    }
		}
		ArrayList<HashSet<Integer>> list = new ArrayList<>();
		for (int i = 0; i < h * w; i++) {
		    list.add(new HashSet<>());
		}
		boolean[][][] ans = new boolean[h][w][h * w * 80 + 1];
		ans[0][0][field[0][0]] = true;
		for (int i = 0; i < h; i++) {
		    for (int j = 0; j < w; j++) {
		        if (j != 0) {
		            for (int k = 0; k < ans[i][j].length; k++) {
		                if (ans[i][j - 1][k]) {
		                    ans[i][j][k + field[i][j]] = true;
		                    ans[i][j][Math.abs(k - field[i][j])] = true;
		                }
		            }
		        }
		        if (i != 0) {
		            for (int k = 0; k < ans[i][j].length; k++) {
		                if (ans[i - 1][j][k]) {
		                    ans[i][j][k + field[i][j]] = true;
		                    ans[i][j][Math.abs(k - field[i][j])] = true;
		                }
		            }
		        }
		    }
		}
		for (int i = 0; i < ans[h - 1][w - 1].length; i++) {
		    if (ans[h - 1][w - 1][i]) {
		        System.out.println(i);
		        return;
		    }
		}
	}
}
