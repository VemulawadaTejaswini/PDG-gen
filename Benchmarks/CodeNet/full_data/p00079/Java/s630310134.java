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
	    quicksort(0,array.size()-1,array);
	    sorty(array.size(),array);
	    double S = 0;
	    for (int i=0;i<array.size()-2;i++) {
		double a = dist(array.get(i),array.get(i+1));
		double b = dist(array.get(i+1),array.get(i+2));
		double c = dist(array.get(i),array.get(i+2));
		double z = (a+b+c)/2;
	        S += Math.sqrt(z*(z-a)*(z-b)*(z-c));
	    }
	    System.out.println((double)Math.round(S*1000000)/1000000);
	} catch (Exception e) {
	    e.printStackTrace();
	}
    }

    public static double dist(Point p1,Point p2) {
	return Math.sqrt(Math.pow(p2.x-p1.x,2)+Math.pow(p2.y-p1.y,2));
    }

    public static void quicksort(int low,int high,ArrayList<Point> a) {
       	if (high>low) {
       	     int mid = (low+high)/2;
       	     double x = a.get(mid).x;
       	     int i = low;
       	     int j = high;
       	     while (a.get(i).x<x) i++;
       	     while (a.get(j).x>x) j--;
       	     if (i<=j) {
		 Point t = a.get(i);
		 a.set(i,a.get(j));
		 a.set(j,t);
		 i++;j--;
	     }
	     quicksort(low,j,a);
	     quicksort(i,high,a);
       	}
    }

    public static void sorty(int n,ArrayList<Point> a) {
	for (int i=1;i<n;i++) {
	    int j = i-1;
	    while (a.get(j).x==a.get(j+1).x&&a.get(j).y>a.get(j+1).y) {
		Point t = a.get(j+1);
		a.set(j+1,a.get(j));
		a.set(j,t);
		j--;
		if (j<0) break;
	    }
	}
    }
}