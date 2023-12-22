import java.awt.geom.*;
import java.io.*;
import java.util.*;

public class Main{
	Point2D [] triP;
	Line2D [] triL;
	Point2D cp;
	int cr;
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			triP = new Point2D[3];
			int x = sc.nextInt();
			int y = sc.nextInt();
			if((x|y) == 0) break;
			triP[0] = new Point2D.Double(x, y);
			for(int i = 1;  i < 3; i++){
				x = sc.nextInt();
				y = sc.nextInt();
				triP[i] = new Point2D.Double(x, y);
			}
			triL = new Line2D[3];
			for(int i = 0; i < 3; i++){
				triL[i] = new Line2D.Double(triP[i], triP[(i+1) % 3]);
			}
			int cx = sc.nextInt();
			int cy = sc.nextInt();
			cr = sc.nextInt();
			cp = new Point2D.Double(cx, cy);

			boolean res = isB();
			if(res){
				System.out.println("b");
				continue;
			}
			
			boolean res2 = isIn();
			if(res2){
				boolean flg = true;
				for(int i = 0; i < 3; i++){
					double dis = triL[i].ptSegDist(cp);
					if(dis < cr){
						flg = false;
					}
				}
				if(flg){
					System.out.println("a");
				}
				else{
					System.out.println("c");
				}
			}
			else{
				boolean flg = true;
				for(int i = 0; i < 3; i++){
					double dis = triL[i].ptSegDist(cp);
					if(dis <= cr){
						flg = false;
					}
				}
				if(flg){
					System.out.println("d");
				}
				else{
					System.out.println("c");
				}
				
			}
		}
	}
	
	private boolean isIn() {
		int sign = triL[0].relativeCCW(cp);
		for(int i = 1; i < 3;i++){
			int now = triL[i].relativeCCW(cp);
			if(now * sign != 1){
				return false;
			}
		}
		return true;
	}

	private boolean isB() {
		for(int i = 0; i < 3; i++){
			double dis = triP[i].distance(cp);
			if(dis > cr){
				return false;
			}
		}
		return true;
	}

	private void debug(Object... o) { System.out.println("debug = " + Arrays.deepToString(o)); }

	public static void main(String[] args) {
		new Main().doit();
	}
}