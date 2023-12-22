package jyp;
import java.util.*;;
class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextInt()){
		
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		double c=sc.nextDouble();
		double d=sc.nextDouble();
		double e=sc.nextDouble();
		double f=sc.nextDouble();
		double x=(c*e-b*f)/(a*e-b*d);
        double y=(c*d-a*f)/(b*d-a*e);
        if(x==0)x=0;
        if(y==0)y=0;
        System.out.printf("%.3f %.3f\n",x,y);
		}
		
		
		
	}
}