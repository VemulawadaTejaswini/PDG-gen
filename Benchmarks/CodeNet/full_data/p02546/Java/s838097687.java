import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		var s = sc.next();
		sc.close();

		if (s.endsWith("s")) {
			s += "es";
		} else {
			s += "s";
		}
		System.out.println(s);
	}
}
