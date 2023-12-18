import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		String a = stdIn.next();
		String b = stdIn.next();
		String c = stdIn.next();
		
		System.out.print(a.charAt(0));
		System.out.print(b.charAt(1));
		System.out.print(c.charAt(2));
	}
}