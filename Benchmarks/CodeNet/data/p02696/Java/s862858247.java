
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = Integer.parseInt(sc.next());
		long b = Long.parseLong(sc.next());
		long n = Long.parseLong(sc.next());
		
		long x = Math.min(b-1, n);
		
		long ans = (long)(x * a)/b;
		System.out.println(ans);
	}

}
