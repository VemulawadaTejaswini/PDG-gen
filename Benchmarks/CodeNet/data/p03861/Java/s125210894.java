
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long a = Long.parseLong(sc.next());
		long b = Long.parseLong(sc.next());
		long x = Long.parseLong(sc.next());
		
		long c = a/x;
		long d = b/x;
		
		if(a % x != 0 && b % x != 0) {
			System.out.println(d - c);
		}
		else{
			System.out.println(d - c + 1);
		}
	}
}
