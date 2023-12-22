import java.util.Scanner;

public class Main {
	void run() {
		Scanner scan = new Scanner(System.in);
		while (true) {
			String str = scan.next();
			if (str.equals("0")) break;
			char[] cnum = str.toCharArray();
			int sum = 0;
			for (char c : cnum) {
				sum += Character.getNumericValue(c);
			}
			System.out.println(sum);
		}
	}
	public static void main(String[] args) {
		new Main().run();
	}
}