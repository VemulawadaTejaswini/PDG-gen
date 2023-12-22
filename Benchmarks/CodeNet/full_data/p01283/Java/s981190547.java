import java.util.*;
import static java.lang.System.*;

public class Main {

	Scanner sc = new Scanner(in);
	
	void run() {
		int n;
		int[][][][] R = new int[16][16][16][258];
		for (int s = 0; s < 16; s++) {
			for (int a = 0; a < 16; a++) {
				for (int c = 0; c < 16; c++) {
					R[s][a][c][0] = s;
					for (int i = 1; i < 258; i++) {
						R[s][a][c][i] = (a*R[s][a][c][i-1] + c) % 256;
					}
				}
			}
		}
		while (true) {
			n = sc.nextInt();
			if (n == 0) break;
			int[] I = new int[n];
			for (int i = 0; i < n; i++)
				I[i] = sc.nextInt();
			
			int[] O = new int[n];
			
			int anss, ansa, ansc;
			anss = ansa = ansc = 0;
			double min = Double.MAX_VALUE;
			
			int[] num = new int[257];
			for (int s = 0; s < 16; s++) {
				for (int a = 0; a < 16; a++) {
					for (int c = 0; c < 16; c++) {
						for (int i = 0; i < n; i++) {
							O[i] = (I[i] + R[s][a][c][i+1]) % 256;
						}
						Arrays.fill(num, 0);
						for (int i : O)
							num[i]++;
						double h = 0;
						for (int i : num) {
							if (i > 0) {
								h -= (double)i/n*Math.log((double)i/n);
							}
						}
						if (h < min) {
							min = h;
							anss = s;
							ansa = a;
							ansc = c;
						}
					}
				}
			}
			
			out.printf("%d %d %d\n", anss, ansa, ansc);
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}

}