
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String N = sc.nextLine();
		String n[] = N.split("");
		if (n[0].equals(n[1]) && n[0].equals(n[2]) || n[1].equals(n[2]) && n[1].equals(n[3])) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}