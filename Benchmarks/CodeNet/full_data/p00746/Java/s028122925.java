import java.util.Scanner;

public class Main {
	public static final int[] dx = {-1,0,1,0};
	public static final int[] dy = {0,1,0,-1};
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int n = sc.nextInt();
			if (n == 0) {
				return;
			}
			int[] x = new int[n];
			int[] y = new int[n];
			for(int i=0;i<n-1;i++) {
				int a = sc.nextInt();
				int d = sc.nextInt();
				x[i+1] = x[a] + dx[d];
				y[i+1] = y[a] + dy[d];
			}
			int x1 = Integer.MAX_VALUE;
			int y1 = Integer.MAX_VALUE;
			int x2 = Integer.MIN_VALUE;
			int y2 = Integer.MIN_VALUE;
			for(int i=0;i<n;i++) {
				x1 = Math.min(x1, x[i]);
				y1 = Math.min(y1, y[i]);
				x2 = Math.max(x2, x[i]);
				y2 = Math.max(y2, y[i]);
			}
			System.out.println((x2-x1+1) + " " + (y2-y1+1));
		}
	}

}