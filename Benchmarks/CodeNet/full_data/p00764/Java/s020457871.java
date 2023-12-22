import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.util.*;
public class Main {
    Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
    	new Main();
    }
    
    public Main() {
    	new AOJ1183().doIt();
    }
    
    class AOJ1183{
    	Line2D ls[];
    	int n;
    	Circle circle[];
    	double[][] cost;
    	double INF = Double.MAX_VALUE/2;
    	Point2D p[];
    	void solve(){
    		int m = (n-1)*2+2;
    		p = new Point2D[m];
    		p[0] = circle[0].p;
    		p[m-1] = circle[n-1].p;
    		for(int i=0;i<n-1;i++){
    			Point2D kp[] = intersectPtCC(circle[i], circle[i+1]);
    			p[i*2+1] = kp[0];
    			p[i*2+2] = kp[1];
    		}
//    		for(int i=0;i<m;i++)System.out.println(p[i]);
    		ls = new Line2D[n];
    		for(int i=1;i<n;i++){
    			Line2D l = new Line2D.Double(p[(i-1)*2+1],p[(i-1)*2+2]);
//    			System.out.println(l.getP1()+"-----"+l.getP2());
    			ls[i] = l;
    		}
    		cost = new double[(n-1)*2+2][(n-1)*2+2];
    		for(int i=0;i<(n-1)*2+2;i++)Arrays.fill(cost[i], INF); 
    		for(int i=0;i<m;i++){
    			for(int s=i+1;s<m;s++)if(s!=i){
    				Line2D l = new Line2D.Double(p[i],p[s]);
    				int start = (1+i)/2;
    				int end = (1+s)/2;
    				if(i==0)start = 1;
    				if(s==m-1)end = ls.length-1;
//    				System.out.println("start = "+ start + " goal = "+end + " point= "+p[i]+"-----"+p[s]);
    				if(isOkay(l, start, end))cost[i][s] = cost[s][i] = p[i].distance(p[s]);
    			}
    		}
//    		for(int i=0;i<m;i++){
//    			for(int s=0;s<m;s++)System.out.print(cost[i][s]+" ");
//    			System.out.println();
//    		}
    		for(int k=0;k<m;k++)for(int i=0;i<m;i++)for(int j=0;j<m;j++){
    			cost[i][j] = Math.min(cost[i][j], cost[i][k]+cost[k][j]);
    		}
    		System.out.printf("%.5f\n",cost[0][m-1]);
    	}
    	
    	boolean isOkay(Line2D a,int start,int goal){
    		for(int i=start;i<=goal;i++){
//    			System.out.println(ls[i].getP1()+"---"+ls[i].getP2()+" "+a.getP1()+"-----"+a.getP2());
    			if(a.intersectsLine(ls[i])==false){
    				return false;
    			}
    		}
    		return true;
    	}
    	
    	void doIt(){
    		while(in.hasNext()){
    			n = in.nextInt();
    			if(n==0)break;
    			circle = new Circle[n];
    			for(int i=0;i<n;i++)circle[i] = new Circle(in.nextDouble(), in.nextDouble(), in.nextDouble());
    			solve();
    		}
    	}
    }
    
    class Circle{
    	Point2D p;
    	double r;
    	public Circle(double x,double y,double r) {
    		this.p = new Point2D.Double(x, y);
    		this.r = r;
    	}
    }
    
    double EPS = 1.0e-8;
    
    double cross(Point2D p1,Point2D p2){
    	return p1.getX()*p2.getY()-p1.getY()*p2.getX();
    }
    
    Point2D diff(Point2D p1,Point2D p2){
    	return new Point2D.Double(p1.getX()-p2.getX(),p1.getY()-p2.getY());
    }
    
    Point2D sub(Point2D p1,Point2D p2){
    	return new Point2D.Double(p1.getX()-p2.getX(),p1.getY()-p2.getY());
    }
    
    Point2D mul(double n,Point2D p1){
    	return new Point2D.Double(p1.getX()*n,p1.getY()*n);
    }
    
    Point2D add(Point2D p1,Point2D p2){
    	return new Point2D.Double(p1.getX()+p2.getX(),p1.getY()+p2.getY());
    }
    
    Point2D normalVector1(Point2D p){
    	return new Point2D.Double(-p.getY(),p.getX());
    }
    Point2D normalVector2(Point2D p){
    	return new Point2D.Double(p.getY(),-p.getX());
    }
    
    Point2D[] intersectPtCC(Circle a,Circle b){
    	double dis = a.p.distance(b.p);
    	if(dis>a.r+b.r)return null;
    	Point2D v = sub(b.p,a.p);
    	double rc = (dis*dis+a.r*a.r-b.r*b.r)/(2*dis);
    	double rate = rc/dis;
    	v = mul(rate,v);
    	Point2D c = add(v,a.p);
    	double disC2c = c.distance(b.p);
    	double disqc = Math.sqrt(b.r*b.r - disC2c*disC2c);
    	Point2D v2 = sub(b.p,c);
    	v2 = mul(disqc/disC2c,v2);
    	Point2D[] ret = new Point2D.Double[2];
    	ret[0] = add(normalVector1(v2),c);
    	ret[1] = add(normalVector2(v2),c);
    	return ret;
    }
    
    boolean intersectLL(Line2D l1,Line2D l2){
    	return intersectLL(l1.getP1(), l1.getP2(),l2.getP1(),l2.getP2());
    }
    
    boolean intersectLL(Point2D a1,Point2D a2,Point2D b1,Point2D b2){
    	return (Math.abs(cross(diff(a2,a1),diff(b2,b1)))>EPS) || (Math.abs(cross(diff(a2,a1),diff(a1,b1)))<EPS);
    }
    
}