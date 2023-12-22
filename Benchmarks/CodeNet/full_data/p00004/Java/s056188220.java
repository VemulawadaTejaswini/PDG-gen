import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b,c,d,e,f;
		double x,y;
		while(sc.hasNext()){
			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();
			d = sc.nextInt();
			e = sc.nextInt();
			f = sc.nextInt();
			x = (c*e - b*f)/(double)(a*e - b*d);
			y = (c*d - a*f)/(double)(b*d - a*e);
			if(x == -0) x = 0;
			if(y == -0) y = 0;
			System.out.printf("%.3f %.3f/n",x,y);
		}
	}
}