
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		scan.close();
		char[] c=s.toCharArray();
		c[3]='8';
		System.out.println(c);

	}
}
