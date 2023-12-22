import java.util.*;
public class Main{
	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0;i<n;i++){
			double x1=sc.nextDouble();
			double y1=sc.nextDouble();
			double x2=sc.nextDouble();
			double y2=sc.nextDouble();
			double x3=sc.nextDouble();
			double y3=sc.nextDouble();
			//r^2=(x-a)^2+(y-b)^2
			double a1=2*(x2-x1);
			double b1=2*(y2-y1);
			double c1=Math.pow(x1, 2)-Math.pow(x2, 2)+
					Math.pow(y1, 2)-Math.pow(y2, 2);
			double c2=Math.pow(x1, 2)-Math.pow(x3, 2)+
					Math.pow(y1, 2)-Math.pow(y3, 2);
			double a2=2*(x3-x1);
			double b2=2*(y3-y1);
			
			double x=(b1*c2-b2*c1)/(a1*b2-a2*b1);
			double y=(c1*a2-c2*a1)/(a1*b2-a2*b1);
			double r=Math.sqrt(Math.pow((x1-x),2)+Math.pow((y1-x),2));
			System.out.printf("%.3f %.3f %.3f\n",x ,y, r);
		}
	}
}