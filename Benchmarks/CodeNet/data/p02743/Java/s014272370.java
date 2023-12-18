import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long a = Long.parseLong(sc.next());
		long b = Long.parseLong(sc.next());
		long c = Long.parseLong(sc.next());
				
		long d = c - a  - b;
		long e = 4L* a * b;
		
		long f = (long)d*d;
		if(f > e && d > 0) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		
	}
}
