import java.util.Scanner;
public class Main {
	public static void main(String []args) {
		double m=Math.PI;
		double angle,pi_angle;
		Scanner sc=new Scanner(System.in);
		int length,high;
		double c;
		while(sc.hasNextInt()) {
		length=sc.nextInt();
		high=sc.nextInt();
		c=sc.nextInt();
		if(c<=length*length*high/2) {
		double h=c/length/high*2;
		pi_angle=Math.atan(h/high);
		angle=90-(pi_angle*180/m);
		System.out.println(String.format("%.10f", angle));
	}
		if(c>length*length*high/2) {
			double h=(length*high-c/length)*2/length;
			pi_angle=Math.atan(h/length);
			angle=pi_angle*180/m;
			System.out.println(String.format("%.10f", angle));
		}
		}
	}
}
