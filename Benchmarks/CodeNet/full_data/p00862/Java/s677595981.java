import java.util.*;
import java.awt.geom.*;
public class Main {
	double EPS = 1.0e-08;

	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			if(n == 0) break;
			Point2D [] inputlist = new Point2D[n];
			double startx = 0.0, starty = 0.0;
			for(int i = 0; i < n; i++){
				int x = sc.nextInt();
				int y = sc.nextInt();
				inputlist[i] = new Point2D.Double(x, y);
				startx += x;
				starty += y;
			}
			startx = startx / n;
			starty = starty / n;
			
			Line2D [] lineList = new Line2D[n];
			for(int i = 0; i < n; i++){
				lineList[i] = new Line2D.Double(inputlist[i], inputlist[(i+1) % n]);
			}
			
			Point2D startP = new Point2D.Double(startx, starty);
			double mindis = calcDis(startP, lineList);
			System.out.println(mindis);
		}
	}
	
	private double calcDis(Point2D startP, Line2D [] lineList){
		double move = 0.5;
		double mindis = -1.0;
		int len = lineList.length;
		while(move > 1.0e-10){
			for(int i = 0; i < 100;i++){
				mindis = -1;
				int minind = 0;
				for(int j = 0; j < len; j++){
					double nowdis = lineList[j].ptLineDist(startP);
					if(mindis < 0)mindis = nowdis;
					if(nowdis < mindis){
						mindis = nowdis;
						minind = j;
					}
				}
				int lineind = minind;
				Point2D forwardP = calcNearPoint(lineList[lineind], startP, mindis);
				Point2D forwardVec = getV(forwardP, startP);
				double nextx = startP.getX() - forwardVec.getX() * move;
				double nexty = startP.getY() - forwardVec.getY() * move;
				startP = new Point2D.Double(nextx , nexty);
			}
			move = move / 2.0;
		}
		return mindis;
	}

	private Point2D calcNearPoint(Line2D line, Point2D p, double dis) {
		double disC = p.distance(line.getP1());
		double disB = Math.sqrt(disC * disC - dis * dis);
		double disD = line.getP1().distance(line.getP2());
		double rate = disB / disD;
		Point2D p2p1Vec = getV(line.getP2(), line.getP1());
		double x = p2p1Vec.getX() * rate + line.getP1().getX();
		double y = p2p1Vec.getY() * rate + line.getP1().getY();
		Point2D res = new Point2D.Double(x, y);
		return res;
	}

	private Point2D getV(Point2D p1, Point2D p2) {
		double x = p1.getX() - p2.getX();
		double y = p1.getY() - p2.getY();
		return new Point2D.Double(x, y);
	}

	public static void main(String[] args) {
		Main obj = new Main();
		obj.doit();
	}
}