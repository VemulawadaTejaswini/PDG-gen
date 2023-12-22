import java.util.Scanner;

public class Main{
	static int[][] m = new int[10][10];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			String t = sc.next();
			String[] a = t.split(",");
			int x = Integer.parseInt(a[0]);
			int y = Integer.parseInt(a[1]);
			int s = Integer.parseInt(a[2]);
			paint(x, y, s);
		}
		sc.close();
		int cnt = 0;
		int[] d = new int[51];
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 10; j++) {
				if(m[i][j] == 0) cnt++;
				d[m[i][j]]++;
			}
		}
		int max = 0;
		for(int i = 0; i < 51; i++) {
			if(d[i] != 0) {
				max = i;
			}
		}
		System.out.println(cnt);
		System.out.println(max);
	}
	static int[] d1x = {1, -1, 0, 0};
	static int[] d1y = {0, 0, 1, -1};
	static int[] d2x = {1, 1, -1, -1};
	static int[] d2y = {1, -1, 1, -1};
	static int[] d3x = {2, -2, 0, 0};
	static int[] d3y = {0, 0, -2, 2};
	static void paint(int x, int y, int s) {
		m[y][x]++;
		for(int i = 0; i < 4; i++) {
			if(check(x, y, d1x[i], d1y[i])) {
				m[y + d1y[i]][x + d1x[i]]++;
			}
		}
		if(s == 1) return;
		for(int i = 0; i < 4; i++) {
			if(check(x, y, d2x[i], d2y[i])) {
				m[y + d2y[i]][x + d2x[i]]++;
			}
		}
		if(s == 2) return;
		for(int i = 0; i < 4; i++) {
			if(check(x, y, d3x[i], d3y[i])) {
				m[y + d3y[i]][x + d3x[i]]++;
			}
		}
	}
	static boolean check(int x, int y, int dx, int dy) {
		int nx = x + dx;
		int ny = y + dy;
		if(nx >= 0 && nx < 10 && ny >= 0 && ny < 10) {
			return true;
		}else {
			return false;
		}
	}
}
