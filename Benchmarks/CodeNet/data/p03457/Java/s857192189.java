
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int time = 0;
		int x = 0;
		int y = 0;
		boolean ans = true;
		for(int i = 0; i < n; i++) {
			int nexttime = sc.nextInt();
			int nextx = sc.nextInt();
			int nexty = sc.nextInt();
			int dtime = nexttime - time;
			int dx = Math.abs(nextx - x);
			int dy = Math.abs(nexty - y);
			if(dtime >= dx + dy && dtime % 2 == (dx + dy) % 2) {
				time = nexttime;
				x = nextx;
				y = nexty;
			} else {
				ans = false;
				break;
			}
		}
		if(ans) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

}
