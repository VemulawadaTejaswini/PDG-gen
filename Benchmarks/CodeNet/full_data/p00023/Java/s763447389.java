import java.util.*;
import java.awt.geom.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			int n = sc.nextInt();
			double xa, ya, ra, xb, yb, rb, d; 
			for(int i=0;i<n;i++){
				xa = sc.nextDouble();
				ya = sc.nextDouble();
				ra = sc.nextDouble();
				xb = sc.nextDouble();
				yb = sc.nextDouble();
				rb = sc.nextDouble();
				d = Point2D.distance(xa, ya, xb, yb);

				if(ra+rb<d) System.out.println("0");
				else if(ra>rb && ra-rb>d) System.out.println("2");
				else if(rb>ra && rb-ra>d) System.out.println("-2"); 
				else System.out.println("1");
			}

		}
	}	
}