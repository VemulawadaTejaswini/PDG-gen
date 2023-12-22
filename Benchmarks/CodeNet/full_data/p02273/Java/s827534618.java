import java.util.*;

class Point{
	
	public final double x;
	public final double y;

	Point(double x,double y){
		this.x = x;
		this.y = y;
	}
}

public class Main {

    public static void main(String[] args) {
        
    	//input
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        Point S = new Point(0,0);
        Point E = new Point(100,0);
        
        //calculate
        ArrayList<Point> result = makeKochCurve(S,E,N);

        for (Point p:result){
			System.out.printf("%3.8f %3.8f \n",p.x,p.y);
		}
    }
    
    private static ArrayList<Point> makeKochCurve(Point p1,Point p2,int n){
    	ArrayList<Point> K = new ArrayList<Point>();

    	if(n == 0){
    		K.add(p1);
    		K.add(p2);
    		return K;
    	}

    	Point s = new Point((p1.x*2+p2.x)/3,(p1.y*2+p2.y)/3);
    	Point u = null;
    	if (p1.y == p2.y){
    		u = new Point((p1.x+p2.x)/2,(p2.x-p1.x)/2*Math.tan(Math.toRadians(30)));
    	} else if ((p2.x-p1.x>0 && p2.y-p1.y>0) || (p2.x-p1.x<0 && p2.y-p1.y<0)){
    		u = new Point(p1.x,(p1.y+p2.y*2)/3);
    	} else if ((p2.x-p1.x<0 && p2.y-p1.y>0) || (p2.x-p1.x>0 && p2.y-p1.y<0)){
    		u = new Point(p2.x,(p1.y*2+p2.y)/3);
    	}
    	Point t = new Point((p1.x+p2.x*2)/3,(p1.y+p2.y*2)/3);

    	ArrayList<Point> a = makeKochCurve(p1,s,n-1);
    	ArrayList<Point> b = makeKochCurve(s,u,n-1);
    	ArrayList<Point> c = makeKochCurve(u,t,n-1);
    	ArrayList<Point> d = makeKochCurve(t,p2,n-1);

    	K.addAll(con(con(a,b),con(c,d)));
    	return K;
    }

    private static ArrayList<Point> con(ArrayList<Point> a,ArrayList<Point> b){
    	b.remove(0);
    	a.addAll(b);
    	return a;
    }
}