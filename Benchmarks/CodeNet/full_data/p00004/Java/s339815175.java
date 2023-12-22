import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a,b,c,d,e,f;
		double x,y;
		
		while(sc.hasNextLine()){
			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();
			d = sc.nextInt();
			e = sc.nextInt();
			f = sc.nextInt();
			
			y = (c-((a*f)/d))/(b-((a*e)/d));
			x = (c-(b*y))/a;
			
			System.out.printf("%.3f %.3f\n", x,y);
		}
	}

}