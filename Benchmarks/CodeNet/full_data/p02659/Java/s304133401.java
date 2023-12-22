
import java.util.Scanner;
import java.math.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long a = Long.parseLong(sc.next());
		double b = Double.parseDouble(sc.next());
		
		long c = (long)(a *(b*100))/100;
		System.out.println(c);
	}
}
