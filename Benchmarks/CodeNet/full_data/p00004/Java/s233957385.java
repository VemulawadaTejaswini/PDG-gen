
import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		double a,b,c,d,e,f;
		double x[] = new double[1000];
		double y[] = new double[1000];
		int i = 0;
		while(sc.hasNext()){
			a = sc.nextDouble();
			b = sc.nextDouble();
			c = sc.nextDouble();
			d = sc.nextDouble();
			e = sc.nextDouble();
			f = sc.nextDouble();
			if(a == 0 && b != 0){
				y[i] = c/b;
				x[i] = ((f*b)-(c*e))/(d*b);
				} else if(a != 0 && b == 0){
				x[i] = c/a;
				y[i] = ((f*a)-(c*d))/(a*e);
			} else if(d == 0 && e != 0){
				y[i] = f/e;
				x[i] = ((c*e)-(b*f))/(a*e);
			} else if(d != 0 && e ==0){
				x[i] = f/d;
				y[i] = ((c*d)-(a*f))/(b*d);
			} else {
				y[i] = ((f*a)-(d*c))/((a*e)-(b*d));
				x[i] = (c-(b*y[i]))/a;
			}
			i++;
		}
		for(int j = 0; j < i; j++){
			System.out.printf("%.3f",x[j]);
			System.out.print(" ");
			System.out.printf("%.3f",y[j]);
			System.out.println();
		}
	}
}