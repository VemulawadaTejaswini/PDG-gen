import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String c1 = sc.next();
		String c2 = sc.next();
		if (c1.charAt(0) == c2.charAt(c2.length() - 1) && c2.charAt(0) == c1.charAt(c1.length() - 1))
			System.out.println("YES");
		else
			System.out.println("NO");
		sc.close();
	}
}