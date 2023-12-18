
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long a, b, x, count = 0;
		
		a = sc.nextLong();
		b = sc.nextLong();
		x = sc.nextLong();
		
		count = (b - a) / x + 1;
		if(a != 0 && a % x != 0)count = (b - a + 1) / x;
		if(b == a && a % x != 0)count = 0;
		
		System.out.println(count);
		
		sc.close();
	}

}
