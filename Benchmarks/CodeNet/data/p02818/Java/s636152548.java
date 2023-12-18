import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		String s1 = sc.next(), s2 = sc.next();
//		System.out.println(s2 + s1);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long k = sc.nextLong();
		if (a - k < 0) {
			System.out.println(0 + " " + (b + a - k));
		} else {
			System.out.println((a - k) + " " + b);
		}
		
		sc.close();
	}

}
