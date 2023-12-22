import java.util.*;
class Main {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		while (true) {
			int n = stdIn.nextInt();
			if(n == 0) break;
			int[][] x = new int[n + 1][];
			int[][] y = new int[n + 1][];
			for (int i = 0; i < n + 1; i++) {
				int m = stdIn.nextInt();
				x[i] = new int[m];
				y[i] = new int[m];
				for (int j = 0; j < m; j++) {
					int xi = stdIn.nextInt();
					int yi = stdIn.nextInt();
					x[i][j] = xi;
					y[i][j] = yi;
				}
			}
			//原点へ移動
			for (int i = 0; i < n + 1; i++) {
				int dx = x[i][0];
				int dy = y[i][0];
				for (int j = 0; j < x[i].length; j++) {
					x[i][j] -= dx;
					y[i][j] -= dy;
				}
			}
			
			int[] CAX = x[0];
			int[] CAY = y[0];
			
			int[] CBX = new int[x[0].length];
			int[] CBY = new int[y[0].length];
			int dx = CAX[CAX.length-1];
			int dy = CAY[CAY.length-1];
			for(int i = 0; i < x[0].length; i++) {
				CBX[i] = CAX[x[0].length - i - 1]-dx;
				CBY[i] = CAY[x[0].length - i - 1]-dy;
			}
			
			for(int i = 1; i < n+1; i++) {
				boolean isF = false;
				for(int j = 0; j < 3; j++) {
					if(check(CAX,CAY,x[i],y[i]) || check(CBX,CBY,x[i],y[i])) {
						isF = true;
					}
					turn(x[i],y[i]);
				}
				if(check(CAX,CAY,x[i],y[i]) || check(CBX,CBY,x[i],y[i])) {
					isF = true;
				}
				if(isF) {
					System.out.println(i);
				}
				
			}
			System.out.println("+++++");
		}
		
	}
	public static void turn(int[] ax, int[] ay) {
		for(int i = 0; i < ax.length; i++) {
			ay[i] *= -1;
			int tmp = ax[i];
			ax[i] = ay[i];
			ay[i] = tmp;
		}
	}
	public static boolean check(int[] ax, int[] ay, int[] bx, int[] by) {
		if(ax.length != bx.length) return false;
		for(int i = 0; i < ax.length; i++) {
			if(ax[i] != bx[i]) return false;
			if(ay[i] != by[i]) return false;
		}
		return true;
	}
}