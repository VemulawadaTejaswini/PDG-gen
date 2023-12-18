import java.util.*;

public class Main {

	public static void main (String[] args)  {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		int[][] field = new int[h][w];
		for (int i = 0; i< h; i++) {
			for (int j = 0; j < w; j++) {
				field[i][j] = sc.nextInt();
			}
		}
		int[][] next = new int[w][h];
		int[] idxes = new int[h];
		int count = 0;
		while (count < h * w) {
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					int x = field[i][j];
					if (x == 0) {
						continue;
					}
					int y = (x - 1) / w;
					if (next[idxes[y]][i] == 0) {
						next[idxes[y]][i] = x;
						field[i][j] = 0;
						count++;
						idxes[y]++;
					}
				}
			}
		}
		StringBuilder sb = new StringBuilder();
		display(next, sb);
		for (int i = 0; i < w; i++) {
			Arrays.sort(next[i]);
		}
		display(next, sb);
		System.out.print(sb);
	}
	
	static void display(int[][] field, StringBuilder sb) {
		for (int i = 0; i < field[0].length; i++) {
			for (int j = 0; j < field.length; j++) {
				if (j != 0) {
					sb.append(" ");
				}
				sb.append(field[j][i]);
			}
			sb.append("\n");
		}
	}
}
