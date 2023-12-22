import java.util.*;
import java.awt.geom.*;
public class Main{
	double EPS = 1.0e-08;

	//1430 start
	//1530 stop
	//2345 restart
	//0014 cording end
	//0030 stop
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			if(n < 0) break;
			Line2D [] mirror = new Line2D[n];
			boolean [] isx = new boolean[n];
			for(int i = 0 ; i < n; i++){
				char dir = sc.next().charAt(0);
				int x = sc.nextInt();
				int y = sc.nextInt();
				Point2D p1,p2;
				switch(dir){
				case 'x':
					p1 = new Point2D.Double(x,y);
					p2 = new Point2D.Double(x + 1, y);
					mirror[i] = new Line2D.Double(p1, p2);
					isx[i] = true;
					break;
				case 'y':
					p1 = new Point2D.Double(x, y);
					p2 = new Point2D.Double(x, y + 1);
					mirror[i] = new Line2D.Double(p1,p2);
					isx[i] = false;
					break;
				}
			}

			Point2D startP = new Point2D.Double(0.75, 0.25);
			Point2D look = new Point2D.Double(1,0.5);
			Point2D v = sub(look, startP);
			v.setLocation(v.getX() * 100 + startP.getX(), v.getY() * 100 + startP.getY());
			Line2D line = new Line2D.Double(startP, v);

			boolean iswall = true;
			while(true){
				double mindis = 20;
				Point2D minpoint = null;
				int id = -1;
				for(int i = 0; i < n; i++){
					if(line.intersectsLine(mirror[i])){
						Point2D ip = intersectPtSS(line, mirror[i]);
						double nowdis = line.getP1().distance(ip);
						//System.out.print("nowdis = "+ nowdis + "ind = " + i);
						//System.out.println(" mirror = " + mirror[i].getP1() + " p2 = " + mirror[i].getP2());
						if(nowdis > EPS && (minpoint == null || mindis > nowdis)){
							minpoint = ip;
							id = i;
							mindis = line.getP1().distance(ip);
						}
					}
				}
				//スタート地点の比較をする
				if(line.ptSegDist(startP) < EPS){
					double tempdis = line.getP1().distance(startP);
					if(tempdis > EPS && mindis > tempdis){
						mindis = tempdis;
						minpoint = null;
						iswall = false;
						break;
					}
				}

				if(minpoint == null){
					break;
				}

				//反射のベクトルを求める
				line = nextLine(line, minpoint, isx[id] );
				//System.out.println("line = " + line.getP1() + " p2 = " + line.getP2());
			}

			//出力
			if(iswall){
				Point2D [] rec = new Point2D[4];
				rec[0] = new Point2D.Double(0, 0);
				rec[1] = new Point2D.Double(8, 0);
				rec[2] = new Point2D.Double(8, 8);
				rec[3] = new Point2D.Double(0, 8);
				for(int i = 0; i < 4; i++){
					Line2D now = new Line2D.Double(rec[i], rec[(i+1)%4]);
					if(line.intersectsLine(now) ){
						Point2D res = intersectPtSS(line, now);
						if(res.distance(line.getP1()) < EPS) continue;
						int resx = (int)(res.getX() * 100);
						int resy = (int)(res.getY() * 100);
						//debug
						//System.out.println("i = " + i + " " + line.getP1() + " " + line.getP2());

						System.out.println(resx+ " " + resy);
						//break;
					}
				}
			}
			else{
				System.out.println("75 25");
			}
		}
	}

	private Line2D nextLine(Line2D l, Point2D p, boolean isx) {
		Point2D v = sub(l.getP2(), l.getP1());
		//System.out.println("v= " + v);
		if(! isx){
			v.setLocation(-1 * v.getX(), v.getY());
		}
		else {
			v.setLocation(v.getX(), -1 *  v.getY());
		}
		//System.out.println("v= " + v);
		Point2D nextP = new Point2D.Double(v.getX() + p.getX(), v.getY() + p.getY());
		//System.out.println("nextp = " + nextP);
		return new Line2D.Double(p, nextP);
	}

	private Point2D intersectPtSS(Line2D l, Line2D m) {
		Point2D lv = sub(l.getP2(), l.getP1());
		Point2D mv = sub(m.getP2(), m.getP1());
		Point2D m1l1v = sub(m.getP1(), l.getP1());
		double a = cross(m1l1v, lv);
		double b = cross(lv, mv);
		if(Math.abs(a) < EPS && Math.abs(b) < EPS){
			return l.getP1();
		}
		double t = a / b;
		double x = m.getX1() + t * mv.getX();
		double y = m.getY1() + t * mv.getY();
		return new Point2D.Double(x,y);
	}

	private double cross(Point2D p1, Point2D p2) {
		double res = p1.getX() * p2.getY() - p1.getY() * p2.getX();
		return res;
	}

	private Point2D sub(Point2D p1, Point2D p2) {
		double x = p1.getX() - p2.getX();
		double y = p1.getY() - p2.getY();
		return new Point2D.Double(x,y);
	}

	public static void main(String [] args){
		new Main().doit();
	}
}