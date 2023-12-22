import java.util.Scanner;
import java.awt.*;

public class Main{
	Main(){
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			double xa1 = sc.nextDouble();
			double ya1 = sc.nextDouble();
			double xa2 = sc.nextDouble();
			double ya2 = sc.nextDouble();
			double xb1 = sc.nextDouble();
			double yb1 = sc.nextDouble();
			double xb2 = sc.nextDouble();
			double yb2 = sc.nextDouble();
			Point pa = new Point();
			pa.setLocation(xa1, ya2);
			Point pb = new Point();
			pb.setLocation(xb1, yb2);
			Dimension da = new Dimension();
			da.setSize(xa2-xa1, ya2-ya1);
			Dimension db = new Dimension();
			db.setSize(xb2-xb1, yb2-yb1);
			Rectangle ra = new Rectangle(pa, da);
			Rectangle rb = new Rectangle(pb, db);
			if(ra.intersects(rb)){
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}
	
	public static void main(String[] args){
		new Main();
	}
}