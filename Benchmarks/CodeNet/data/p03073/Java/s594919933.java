import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();
		int ans = 0;
		int a = 0;
		for(int i = 0; i < s.length(); ++i) {
			if(i % 2 == 0) {
				if('0' != s.charAt(i))++a;
			}
			else {
				if('1' != s.charAt(i))++a;
			}
		}
		ans = a;
		a = 0;
		for(int i = 0; i < s.length(); ++i) {
			if(i % 2 == 0) {
				if('1' != s.charAt(i))++a;
			}
			else {
				if('0' != s.charAt(i))++a;
			}
			
		}
		ans = Math.min(ans,  a);
		System.out.println(ans);
	}

}
