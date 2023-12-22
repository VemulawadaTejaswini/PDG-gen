import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int cnt=0;
		double[][] a = new double[20][2];
		while(cin.hasNext()){
			String[] s = cin.next().split(",");
			a[cnt][0]=Double.parseDouble(s[0]);
			a[cnt][1]=Double.parseDouble(s[1]);
			cnt++;
		}
		Pair[] p = new Pair[cnt];
		for(int i = 0;i<cnt;i++){
			p[i]=new Pair(a[i][0],a[i][1]);
		}
		double ans=0.0;
		for(int i = 1;i<cnt-1;i++){
			ans+=p[0].s(p[i], p[i+1]);
		}
		System.out.println(ans);
	}
}
class Pair{
	double x,y;
	Pair(double a,double b){
		x=a;y=b;
	}
	double s(Pair p,Pair q){
		Pair r = this;
		double a = dist(p,q);
		double b = dist(p,r);
		double c = dist(q,r);
		double z = (a+b+c)/2.0;
		
		return Math.sqrt(z*(z-a)*(z-b)*(z-c));
	}
	double dist(Pair p,Pair q){
		double a = (p.x-q.x)*(p.x-q.x);
		double b = (p.y-q.y)*(p.y-q.y);
		return Math.sqrt(a+b);
	}
}