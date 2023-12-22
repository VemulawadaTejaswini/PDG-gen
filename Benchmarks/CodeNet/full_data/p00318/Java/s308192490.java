import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			int N=sc.nextInt();
			double minx=-1000000000, maxx=1000000000;
			double[] X=new double[N];
			double[] R=new double[N];
			for(int i=0; i<N; i++) {
				double x=sc.nextDouble();
				double r=sc.nextDouble();
				X[i]=x;
				R[i]=r;
				if(minx<x-r) {
					minx=x-r;
				}
				if(x+r<maxx) {
					maxx=x+r;
				}
			}
			double max=1000000000;
			double mid=(minx+maxx)/2.0;
			for(int i=0; i<N; i++) {
				max=Math.min(max, Math.sqrt(R[i]*R[i]-(X[i]-mid)*(X[i]-mid)));
			}
			System.out.println(max);
			
		}
	}
}
