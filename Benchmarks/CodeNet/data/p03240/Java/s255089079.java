import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	void doIt() {
		int n = sc.nextInt();
		int xyh[][] = new int[101][101];
		for(int i = 0; i <= 100; i++) {
			Arrays.fill(xyh[i], 0);
		}
		int x, y, h;
		for(int i = 0; i < n; i++) {
			x = sc.nextInt();
			y = sc.nextInt();
			h = sc.nextInt();
			xyh[x][y] = h;
			seach(xyh, x, y, h);
			if(h == 0)xyh[x][y] = -1;
		}
		int maxh = 0, maxx = 0, maxy = 0;
		for(int i = 0; i <= 100; i++) {
			for(int j = 0; j <= 100; j++) {
				if(xyh[i][j] > maxh) {
					maxx = i;
					maxy = j;
					maxh = xyh[i][j];
				}
			}
		}
		maxh = Math.max(maxh, 0);
		System.out.println(maxx+" "+maxy+" "+maxh);
	}
	void seach(int xyh[][], int x, int y, int h) {
		int xx, yy, hh;
		if(h == 0) return;
		for(int i = 0; i <= 100; i++) {
			for(int j = 0; j <= 100; j++) {
				xx = Math.abs(x - i);
				yy = Math.abs(y - j);
				hh = h + xx + yy;
				if(xyh[i][j] == -1)xyh[i][j] = hh;
				else if(xyh[i][j] != hh)xyh[i][j] = -2;
			}
		}
	}
	Main(){doIt();}
	public static void main(String[] args) {
		new Main();
	}

}
