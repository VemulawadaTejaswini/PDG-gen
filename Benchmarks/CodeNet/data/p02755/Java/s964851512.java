
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
		
		int ans = 0;
	
		double c = 12.5 * a;
		double d = 10 * b;
		double max = Math.max(d, c);
		if(c == d) {
			System.out.println((int)d);
		}
		
		else if (Math.abs(Math.floorDiv((int) c, 10) - Math.floorDiv((int) d, 10)) < 1) {
			System.out.println((int)max);
		}
		
		else {
			System.out.println(-1);
		}
		
	}

}
