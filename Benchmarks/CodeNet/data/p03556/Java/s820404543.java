import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long ans = 0;
		for(long i = n;; i--) {
			double a = Math.sqrt(i);
			if(a == Math.ceil(a)) {
				ans = i;
				break;
			}
		}
		System.out.println(ans);
	}
}