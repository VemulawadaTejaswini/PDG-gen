import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long a = scan.nextLong();
		long b = scan.nextLong();
		long c = scan.nextLong();
		long d = scan.nextLong();
		long ans = 0;
		
		ans = Math.max(a*c, a*d);
		ans = Math.max(ans, b*c);
		ans = Math.max(ans, b*d);
		
		System.out.println(ans);

	}

}
