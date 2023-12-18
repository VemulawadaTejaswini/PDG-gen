import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double xa = sc.nextDouble();
		double ya = sc.nextDouble();
		double xb = sc.nextDouble();
		double yb = sc.nextDouble();
		double xc = sc.nextDouble();
		double yc = sc.nextDouble();

		double a = Math.sqrt((xc-xb)*(xc-xb)+(yc-yb)*(yc-yb));
		double b = Math.sqrt((xa-xc)*(xa-xc)+(ya-yc)*(ya-yc));
		double c = Math.sqrt((xb-xa)*(xb-xa)+(yb-ya)*(yb-ya));

		double cosa = (b*b+c*c-a*a)/(2*b*c);
		double cosb = (c*c+a*a-b*b)/(2*c*a);
		double cosc = (a*a+b*b-c*c)/(2*a*b);

		double ra = a/(Math.sqrt((1+cosb)/(1-cosb))+Math.sqrt((1+cosc)/(1-cosc))+2);
		double rb = b/(Math.sqrt((1+cosc)/(1-cosc))+Math.sqrt((1+cosa)/(1-cosa))+2);
		double rc = c/(Math.sqrt((1+cosa)/(1-cosa))+Math.sqrt((1+cosb)/(1-cosb))+2);

		System.out.println(Math.max(ra,Math.max(rb, rc)));
	}

}
