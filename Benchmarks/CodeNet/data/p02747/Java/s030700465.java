import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();

		if (s.indexOf("hi") >= 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
