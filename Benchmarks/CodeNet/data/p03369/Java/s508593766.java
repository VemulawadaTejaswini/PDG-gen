import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String s = sc.next().replaceAll("x", "");

		System.out.println(700 + 100 * s.length());
	}
}
