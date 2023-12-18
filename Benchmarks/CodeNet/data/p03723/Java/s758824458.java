import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
		long count = 0;

		if(a==b&&b==c) {
			System.out.println(-1);
			return;
		}

		while(true) {
			if(a%2	==1||b%2==1||c	%2==1) {
				break;
			}
			long a_temp = a/2;
			long b_temp = b/2;
			long c_temp = c/2;
			a = b_temp+c_temp;
			b = a_temp+c_temp;
			c = a_temp+b_temp;
			count++;
			
		}
		System.out.println(count);
	}
}
