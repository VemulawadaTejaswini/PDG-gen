import java.util.Scanner;

public class Main {
	
	public static int solve(int p[][], int h, int w, int l, int r, int d) {
		int ans = 0, tmp = l;
		while(tmp != r) {
			ans += Math.abs(p[tmp][0] - p[tmp + d][0]) + Math.abs(p[tmp][1]-p[tmp + d][1]);
			tmp += d;
		}
		return ans;
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt(), w = sc.nextInt(), d = sc.nextInt();
		int p[][] = new int[h * w + 1][2];
		for (int i = 0; i < h; ++i) {
			for (int j = 0; j < w; ++j) {
				int a = sc.nextInt();
				p[a][0] = i;
				p[a][1] = j;
			}
		}
		int q = sc.nextInt(), ans = 0;
		for (int i = 0; i < q; ++i) {
			int l = sc.nextInt();
			int r = sc.nextInt();
			ans = solve(p, h, w, l, r, d);
			System.out.println(ans);
		}
		sc.close();
	}
}
