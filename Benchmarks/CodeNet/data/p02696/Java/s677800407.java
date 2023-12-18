import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long a = sc.nextLong();
		long b = sc.nextLong();
		long n = sc.nextLong();
		long max = 0;
		long floor = 0;
		long count = 0;


		for (long i = n;i>=Math.sqrt(n) ;i-- ) {
			floor = ((a*i)/b)-(a*(i/b));
				max = Math.max(max,floor);

				if (count>Math.sqrt(n)/2) {
					break;
				}

		}
		System.out.println(max);



	}
}
