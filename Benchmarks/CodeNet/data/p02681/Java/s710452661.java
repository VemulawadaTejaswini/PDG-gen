import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		String t = sc.next();

		String newStr = s + t.charAt(t.length() -1);
		if (t.equals(newStr))
			System.out.println("Yes");
		else
			System.out.println("No");

	}
}
