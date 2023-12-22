import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int a = 0;
		int b = 0;
		int c = 0;
		int x, y;
		for(int i=0;i<n;i++){
			x = sc.nextInt();
			y = sc.nextInt();
			a += x;
			b += y;
			c += x*x + y*y;
		}
		
		double d = (double)(b+c)/(-a);
		System.out.printf("%.3f", d);
		System.out.println(" 1.000 0.000");
	}	
}