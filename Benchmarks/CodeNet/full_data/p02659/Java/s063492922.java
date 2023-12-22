
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long a = Long.parseLong(sc.next());
		double b = Double.parseDouble(sc.next());
		
		long c =(long)(b*100);
		c = a * c;
		
		c /= 100;
		System.out.println(c);

	}


}
