import java.util.*;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt();
		int b = scan.nextInt();
		String c = scan.next();
		String ans;
		ans = c.substring(0,b)+c.substring(b,b+1).toLowerCase()+c.substring(b+1);
		System.out.println(ans);
	}
}