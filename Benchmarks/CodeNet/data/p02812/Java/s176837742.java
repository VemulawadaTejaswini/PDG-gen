import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();

		int pre = s.length();
		s = s.replace("ABC", "");
		int post = s.length();

		System.out.println((pre - post) / 3);

		sc.close();
	}

}
