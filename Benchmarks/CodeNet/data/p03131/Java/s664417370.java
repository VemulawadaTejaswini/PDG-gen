import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long k = sc.nextInt();
		long a = sc.nextInt();
		long b = sc.nextInt();
		long ans = 0;
		if(a >= b-2) {
			ans = 1 + k;
		} else {
			if(k-2 >= a) {
				ans = a + (b-a)*((k-a+1)/2);
				ans += (k-a+1)%2;
			} else {
				ans = 1 + k;
			}
		}
		System.out.println(ans);
	}
}