import java.util.*;
import java.awt.geom.Point2D;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		while(true){
			int n = sc.nextInt();
			if(n == 0) break;
			Point2D[] ps = new Point2D[n];
			for(int i=0;i<n;i++){
				String[] s = sc.next().split(",");
				ps[i] = new Point2D.Double(Double.parseDouble(s[0]),Double.parseDouble(s[1]));
			}
			System.out.println(n-makeConvexHull(ps));
		}
	}

	static int num;
	private static int makeConvexHull(Point2D[] ps){
		num = ps.length;
		int minIndex = 0;
		double minY = ps[0].getY();
		double maxX = ps[0].getX();
		for(int i=1;i<num;i++){
			if(minY > ps[i].getY()
				 || (minY == ps[i].getY() && maxX < ps[i].getX())){
				maxX = ps[i].getX();
				minY = ps[i].getY();
				minIndex = i;
			}
		}

		double rad,find,now=0.0,dist=0.0;
		int j;
		for(j=0;j<num;j++){
			Point2D tmp = ps[j];
			ps[j] = ps[minIndex];
			ps[minIndex] = tmp;
			find = 360;
			for(int i=j+1;i<num;i++){
				rad = getTheta(ps[j],ps[i]);
				if(!ps[j].equals(ps[i]) && find >= rad && rad >= now){
					if(find != rad || find == rad
						 && dist < ps[j].distance(ps[i])){
						dist = ps[j].distance(ps[i]);
						find = rad;
						minIndex = i;
					}
				}
			}
			if(find == 360 || minIndex == num){
				break;
			}
			now = find;
		}
		j++;
		while(ps[0].equals(ps[j-1])){
			j--;
		}
		num = j;
		return num;
	}

	private static double getTheta(Point2D p1, Point2D p2){
		double dx,dy,ax,ay;
		double t;
		dx = p2.getX() - p1.getX();
		ax = dx >= 0 ? dx : -dx;
		dy = p2.getY() - p1.getY();
		ay = dy >= 0 ? dy : -dy;

		t = (ax + ay == 0) ? 0 : dy / (ax + ay);
		if(dx < 0){
			t = 2 - t;
		}
		else if(dy < 0){
			t += 4;
		}
		return t * 90.0;
	}
}