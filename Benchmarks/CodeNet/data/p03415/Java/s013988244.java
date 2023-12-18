import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = "";

		for (int i = 0; i < 3; i++) {
			String c = scanner.next();
			str += c.substring(i,i+1);
		}
		System.out.println(str);
	}

}