
import java.util.Scanner;
public class Main {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		//try(Scanner sc = new Scanner(System.in)) {
			int t = sc.nextInt();
			double max = 0;
			for(int i=0; i<t; ++i) {
				max = Math.max(max, cal());
			}
			System.out.println(max > cal()+0.0000001 ? "YES":"NO");
		//}
	}
	
	static double cal() {
		int n = sc.nextInt();
		int m = sc.nextInt();
		double hope = 0;
		double rr = 0;
		for(int i=0; i<m; ++i) {
			int v = sc.nextInt();
			double r = sc.nextDouble();
			hope += v*r;
			rr += r;
		}
		return hope/rr;
		
	}
}




