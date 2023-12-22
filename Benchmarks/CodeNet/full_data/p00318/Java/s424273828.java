import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			int N=sc.nextInt();
			double minx=-1000000000, maxx=1000000000;
			double[] X=new double[N];
			double[] R=new double[N];
			double a=0, b=0;
			double ra=0, rb=0;
			for(int i=0; i<N; i++) {
				double x=sc.nextDouble();
				double r=sc.nextDouble();
				X[i]=x;
				R[i]=r;
				if(minx<x-r) {
					a=x;
					ra=r;
					minx=x-r;
				}
				if(x+r<maxx) {
					b=x;
					rb=r;
					maxx=x+r;
				}
			}
			double max=1000000000;
			double mid=(ra*ra-rb*rb-a*a+b*b)/(2*b-2*a);
			//System.out.println(mid);
			for(int i=0; i<N; i++) {
				max=Math.min(max, Math.sqrt(R[i]*R[i]-(X[i]-mid)*(X[i]-mid)));
			}
			System.out.println(max);
			
		}
	}
}
