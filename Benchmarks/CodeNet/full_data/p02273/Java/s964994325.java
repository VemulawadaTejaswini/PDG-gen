import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		//????????????????????????
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		
		//?????????
		int n = Integer.parseInt(bf.readLine());
		Point p1= new Point(0,0);
		Point p2= new Point(100,0);
		System.out.println(p1.x + " "+p1.y);
		koch(n,p1,p2);
		System.out.println(p2.x + " "+p2.y);
	}
	
	public static boolean koch(int depth,Point p1,Point p2){
		if(depth==0){
			return true;
		}
		Point s = new Point((p1.x*2+p2.x)/3,(p1.y*2+p2.y)/3);
		Point t = new Point((p1.x+p2.x*2)/3,(p1.y+p2.y*2)/3);
		Point u = new Point((t.x-s.x)*Math.cos(Math.toRadians(60))-(t.y-s.y)*Math.sin(Math.toRadians(60))+s.x,(t.x-s.x)*Math.sin(Math.toRadians(60))+(t.y-s.y)*Math.cos(Math.toRadians(60))+s.y);
		koch(depth-1,p1,s);
		System.out.println(s.x+" "+s.y);
		koch(depth-1,s,u);
		System.out.println(u.x+" "+u.y);
		koch(depth-1,u,t);
		System.out.println(t.x+" "+t.y);
		koch(depth-1,t,p2);
		return true;
	}
	
}
class Point{
	double x;
	double y;
	
	public Point(double x,double y){
		this.x = x;
		this.y =y ;
	}
}