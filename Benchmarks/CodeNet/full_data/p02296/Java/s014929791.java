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
		double segSegDist(Line2D l1,Line2D l2){
			return l1.intersectsLine(l2)? 0 :Math.min(Math.min(l1.ptSegDist(l2.getP1()), l1.ptSegDist
					(l2.getP2())) , Math.min(l2.ptSegDist(l1.getP1()), l2.ptSegDist(l1.getP2())));
		}
		void doIt(){
			Line2D l1 = new Line2D.Double(in.nextDouble(),in.nextDouble(),in.nextDouble(),in.nextDouble());;
			Line2D l2 = new Line2D.Double(in.nextDouble(),in.nextDouble(),in.nextDouble(),in.nextDouble());;
			System.out.printf("%.10f\n",segSegDist(l1, l2));
		}
	}


}