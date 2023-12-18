import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int h = sc.nextInt();
		int minx = 0;
		int maxx = w;
		int miny = 0;
		int maxy = h;
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			int mode = sc.nextInt();
			if(mode == 1) {
				minx = x;
			} else if(mode == 2) {
				maxx = x;
			} else if(mode == 3) {
				miny = y;
			} else {
				maxy = y;
			}
		}
		if(minx < maxx && miny < maxy) {
			System.out.println((maxx-minx) * (maxy-miny));
		} else {
			System.out.println(0);
		}
	}
}