import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		if (n.charAt(0) == n.charAt(n.length() - 1))
			System.out.println("Yes");
		else
			System.out.println("No");
		sc.close();
	}
}