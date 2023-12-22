import java.util.Scanner;
import java.lang.Math;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Vector v = new Vector();
		for(int i = 0 ; i < n ; i ++){
			v.x[i]=sc.nextDouble();
		}
		for(int i = 0 ; i < n ; i ++){
			v.y[i]=sc.nextDouble();
		}
		v.p1(n);
		v.p2(n);
		v.p3(n);
		v.pInfinit(n);
	}
}
class Vector{
	public double[] x = new double[100];
	public double[] y = new double[100];
	private double ans = 0;
	void p1(int n){
		for(int i = 0 ; i < n ; i ++){
			ans+=Math.abs(x[i]-y[i]);
		}
		System.out.println(ans);
		ans=0;
	}
	void p2(int n){
		for(int i = 0; i < n ; i ++){
			ans+=Math.pow((x[i]-y[i]), 2);
		}
		System.out.println(Math.sqrt(ans));
		ans=0;
	}
	void p3(int n){
		double q=0;
		for(int i = 0; i < n ; i ++){
			q = Math.abs(x[i]-y[i]);
			ans+=Math.pow(q, 3);
		}
		System.out.println(Math.cbrt(ans));
		ans=0;
	}
	void pInfinit(int n){
		double max = 0;
		for(int i = 0 ; i < n ; i ++){
			if(max<Math.abs(x[i]-y[i]))
				max=Math.abs(x[i]-y[i]);
		}
	System.out.println(max);
	}
}