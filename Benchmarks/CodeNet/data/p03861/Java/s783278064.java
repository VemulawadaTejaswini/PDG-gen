import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long x = sc.nextLong();
		sc.close();
		
		long ans = 0;
		for(long n = a-x;n <= b;++n)
			if(n % x == 0) {
				ans = (b-n)/x + 1;
				break;
			}
		System.out.println(ans);
	}
}
