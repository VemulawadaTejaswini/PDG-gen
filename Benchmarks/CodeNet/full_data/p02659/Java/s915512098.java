
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long a = Long.parseLong(sc.next());
		double b = Double.parseDouble(sc.next());
		b*= 100;
		long c = (long)b;
		c = a * c;
		long ans = Math.floorDiv(c, 100);
		System.out.println(ans);

	}


}
