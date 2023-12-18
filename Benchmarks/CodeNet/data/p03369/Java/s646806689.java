import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		String s = sc.next();
		long ans = 700;
		for(char c : s.toCharArray()) {
			if(c=='o') {
				ans+=100;
			}
		}
		System.out.println(ans);
	}
}