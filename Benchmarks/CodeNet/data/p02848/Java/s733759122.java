
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		String ans = "";
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			c += n;
			if(c > 'Z')
				c -= 26;
			ans = ans + c;
		}
		System.out.println(ans);
	}

}
