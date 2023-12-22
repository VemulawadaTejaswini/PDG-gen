import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static List<Integer> list = new ArrayList<Integer>();
	public static void main(String[] a) throws IOException {
		try {
		for (int i = 0; i < 200; ++i) {
			Integer num1 = 0, num2 = 0;
			String str = sc.nextLine();
			if (str.equals("")) {
				System.exit(0);
			}
			num1 = Integer.parseInt(str.split("\\s")[0]);
			num2 = Integer.parseInt(str.split("\\s")[1]);
			if (num1 < 0 || 10000 < num1 || num2 < 0 || 10000 < num2) {
				System.exit(1);
			}
			System.out.println(String.valueOf(num1 + num2).length());
		}
		} catch (Exception e) {
			System.exit(0);
		}
	}
}