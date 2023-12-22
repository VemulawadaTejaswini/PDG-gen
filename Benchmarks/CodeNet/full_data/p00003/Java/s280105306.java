import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> ret = new ArrayList<String>();
		int i, max = sc.nextInt();
		for (i = 0; i < max; i++) {
			double a = Math.pow(sc.nextInt(), 2);
			double b = Math.pow(sc.nextInt(), 2);
			double c = Math.pow(sc.nextInt(), 2);
			if (a + b == c || b + c == a || a + c == b) {
				ret.add("YES");
			} else {
				ret.add("NO");
			}
		}
		for (String text : ret) {
			System.out.println(text);
		}
	}
}