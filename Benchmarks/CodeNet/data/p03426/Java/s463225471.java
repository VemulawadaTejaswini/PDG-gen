import java.awt.Point;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		int D = sc.nextInt();
		Point[] A = new Point[H*W];
		for(int i = 0; i < H; i++)
			for(int j = 0; j < W; j++)
				A[sc.nextInt()-1] = new Point(j, i);
		int[] c = new int[H*W+D];
		for(int i = 0; i < D; i++) {
			int j = i;
			while(j + D < H*W) {
				c[j+D] = c[j] + Math.abs(A[j].x-A[j+D].x) + Math.abs(A[j].y-A[j+D].y);
				j += D;
			}
		}
		int Q = sc.nextInt();
		for(int i = 0; i < Q; i++) {
			int L = sc.nextInt()-1;
			int R = sc.nextInt()-1;
			System.out.println(c[R] - c[L]);
		}
	}

}