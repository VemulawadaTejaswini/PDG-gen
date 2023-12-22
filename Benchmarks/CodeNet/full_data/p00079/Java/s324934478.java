
import java.awt.geom.Point2D;
import java.util.*;
 
public class Main {
    Scanner sc = new Scanner(System.in);
 
    public static void main(String[] args) {
        new Main(); 
    }
 
    public Main() {
    	new aoj0059().doIt();
    }
    class aoj0059{
    	void doIt(){
    		ArrayList<Point2D> p = new ArrayList<Point2D>();
    		while(sc.hasNext()){
    			String[] str = sc.next().split(",");
    			p.add(new Point2D.Double(Double.parseDouble(str[0]),Double.parseDouble(str[1])));
    		}
    		System.out.println(area(p));
    	}
    	double area(ArrayList<Point2D> polygon) {
    		double res = 0.0;
    		int n = polygon.size();
    		for(int i = 0; i < n; i++){
    			Point2D from = polygon.get(i), to = polygon.get((i+1) % n); 
    	        res += cross(from, to);
    	    }
    	    return Math.abs(res) / 2.0;
    	}
    	double cross(Point2D p1, Point2D p2){
    		double res = p1.getX() * p2.getY() - p1.getY() * p2.getX();
    		return res;
    	}
    }
}