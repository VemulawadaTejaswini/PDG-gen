import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String x = scanner.next();
		int a = x.length();
		for (int i = 0; i < 1000; i++) {
			x = x.replaceAll("ST", "");
			if(a == x.length())break;
		}
		System.out.println(x.length());
	}
}