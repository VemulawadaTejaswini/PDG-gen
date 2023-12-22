import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		final String t = "qwertyuioplkjhgfdsazxcvbnm";

		System.out.println(t.contains(s) ? "a" : "A");
	}
}

