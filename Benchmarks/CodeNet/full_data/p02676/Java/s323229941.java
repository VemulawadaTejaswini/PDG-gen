import java.util.Scanner;

public class Main {
		public static void main (String args[]) throws Exception{
		Scanner scan = new Scanner(System.in);
		int  k = scan.nextInt();
		String  s = scan.next();
		String ans = null;

		if(s.length() <= k) {
			ans = s;
		} else {
			ans = s.substring(0,k) + "...";
		}
		System.out.println(ans);
	}
}