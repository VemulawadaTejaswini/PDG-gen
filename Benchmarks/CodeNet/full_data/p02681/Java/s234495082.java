
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		String b = sc.nextLine();

		if(b.contains(a) && b.length() > a.length())
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}
