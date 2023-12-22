import java.io.*;
import java.util.StringTokenizer;
import java.util.ArrayList;

class Point {
    double x,y;
    Point(double x,double y) {
	this.x = x;
	this.y = y;
    }
}

class Main {
    public static void main(String args[]) {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String buf;

	try {
	    ArrayList<Point> array = new ArrayList<Point>();
	    while ((buf = br.readLine())!=null) {
		StringTokenizer st = new StringTokenizer(buf,",");
		array.add(new Point(Double.parseDouble(st.nextToken()),Double.parseDouble(st.nextToken())));
	    }
	    double S = 0;
	    for (int i=1;i<array.size()-1;i++) {
		double a = dist(array.get(0),array.get(i));
		double b = dist(array.get(i),array.get(i+1));
		double c = dist(array.get(0),array.get(i+1));
		double z = (a+b+c)/2;
	        S += Math.sqrt(z*(z-a)*(z-b)*(z-c));
	    }
	    System.out.println(S);
	} catch (Exception e) {
	    e.printStackTrace();
	}
    }

    public static double dist(Point p1,Point p2) {
	return Math.sqrt(Math.pow(p2.x-p1.x,2)+Math.pow(p2.y-p1.y,2));
    }
}