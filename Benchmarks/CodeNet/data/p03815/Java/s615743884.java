import java.util.*;

// UVa 11504

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		long x = in.nextLong();
		long a = x / 11 * 2;
		
		if (x % 11 <= 6) {
			a += 1;
		} else {
			a += 2;
		}
		
		System.out.println(a);
	}
}