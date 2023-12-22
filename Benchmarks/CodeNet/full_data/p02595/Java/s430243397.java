import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int d = sc.nextInt();
		int count = 0;
		for (int i = 0; i < n; i++) {
		    if (dist(sc.nextInt(), sc.nextInt()) <= d) {
		        count++;
		    }
		}
		System.out.println(count);
	}
	
	static double dist(double x, double y) {
	    return Math.sqrt(x * x + y * y);
	}
}
