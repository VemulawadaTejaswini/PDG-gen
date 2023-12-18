import java.util.Scanner;

/**
 * @author Rimi
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String n = sc.next();

		String a  = n.substring(0 , 1);
		String b  = n.substring(1 , 2);
		String c  = n.substring(2 , 3);

		if(a.equals("1")) {
			a = "9";
		}else {
			a = "1";
		}
		if(b.equals("1")) {
			b = "9";
		}else {
			b = "1";
		}
		if(c.equals("1")) {
			c = "9";
		}else {
			c = "1";
		}

		System.out.print(a);
		System.out.print(b);
		System.out.print(c);

	}

}