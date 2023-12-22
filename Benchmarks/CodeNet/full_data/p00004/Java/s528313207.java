import java.util.Scanner;


public class SimultaneousEquation {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()){
			double a = sc.nextInt();
			double b = sc.nextInt();
			double c = sc.nextInt();
			double d = sc.nextInt();
			double e = sc.nextInt();
			double f = sc.nextInt();
			double x, y;
			x = c/a + (-1)*(b/a);
			y = f/e + (-1)*d*x;
			x = (-1*b*y + c)/a;
			x = (int)(x*1000 + 0.5) / (double)1000;
			y = (int)(y*1000 + 0.5) / (double)1000;
			System.out.printf("\f \f",x ,y);
		}
	}
}