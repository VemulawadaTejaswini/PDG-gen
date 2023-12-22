import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] a) {
		String input = scan.nextLine();
		List<String> list = new ArrayList<String>();
		while (!input.equals("")) {
			String[] str = input.split(" ");
			int x = Integer.parseInt(str[0]);
			int y = Integer.parseInt(str[1]);
			list.add(String.valueOf(x + y));
			input = scan.nextLine();
		}
		for (String val : list) {
			print(val.length());
		}
	}
	
	public static void print(Object out) {
		System.out.println(out);
	}
}