import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		long k = sc.nextLong();
		char ans = 0;

		if(k == 1) {
			ans = s.charAt(0);
		}else {
			if(s.charAt(0) == 1) {
				ans = s.charAt(1);
			}else {
				ans = s.charAt(0);
			}
		}
		System.out.println(ans);
	}

}