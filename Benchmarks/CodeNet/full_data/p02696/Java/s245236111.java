import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long n = sc.nextLong();
		long ans = 0;
		long max = 0;
		for(long x = 0; x < n; x++) {
			ans = ( a * x / b ) - ( x / b );
			//System.out.println(x + "," + ans);
			if(ans > max)
				max = ans;
		}
		System.out.println(max);
	}
}
