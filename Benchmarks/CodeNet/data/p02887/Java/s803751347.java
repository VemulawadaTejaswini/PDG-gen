
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		char color = s.charAt(0);
		int ans = 1;
		for(int i = 0; i < s.length(); i++) {
			if(color != s.charAt(i)) {
				ans++;
				color = s.charAt(i);
			}
		}
		System.out.println(ans);
	}

}
