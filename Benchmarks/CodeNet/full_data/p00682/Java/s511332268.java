import java.util.*;
import java.io.*;

public class Main {
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int cnt=1;
			while(in.hasNext()){
				int n = in.nextInt();
				int xs[] = new int[n], ys[] = new int[n];
				for(int i=0; i<n; i++){
					xs[i] = in.nextInt();
					ys[i] = in.nextInt();
				}
				double tx=0.0, ty=0.0;
				for(int i=0; i<n; i++){
					tx += xs[i];
					ty += ys[i];
				}
				double cx = tx/n, cy = ty/n;
				double ans = 0.0;
				for(int i=0; i<n; i++){
					ans += getArea(cx, cy, xs[i], ys[i], xs[(i+1)%n], ys[(i+1)%n]);
				}
				System.out.printf("%d %.1f\n", cnt, ans);
				cnt++;
			}
	}
	
	private static double getArea(double x1, double y1, double x2, double y2, double x3, double y3){
		double px = x2-x1, py = y2-y1, qx = x3-x1, qy = y3-y1;
		return 0.5*Math.abs(px*qy - qx*py);
	}
}