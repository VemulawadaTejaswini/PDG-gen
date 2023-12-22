import java.util.*;

//グラハムスキャン
//幾何
//凸包
class Main {

	Scanner sc = new Scanner(System.in);
	public void run() {
		while(sc.hasNext()){
			int n=sc.nextInt();
			if(n==0)break;
			P[] ps=new P[n];
			for(int i=0;i<n;i++){
				String[] str=sc.next().split(",");
				ps[i]=new P(Double.parseDouble(str[0]),Double.parseDouble(str[1]));
			}
			Arrays.sort(ps);

			int k=0;
			P[] qs =new P[2*n];
			//下側
			for(int i=0;i<n;i++){
				while(k>1 && P.cross(qs[k-1].s(qs[k-2]),ps[i].s(qs[k-1]))<=0)k--;//凸包になるまで戻す
				qs[k++]=ps[i];
			}
			//上側
			for(int i=n-2,t=k;i>=0;i--){
				while(k>t && P.cross(qs[k-1].s(qs[k-2]),ps[i].s(qs[k-1]))<=0)k--;
				qs[k++]=ps[i];
			}
			qs=Arrays.copyOf(qs,k-1);

			ln(ps.length-qs.length);
		}
	}
	public static void main(String[] args) {
		new Main().run();
	}
	public static void pr(Object o) {
		System.out.print(o);
	}
	public static void ln(Object o) {
		System.out.println(o);
	}
	public static void ln() {
		System.out.println();
	}
}

class P implements Comparable<P>{
	double x;
	double y;
	P(double _x,double _y){
		x=_x;
		y=_y;
	}
	@Override
	public int compareTo(P o) {
		if(x!=o.x){
			return (int)(x-o.x);
		}
		return (int)(y-o.y);
	}

	public static double dot(P a,P b){
			return a.x*b.x+a.y*b.y;
	}
	public static  double cross(P a,P b){
		return a.x*b.y-a.y*b.x;
	}
	public static boolean isParallel(P a1,P a2,P b1,P b2){
		return Math.abs(cross(a2.s(a1),b2.s(b1)))<Double.MIN_NORMAL;
	}
	public static boolean isVertical(P a1,P a2,P b1,P b2){
		return Math.abs(dot(a2.s(a1),b2.s(b1)))<Double.MIN_NORMAL;
	}

	public P a(P a){
		return new P(x+a.x,y+a.y);
	}
	public P s(P a){
		return new P(x-a.x,y-a.y);
	}

	public double norm(){
		return Math.sqrt(x*x+y*y);
	}

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

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof P){
			P p=(P)obj;
			return x==p.x && y==p.y;
		}
		return false;
	}
	public String toString(){
		return "("+x+","+y+")";
	}
}