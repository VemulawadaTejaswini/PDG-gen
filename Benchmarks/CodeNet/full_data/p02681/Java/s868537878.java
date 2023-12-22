import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		var s = sc.next();
		var t = sc.next();
		sc.close();

		System.out.println(s.equals(t.substring(0, t.length() - 1)) ? "Yes" : "No");
	}
}