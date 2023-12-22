import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);	
		String text;
		text = scan.next();
		char[] s = text.toCharArray();
		text = scan.next();
		char[] p = text.toCharArray();
		func(s , p ,0);

	}

	static void func(char[] s , char[] p , int n ) {
		for(int i = 0 ; i < s.length ; i++) {
			if(n == s.length) {
				System.out.println("No");
				break;
			}else if(s[i+n >= s.length ? i+n-s.length : i+n] != p[i]) {
				n++;
				func(s , p , n );
				break;
			}else if(i == p.length - 1) {
				System.out.println("Yes");
				break;
			}
		}
	}
}