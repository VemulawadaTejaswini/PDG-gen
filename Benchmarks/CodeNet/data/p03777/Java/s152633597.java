import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		
		if ( a.equals("H") && a.equals("H") ) System.out.println("H");
		else if ( a.equals("H") && a.equals("D") ) System.out.println("H");
		else if ( a.equals("D") && a.equals("H") ) System.out.println("D");
		else if ( a.equals("D") && a.equals("D") ) System.out.println("H");
	}
}
