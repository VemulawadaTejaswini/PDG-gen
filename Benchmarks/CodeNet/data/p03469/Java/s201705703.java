import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String ans = "2018"+s.substring(4);
		System.out.println(ans);
	}
}
