import java.awt.geom.Line2D;
import java.util.*;
public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}

	public Main() {
		int q = in.nextInt();
		for(int i=0;i<q;i++)new CGL_2B().doIt();
	}
	
	class CGL_2B{
		void doIt(){
			Line2D l1 = new Line2D.Double(in.nextDouble(),in.nextDouble(),in.nextDouble(),in.nextDouble());;
			Line2D l2 = new Line2D.Double(in.nextDouble(),in.nextDouble(),in.nextDouble(),in.nextDouble());;
			if(l1.intersectsLine(l2))System.out.println("1");
			else System.out.println("0");
		}
	}
	

}