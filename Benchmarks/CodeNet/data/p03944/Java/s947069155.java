import java.io.*;
import java.util.*;
 
public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// get a integer
		int W = sc.nextInt();
		int H = sc.nextInt();
		int N = sc.nextInt();
		
		int whiteRegion; // initially
		int W_MIN = 0;
		int W_MAX = W;
		int H_MIN = 0;
		int H_MAX = H;
		
		for (int i = 0; i < N; i++) {
			int plot_W = sc.nextInt();
			int plot_H = sc.nextInt();
			int a = sc.nextInt(); // 1 ~ 4
			
			if (a == 1) {
				if ( plot_W > W_MIN)
					W_MIN = plot_W;
			}
			else if (a == 2) {
				if ( plot_W < W_MIN) {
					W_MIN = 0;
					W_MAX = 0;
				}
				else
					W_MAX = plot_W;
			}
			else if (a == 3) {
				if ( plot_H > H_MIN)
					H_MIN = plot_H;
			}
			else {
				if ( plot_H < H_MIN) {
					H_MIN = 0;
					H_MAX = 0;
				}
				else
					H_MAX = plot_H;
			}
		}
		whiteRegion = Math.abs(W_MAX - W_MIN) * Math.abs(H_MAX - H_MIN);
		System.out.println(whiteRegion);
		sc.close();
	}
}