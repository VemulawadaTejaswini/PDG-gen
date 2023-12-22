import java.util.Scanner;
public class Main {
	static int[] dx = {-1, 0, 1, 0};
	static int[] dy = {0, -1, 0, 1};
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int N = sc.nextInt();
			if (N == 0) break;
			int[] n = new int[N];
			int[] d = new int[N];
			int[] x = new int[N];
			int[] y = new int[N];
			for (int i = 1; i < N; i++) {
				n[i] = sc.nextInt();
				d[i] = sc.nextInt();
			}
			x[0] = 0; y[0] = 0;
			for (int i = 1; i < N; i++) {
				x[i] = x[n[i]] + dx[d[i]];
				y[i] = y[n[i]] + dy[d[i]];
			}
			int maxX, maxY, minX, minY;
			maxX = maxY = -1000;
			minX = minY = 1000;
			for (int i = 0; i < N; i++) {
				if (maxX < x[i]) {
					maxX = x[i];
				}
				if (minX > x[i]) {
					minX = x[i];
				}
				if (maxY < y[i]) {
					maxY = y[i];
				}
				if (minY > y[i]) {
					minY = y[i];				
				}
			}
			int w = maxX - minX + 1;
			int h = maxY - minY + 1;
			System.out.println(w + " " + h);
		}
	}
}