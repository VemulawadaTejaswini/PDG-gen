import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] red = new int[n][2];
		for (int i = 0; i < n; i++) {
			red[i][0] = sc.nextInt();
			red[i][1] = sc.nextInt();
		}
		int[][] blue = new int[n][2];
		for (int i = 0; i < n; i++) {
			blue[i][0] = sc.nextInt();
			blue[i][1] = sc.nextInt();
		}
		sc.close();

		int ans = 0;
		for (int i = 0; i < n; i++) {
			int idx = getYMaxRedIdx(red, blue[i][0], blue[i][1]);
			if (idx != -1) {
				red[idx][0] = -1;
				red[idx][1] = -1;
				ans++;
			}
		}
		System.out.println(ans);
	}

	static int getYMaxRedIdx(int[][] red, int x, int y) {
		int max = -1;
		int idx = -1;
		for (int i = 0; i < red.length; i++) {
			if (red[i][0] == -1
					|| red[i][0] > x
					|| red[i][1] > y) {
				continue;
			}
			if (max < red[i][1]) {
				max = red[i][1];
				idx = i;
			}
		}
		return idx;
	}
}
