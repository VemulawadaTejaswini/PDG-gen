
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long a = Long.parseLong(sc.next());
		double b = Double.parseDouble(sc.next())*100;
		a *= b;
		System.out.println(a/100);
		
	}


}
