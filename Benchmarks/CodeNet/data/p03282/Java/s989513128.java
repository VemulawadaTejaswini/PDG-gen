import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		long k = sc.nextLong();
		char ans = s.charAt(0);

		if(k != 1) {
			for(int i = 0; i < s.length(); i++) {
				if(s.charAt(i) != '1') {
					ans = s.charAt(i);
					break;
				}
			}
		}
		System.out.println(ans);
	}
}