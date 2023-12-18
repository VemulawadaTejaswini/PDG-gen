import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		n = sc.nextInt();
		int[] x = new int[n];
		int[] y = new int[n];
		int[] h = new int[n];
		for (int i = 0; i < n; i++) {
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
			h[i] = sc.nextInt();
		}

		int MAX = 100;

		for (int posY = 0; posY <= MAX; posY++) {
			for (int posX = 0; posX <= MAX; posX++) {

				int needH = -1;

				for (int i = 0; i < n; i++) {
					if(h[i] > 0) {
						int tmp = h[i] + Math.abs(x[i] - posX) + Math.abs(y[i] - posY);
						if(needH == -1) {
							needH = tmp;
						} else if(needH != tmp) {
							needH = -2;
							break;
						}
					}
				}
				if(needH == -2) continue;

				for (int i = 0; i < n; i++) {
					int dist = 0;
					if(h[i] == 0) {
						dist = Math.abs(x[i] - posX) + Math.abs(y[i] - posY);
						if(needH > dist) {
							needH = -2;
							break;
						}
					}
				}
				if(needH == -2) continue;

				System.out.println(posX + " " + posY + " " + needH);
				return;
			}
		}
	}
}