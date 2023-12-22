import java.util.Scanner;

public class M0004 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(true) {
			if(!sc.hasNextInt()) break;
			double a = sc.nextInt();
			double b = sc.nextInt();
			double c = sc.nextInt();
			double d = sc.nextInt();
			double e = sc.nextInt();
			double f = sc.nextInt();
			
			double x = (c*e - b*f) / (a*e - b*d);
			double y = (a*f - c*d) / (a*e - b*d);

			if(Math.abs(x)<0.001) x = 0;
			if(Math.abs(y)<0.001) y = 0;
			System.out.printf("%.3f %.3f\n",x,y);
		}
	}
}