
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String l = sc.next();
		
		long ans = 1;
		for (int i=0;i<l.length();i++) {
			if (l.charAt(i)=='1') {
				ans = (ans*3)%1_000_000_007;
			}
		}
		System.out.println(ans);
	}
}


