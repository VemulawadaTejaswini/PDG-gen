
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in);){
		int a = sc.nextInt();
		int b = sc.nextInt();
		String s = sc.next();
		String ans = "No";

		for(int i = 0; (a+b+1) < i; i++) {
			if(s.length() ==a+b+1) {
				if(s.charAt(a+1) == '-') {
					ans = "Yes";
				}
			}
		}
		System.out.println(ans);
		}

	}
}
