import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int h = in.nextInt();
		while (n != 0 || h != 0) {
			boolean[][][] xyz = new boolean[n][n][n];
			for (int i = 0; i < h; i++) {
				String o = in.next();
				int a = in.nextInt() - 1;
				int b = in.nextInt() - 1;
				if ("xy".equals(o)) {
					Arrays.fill(xyz[a][b], true);
				} else if ("xz".equals(o)) {
					boolean[][] yz = xyz[a];
					for (boolean z[] : yz) {
						z[b] = true;
					}
				} else {
					for (boolean[][] yz : xyz) {
						yz[a][b] = true;
					}
				}
			}
			int counter = 0;
			for (boolean[][] yz : xyz) {
				for (boolean[] z : yz) {
					for (boolean box : z) {
						if (!box) {
							counter++;
						}
					}
				}
			}
			System.out.println(counter);
			n = in.nextInt();
			h = in.nextInt();
		}
	}
}