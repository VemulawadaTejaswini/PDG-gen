
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long a = Long.parseLong(sc.next());
		double b = Double.parseDouble(sc.next())*100;
		long c = (long)b;
		a = a * c;
		long temp = a % 100;
		a -= temp;
		a /= 100;
		System.out.println(a);
		
	}


}
