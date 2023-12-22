
/**
 * ケーキ分割
 */
import static java.lang.System.*;
import static java.lang.Math.*;
import java.util.*;

class Main {
	static class P{
		public static final double EPS=1e-10;
		double x,y;
		P(double _x,double _y){
			x=_x;
			y=_y;
		}
		public static  final P Xunit=new P(1,0);
		public static  final P Yunit=new P(0,1);
		public static  final P O=new P(0,0);

		public static double dot(P a,P b){
			return a.x*b.x+a.y*b.y;
		}
		public static  double cross(P a,P b){
			return a.x*b.y-a.y*b.x;
		}

		public P a(P a){
			return new P(x+a.x,y+a.y);
		}
		public P s(P a){
			return new P(x-a.x,y-a.y);
		}
		public P scale(double a){//原点からa倍
			return new P(x*a,y*a);
		}
		public P m(P a){//複素数積
			return new P(x*a.x-y*a.y,x*a.y+y*a.x);
		}
		public P d(P a){
			return new P(x*a.x+y*a.y,y*a.x-x*a.y).scale(1/dist2(this,O));
		}
		public static double norm(P a,P b){//a,b間の距離
			return sqrt(dist2(a,b));
		}
		public double norm(){//原点との距離
			return norm(this,O);
		}
		public double dist2(P a){//距離の二乗
			return dist2(this,a);
		}
		public static double dist2(P a,P b){//距離の二乗
			return (a.x-b.x)*(a.x-b.x)+(a.y-b.y)*(a.y-b.y);
		}

		public double arg(P o){//原点との角度
			return this.s(o).arg();
		}
		public double arg(){//原点との角度
			double s=acos(y/norm());
			return x>0?s:2*PI-s;
		}
		public P rotate(double t){
			return new P(cos(t)*this.x-sin(t)*this.y,sin(t)*this.x+cos(t)*this.y);
		}

		// --

		public static int ccw(P a,P b,P c){
			if(P.cross(b.s(a),c.s(a))>Double.MIN_NORMAL){
				return 1;
			}
			if(P.cross(b.s(a),c.s(a))<-Double.MIN_NORMAL){
				return -1;
			}
			if(P.dot(b,c)<-Double.MIN_NORMAL)return 2;
			if(b.norm()<c.norm()-Double.MIN_NORMAL)return -2;
			return 0;
		}


		public static boolean isParallel(P a1,P a2,P b1,P b2){
			return abs(cross(a2.s(a1),b2.s(b1)))<Double.MIN_NORMAL;
		}
		public static boolean isVertical(P a1,P a2,P b1,P b2){
			return abs(dot(a2.s(a1),b2.s(b1)))<Double.MIN_NORMAL;
		}

		public static double getS(List<P> plist){
			P o1=plist.get(0);
			P prev=plist.get(1);
			double S=0;
			for(P p:plist.subList(2,plist.size())){
				S+=getS(o1,prev,p);
				prev=p;
			}
			return S;
		}
		//負値が返ることもあるので注意。
		public static double getS(P o,P a,P b){
			return cross(a.s(o),b.s(o))/2;
		}

		//double
		public static boolean dEQ(double x1,double x2){
			return abs(x2-x1)<EPS;
		}
		@Override
		public boolean equals(Object obj) {
			if(obj instanceof P){
				P p=(P)obj;
				return dEQ(x,p.x) && dEQ(y,p.y);
			}
			return false;
		}
		public String toString(){
			return "("+x+","+y+")";
		}
	}

	public static Scanner sc=new Scanner(in);
	//public static Random sc=new Random();

	public static final String br=System.getProperty("line.separator");
	public static final double EPS=1e-10;


	public double getY(P p1,P p2,double x){
		return !P.dEQ(p1.x,p2.x)?((p1.y-p2.y)*x+P.cross(p1,p2))/(p1.x-p2.x):Double.NaN;
	}

	public void run() {
		while (true) {
			int W = sc.nextInt(),H=sc.nextInt(),N=sc.nextInt();
			if(W==0 && H==0 && N==0)
				break;

			P[] ps=new P[2*N+2];
			for(int i=0;i<2*N;i++){
				ps[i]=new P(sc.nextDouble(),sc.nextDouble());
			}
			ps[2*N]=new P(W,0);
			ps[2*N+1]=new P(W,H);

			//直線とy軸の接点を出す
			List<Double> ylist=new ArrayList<Double>();
			for(int i=0;i<2*N+2;i++){
				for(int j=i+1;j<2*N+2;j++){
					double py=getY(ps[i],ps[j],0);
					if(!Double.isNaN(py))
						if(0<=py && py <= H)
							ylist.add(py);
				}
			}
			ylist.add(0.0);
			ylist.add((double)H);
			Collections.sort(ylist);

			List<P> plist=Arrays.asList(ps);

			double S=0;
			for(int i=0;i<ylist.size()-1;i++){
				double ld=ylist.get(i),lu=ylist.get(i+1);
				final P lm=new P(0,(ld+lu)/2);
				//mでの幅
				Collections.sort(plist,new Comparator<P>(){
					public int compare(P o1, P o2) {
						return o1.arg(lm)>o2.arg(lm)?1:
							o1.arg(lm)<o2.arg(lm)?-1:0;
					};
				});
				double ru=getY(lm,plist.get(N),W),rd=getY(lm,plist.get(N+1),W);

				S+=(min(H,max(0,lu))-min(H,max(0,ld)))*(min(H,max(0,ru))-min(H,max(0,rd)));
			}

			ln(String.format("%.9f",S/H/W));
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}


	//output lib
	public static void pr(Object... obj){
		out.print(str(obj));
	}
	public static void ln(){
		out.println();
	}
	public static void ln(Object... obj){
		for(Object o:obj)
			pr(o);ln();
	}
	public static String str(Object obj){
		return obj.toString();
	}
	public static <E> String str(E[] obj){
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<obj.length;i++){
			sb.append(i==0?"":" ").append(str(obj[i]));
		}
		return sb.toString();
	}
	public static <E> String str(List<E> obj){
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<obj.size();i++){
			sb.append(i==0?"":" ").append(str(obj.get(i)));
		}
		return sb.toString();
	}
}