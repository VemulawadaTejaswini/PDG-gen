import java.util.Scanner;

/**
 * @author yadavd5
 *
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long  a = sc.nextLong();
		long  b = sc.nextLong();
		long c = sc.nextLong();
		long d = sc.nextLong();
		long first= a*c;
		long  second = a*d;
		long third = b*c;
		long fourth = b*d;
		long firstmax = Math.max(first, second);
		long secondman = Math.max(third, fourth);
		System.out.println(Math.max(firstmax, secondman));
	}

}