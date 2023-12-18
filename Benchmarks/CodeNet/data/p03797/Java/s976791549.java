import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long m = sc.nextLong();
		long ans = 0;
		while(m >= 4) {
			ans++;
			if(n >= 1 && m >= 2) {
				n--;
				m -= 2;
			} else {
				m -= 4;
			}
		}
		System.out.println(ans);
	}
}
