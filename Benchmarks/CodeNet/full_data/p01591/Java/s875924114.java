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
			a += x*x + y*y;
			b += x;
			c += y;
		}
		
		double d = (double)(a+b+c)/n;
		System.out.print("1.000 1.000 -");
		System.out.printf("%.3f\n", d);
	}	
}