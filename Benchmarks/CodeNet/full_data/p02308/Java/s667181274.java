import java.util.*;
public class Main{
	public static void cross_cl(Circle c, Line l){
		if(l.x1 == l.x2){
			double ans1 = (double)c.y - Math.sqrt(Math.pow((double)c.r,2)-Math.pow((double)(l.x1-c.x),2));
			double ans2 = (double)c.y + Math.sqrt(Math.pow((double)c.r,2)-Math.pow((double)(l.x1-c.x),2));
			System.out.printf("%.8f %.8f %.8f %.8f\n",(double)l.x1,ans1,(double)l.x1,ans2);
		}
		else if(l.y1 == l.y2){
			double ans1 = (double)c.x - Math.sqrt(Math.pow((double)c.r,2)-Math.pow((double)(l.y1-c.y),2));
			double ans2 = (double)c.x + Math.sqrt(Math.pow((double)c.r,2)-Math.pow((double)(l.y1-c.y),2));
			System.out.printf("%.8f %.8f %.8f %.8f\n",ans1,(double)l.y1,ans2,(double)l.y1);
		}
		else{
			double a = (double)(l.y2 - l.y1) / (l.x2 - l.x1);
			double ans1 = 1.0 + Math.pow(a,2);
			double ans2 = (double)c.x + a * a * l.x1 + a * c.y - a * l.y1;
			double ans3 = (double)(c.x * c.x) + Math.pow(a* l.x1 + (double)(c.y - l.y1),2) - (double)(c.r * c.r);
			double ansx1 = (ans2 - Math.sqrt(Math.pow(ans2,2)- ans1 * ans3))/ans1;
			double ansx2 = (ans2 + Math.sqrt(Math.pow(ans2,2)- ans1 * ans3))/ans1;
			double ansy1 = (ansx1 - (double)l.x1) * a + (double)l.y1;
			double ansy2 = (ansx2 - (double)l.x1) * a + (double)l.y1;
			System.out.printf("%.8f %.8f %.8f %.8f\n",ansx1,ansy1,ansx2,ansy2);
		}
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Circle c = new Circle(sc.nextLong(),sc.nextLong(),sc.nextLong());
		int q = sc.nextInt();
		for(int i = 0 ; i < q ; i++){
			Line l = new Line(sc.nextLong(),sc.nextLong(),sc.nextLong(),sc.nextLong());
			cross_cl(c,l);
		}
	}
}
class Circle{
	long x;
	long y;
	long r;
	Circle(long x, long y, long r){
		this.x = x;
		this.y = y;
		this.r = r;
	}
}
class Line{
	long x1;
	long y1;
	long x2;
	long y2;
	Line(long x1, long y1, long x2, long y2){
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}
}
