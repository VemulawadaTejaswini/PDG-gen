
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
		int c = Integer.parseInt(sc.next());
		
		long d = c - a  - b;
		long e = a * b;
		
		long f = (long)Math.pow(d, 2);
		
		if(f > e) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		
	}
}
