import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long a = sc.nextInt();
		long b = sc.nextInt();
		long c = sc.nextInt();
		long k = sc.nextInt();
		
		long result;
		if( k%2 == 0) {
			result = a-b;
		} else {
			result = b-a;
		}
		
		System.out.println(result);
		
	}
	
}
