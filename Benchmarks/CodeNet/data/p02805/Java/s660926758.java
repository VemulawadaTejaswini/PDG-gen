import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int x[] = new int[N];
		int y[] = new int [N];
		double minX = Integer.MAX_VALUE;
		double maxX = Integer.MIN_VALUE;
		double minY = Integer.MAX_VALUE;
		double maxY = Integer.MIN_VALUE;

		int minXI = 0;
		int maxXI = 0;
		int minYI = 0;
		int maxYI = 0;

		double len1 = 0;
		double len2 = 0;
		double len3 = 0;
		double len4 = 0;

		double maxLen = 0;

		for (int i = 0; i < N; i++) {
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
		}

		for (int i = 0; i < N; i++) {
			if (x[i] < minX) {
				minX = x[i];
				minXI = i;
			}
			if (maxX < x[i]) {
				maxX = x[i];
				maxXI = i;
			}
			if (y[i] < minY) {
				minY = y[i];
				minYI = i;
			}
			if (maxY < y[i]) {
				maxY = y[i];
				maxYI = i;
			}
		}

		double centerX = (maxX - minX) / 2;
		double centerY = (maxY - minY) / 2;

		len1 = Math.sqrt(Math.pow(centerX - x[minXI], 2) + Math.pow(centerY - y[minXI], 2));
		len2 = Math.sqrt(Math.pow(centerX - x[maxXI], 2) + Math.pow(centerY - y[maxXI], 2));
		len3 = Math.sqrt(Math.pow(centerX - x[minYI], 2) + Math.pow(centerY - y[minYI], 2));
		len4 = Math.sqrt(Math.pow(centerX - x[maxYI], 2) + Math.pow(centerY - y[maxYI], 2));

		maxLen = Math.max(len1, Math.max(len2, Math.max(len3, len4)));

		System.out.println(maxLen);


	}
}