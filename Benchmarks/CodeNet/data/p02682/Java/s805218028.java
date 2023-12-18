import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
		long k = sc.nextLong();
		long ans = 0;
		if(k>a) {
			ans +=a;
			if(k-a>b) {
				ans-=k-a-b;
			}
			else {

			}
		}
		else {
			ans+=k;
		}
		System.out.println(ans);
	}
}