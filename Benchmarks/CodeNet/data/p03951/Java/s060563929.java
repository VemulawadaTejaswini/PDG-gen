import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s1 = sc.next();
		String s2 = sc.next();
		int ans = 2*n;
		for(int i = n-1; i >= 0; i--) {
			if(s2.startsWith(s1.substring(i))) {
				ans -= (n-i);
			}
		}
		System.out.println(ans);
	}
}