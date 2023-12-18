import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static int N;
	static int T;


	public static void main(String[] args) {
		N = sc.nextInt();

		int[] x = new int[N];
		int[] y = new int[N];
		int[] h = new int[N];

		for (int i = 0; i < N; i++) {
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
			h[i] = sc.nextInt();
		}

		int MAX = 100;

		for (int posY = 0; posY <= MAX ; posY++) {
			for (int posX = 0; posX <= MAX; posX++) {
				int needH = -1;

				for (int i = 0; i < N; i++) {
					if (h[i] > 0) {
						int tmp = h[i] + Math.abs(posX - x[i]) + Math.abs(posY - y[i]);

						if (needH == -1) {
							needH = tmp;
						} else {
							if (needH != tmp) {
								needH = -2;
								break;
							}
						}
					}
				}
				if (needH == -2) continue;

				for (int i = 0; i < N; i++) {
					if (h[i] == 0) {
						int dist =  Math.abs(posX - x[i]) + Math.abs(posY - y[i]);

						if (needH > dist) {
							needH = -2;
							break;
						}
					}
				}
				if (needH == -2) break;

				System.out.println(posX + " " + posY + " " + needH);
			}
		}
	}

}
