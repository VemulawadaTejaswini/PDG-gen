import java.util.Scanner;
import java.lang.Math;

class Main{
	public static void main(String[] arg){
	
		
		
		
		Scanner sc = new Scanner(System.in);
		double a,b,c,co,radian,radians;
		a=sc.nextDouble();
		b=sc.nextDouble();
		co=sc.nextDouble();
		radian=Math.toRadians(co);
		radians=Math.cos(radian);
		
		c= b*b+a*a-2*b*a*radians;
		c=Math.sqrt(c);
		double p =(a+b+c)/2;
		
		double S=Math.sqrt(p*(p-a)*(p-b)*(p-c));
		double H=2*S/a;
		double L=a+b+c;
		System.out.printf("%.8f\n",S);
		System.out.printf("%.8f\n",L);
		System.out.printf("%.8f\n",H);
		
		}
}

