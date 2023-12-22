import java.util.*;

class Main {
	Scanner sc = new Scanner(System.in);

	public void run() {
		sc.useDelimiter("[, \r\n]+");
		while(true){
			int n=sc.nextInt();
			if(n==0)break;
			P[] plist=new P[n];
			for(int i=0;i<n;i++){
				plist[i]=new P(sc.nextDouble(),sc.nextDouble());
			}
			HashSet<HashSet<P>> sets=new HashSet<HashSet<P>>();

			for(P o:plist){
				boolean isIn=false;
				for(HashSet<P> set:sets){
					boolean ok=true;
					for(P p:set){
						if(P.dist(o,p)>2*2){
							ok=false;
							break;
						}
					}
					if(ok){
						isIn=true;
						set.add(o);
					}
				}
				if(!isIn){
				HashSet<P> singleton=new HashSet<P>();
				singleton.add(o);
				sets.add(singleton);

				}
			}

			int max=0;
			for(HashSet<P> set:sets){
				max=Math.max(set.size(),max);
			}
			ln(max);
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

class P {
	double x;
	double y;
	P(double _x,double _y){
		x=_x;
		y=_y;
	}

	public static  final P Xunit=new P(1,0);
	public static  final P Yunit=new P(0,1);

	public static double dist(P a,P b){
		return (a.x-b.x)*(a.x-b.x)+(a.y-b.y)*(a.y-b.y);
	}
	public String toString(){
		return "("+x+","+y+")";
	}
}