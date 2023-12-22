import java.util.*;
import java.awt.geom.*;
import java.awt.geom.Line2D.Double;

import static java.lang.Math.*;
public class Main {
	final Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		new Main().init();
	}
	void init(){
		new AOJ1157();
	}
	
	class AOJ1157{
		AOJ1157(){
			while(sc.hasNext()){
				int n=sc.nextInt();
				if(n==0)	break;
				solve(n);
			}
		}
		void solve(int n){
			Line2D.Double l=new Line2D.Double(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());
			double ans=100000;
			for(int i=0; i<n; ++i){
				int x1=sc.nextInt(),y1=sc.nextInt(),x2=sc.nextInt(),y2=sc.nextInt(),h=sc.nextInt();
				if(x1<=l.getX1()&&l.getX1()<=x2 && x1<=l.getX2()&&l.getX2()<=x2 && y1<=l.getY1()&&l.getY1()<=y2 && y1<=l.getY2()&&l.getY2()<=y2)	ans=0;
				if(ans<=0)	continue;
				Line2D.Double[] rec=new Line2D.Double[4];
				rec[0]=new Line2D.Double(x1,y1,x2,y1);
				rec[1]=new Line2D.Double(x1,y1,x1,y2);
				rec[2]=new Line2D.Double(x2,y2,x2,y1);
				rec[3]=new Line2D.Double(x2,y2,x1,y2);
				double d = 100000;
				for(int j=0; j<4; ++j)	d=min(d,segSegDist(rec[j], l));
				ans=min(ans, (d==0? 0: (d<=h? d: ((d*d+h*h)/(2*h))) ));
//				System.out.println("d:"+d+" h:"+h+" r:"+ ((d*d+h*h)/2*h)+" ans:"+ans);
			}
			System.out.println(ans);
		}
		double segSegDist(Line2D l1,Line2D l2){
			return l1.intersectsLine(l2)? 0 :Math.min(Math.min(l1.ptSegDist(l2.getP1()), l1.ptSegDist(l2.getP2())) , Math.min(l2.ptSegDist(l1.getP1()), l2.ptSegDist(l1.getP2())));
		}
		String lineToStr(Line2D l){
			return "Line2D "+l.getP1()+"-"+l.getP2();
		}
	}
}