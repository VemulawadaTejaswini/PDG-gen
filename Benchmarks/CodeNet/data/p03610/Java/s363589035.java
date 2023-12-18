
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int N = s.length();
		String ans = "";
		for(int i = 0 ; i < N ; i++) {
			if(i % 2 == 0) {
				ans += s.charAt(i);
			}
		}
		System.out.println(ans);
	}
}