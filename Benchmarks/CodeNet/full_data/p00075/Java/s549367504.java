import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			String[] s = in.nextLine().split(",");
			String num = s[0];
			double w = Double.parseDouble(s[1]);
			double h = Double.parseDouble(s[1]);
			if (25 <= w / (h * h)) {
				System.out.println(num);
			}
		}
	}
}