import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long a = sc.nextLong();
		long b = sc.nextLong();
		long n = sc.nextLong();
		long max = 0;
		long floor = 0;


		for (long i = 1;i<=n ;i++ ) {
			floor = ((a*i)/b)-(a*(i/b));
			max = Math.max(max,floor);
		}
		System.out.println(max);


	}
}
