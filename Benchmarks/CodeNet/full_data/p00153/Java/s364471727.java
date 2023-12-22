import java.awt.geom.*;
import java.io.*;
import java.util.*;

public class Main{
	int [] dp;
	int max = 1000;
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			Point2D [] triP = new Point2D[3];
			int x = sc.nextInt();
			int y = sc.nextInt();
			if((x|y) == 0) break;
			triP[0] = new Point2D.Double(x, y);
			for(int i = 1;  i < 3; i++){
				x = sc.nextInt();
				y = sc.nextInt();
				triP[i] = new Point2D.Double(x, y);
			}
			Line2D [] triL = new Line2D[3];
			for(int i = 0; i < 3; i++){
				triL[i] = new Line2D.Double(triP[i], triP[(i+1) % 3]);
			}
			int cx = sc.nextInt();
			int cy = sc.nextInt();
			int cr = sc.nextInt();
			Point2D cp = new Point2D.Double(cx, cy);
			
			int state = -1;
			boolean isBorC = false;
			for(int i = 0; i < 3; i++){
				double dis = triL[i].ptSegDist(cp);
				if(dis <= cr){
					isBorC = true;
					break;
				}
			}
			if(isBorC){
				boolean flg = true;
				for(int i = 0; i < 3; i++){
					double dis = triP[i].distance(cp);
					if(dis >= cr){
						flg = false;
						break;
					}
				}
				if(!flg){
					state = 2;
				}
				else{
					state = 1;
				}
				
			}
			else{
				boolean flg = true;
				int sign = triL[0].relativeCCW(cp);
				for(int i = 1; i < 3;i++){
					int now = triL[i].relativeCCW(cp);
					if(now * sign != 1){
						flg = false;
						break;
					}
				}
				if(flg){
					state = 0;
				}
				else{
					state = 3;
				}
			}
			System.out.println((char)('a' + state));
		}
	}
	
	private void debug(Object... o) { System.out.println("debug = " + Arrays.deepToString(o)); }

	public static void main(String[] args) {
		new Main().doit();
	}
}