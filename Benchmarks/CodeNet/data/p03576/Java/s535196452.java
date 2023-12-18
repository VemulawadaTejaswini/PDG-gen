import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();

		long[][] xy = new long[n][2];
		for (int i = 0; i < n; i++) {
			xy[i][0] = sc.nextInt();
			xy[i][1] = sc.nextInt();
		}

		long answer = Long.MAX_VALUE;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				for (int l = 0; l < n; l++) {
					for (int m = 0; m < n; m++) {
						long lx = xy[i][0];
						long hx = xy[j][0];
						long ly = xy[l][1];
						long hy = xy[m][1];
						if (lx > hx || ly > hy) continue;
						int count = 0;
						for (int o = 0; o < n; o++) {
							if (xy[o][0] >= lx && xy[o][0] <= hx
									&& xy[o][1] >= ly && xy[o][1] <= hy) {
								count++;
							}
						}
						if (count >= k) answer = Math.min(answer, (hx - lx) * (hy - ly));
					}
				}
			}
		}

		System.out.println(answer);
	}
}
