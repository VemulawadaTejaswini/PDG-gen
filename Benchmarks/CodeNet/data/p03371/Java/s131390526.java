import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
		long x = sc.nextLong();
		long y = sc.nextLong();
		sc.close();
		if(c*2*Math.max(x, y) < a*x+b*y) {
			System.out.println(c*2*Math.max(x, y));
		}
		else if(c*2*Math.min(x, y) < (a+b)*Math.min(x,y)) {
			if(x>y) {
				System.out.println(a*(x-y)+c*2*Math.min(x, y));
			}
			else {
				System.out.println(b*(y-x/2)+c*2*Math.min(x, y));
			}
		}
		else {
			System.out.println(a*x+b*y);
		}
	}
}