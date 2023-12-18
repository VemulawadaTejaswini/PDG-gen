import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		long n = sc.nextLong(), a = sc.nextLong(), b = sc.nextLong();
		
		System.out.println(n / (a + b) * a + Math.min(a, n % (a + b)));
	}

}