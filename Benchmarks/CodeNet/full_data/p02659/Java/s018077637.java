
import java.util.Scanner;
import java.math.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long a = Long.parseLong(sc.next());
		long b = (long)(Double.parseDouble(sc.next())*100L);
		a *= b;
		a /= 100;
		System.out.println(a);
	}
}
