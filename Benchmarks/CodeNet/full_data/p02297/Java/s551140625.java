import java.util.*;
public class Main{
    public static double area(Point p1, Point p2){
    	return (p1.x*p2.y - p1.y*p2.x)/2.0;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Point[] p = new Point[n];
	for(int i = 0 ; i < n ; i++)
		p[i] = new Point(sc.nextDouble(),sc.nextDouble());
        double ans = 0;
	for(int i = 0 ; i < n-1 ; i++)
		ans += area(p[i],p[i+1]);
	System.out.printf("%.1f\n",ans+area(p[n-1],p[0]));
    }
}
class Point{
    double x;
    double y;
    Point(double x, double y){
        this.x = x;
        this.y = y;
    }
}
