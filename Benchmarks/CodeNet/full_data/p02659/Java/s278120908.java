
import java.util.Scanner;
import java.math.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long a = Long.parseLong(sc.next());
		double b = Double.parseDouble(sc.next());
		
		b *= (double)100;
		long c = (long)b;
		a *= c;
		a /= 100;
		System.out.println(a);
		
		
	}
}
