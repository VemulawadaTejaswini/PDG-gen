import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s1 = scan.next().charAt(0) + "";
		String s2 = scan.next().charAt(0) + "";
		String s3 = scan.next().charAt(0) + "";
		String s = s1 + s2 + s3;
		s = s.toUpperCase();
		System.out.println(s);
	}
}