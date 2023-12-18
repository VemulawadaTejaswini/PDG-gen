import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		while (s.contains("B")) {
			int index = s.indexOf("B");
			s = (index > 0 ? s.substring(0, index - 1) : "") + s.substring(index + 1);

			System.out.println(s);
		}
	}

}
