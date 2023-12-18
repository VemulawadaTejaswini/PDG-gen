import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		String t = scan.next();
		StringBuffer ans = new StringBuffer();
		
		ans.append(t).append(s);
		
		System.out.println(ans.toString());
		scan.close();
	}
}