
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long a = Long.parseLong(sc.next());
		double b = Double.parseDouble(sc.next());
		long c = (long)b;
		c *= 100L;
		a = a * c;
		long temp = a % 100L;
		a -= temp;
		a /= 100L;
		System.out.println(a);
		
	}


}
