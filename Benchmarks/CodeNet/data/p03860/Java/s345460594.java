import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		String atCoder = scan.next();
		String s = scan.next();
		String contest = scan.next();
		System.out.println(atCoder.charAt(0) + "" + s.charAt(0) + "" + contest.charAt(0));
	}

}
