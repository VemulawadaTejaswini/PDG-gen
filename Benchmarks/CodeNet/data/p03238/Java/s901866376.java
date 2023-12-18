
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = Integer.parseInt(scan.next());
		int[] x = new int[N];
		int[] y = new int[N];
		long[] h = new long[N];
		for (int i = 0; i < N; i++) {
			x[i] = Integer.parseInt(scan.next());
			y[i] = Integer.parseInt(scan.next());
			h[i] = Integer.parseInt(scan.next());
		}
		int Cx = -1;
		int Cy = -1;
		long candidateH;
		boolean find = true;
		int candidateIndex = 0;
		while (h[candidateIndex] == 0) {
			candidateIndex++;
		}

		for (int i = 0; i <= 100; i++) {
			Cx = i;
			for (int j = 0; j <= 100; j++) {
				Cy = j;
				find = true;
				candidateH = h[candidateIndex] + Math.abs(Cx - x[candidateIndex]) + Math.abs(Cy - y[candidateIndex]);
				for (int k = 0; k < N; k++) {
						if (h[k] != Math.max(candidateH - Math.abs(Cx - x[k]) - Math.abs(Cy - y[k]), 0)) {
							break;
						}
					}
				}
				if (find) {
					System.out.println(Cx + " " + Cy + " " + candidateH);
					return;
				}
			}
		}
	}
}
