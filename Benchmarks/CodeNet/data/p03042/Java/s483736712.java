import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String S = scanner.next();
		String t = S.substring(0, 2);
		String k = S.substring(2);
		int a = Integer.parseInt(t);
		int b = Integer.parseInt(k);
		String s;
		if ((1 <= a && a <= 12) && (1 <= b && b <= 12)) {
			s = "AMBIGUOUS";
		} else if ((1 <= a && a <= 12) && (13 <= b || b == 0)) {
			s = "MMYY";
		} else if ((a >= 13 || a == 0) && (1 <= b && b <= 12)) {
			s = "YYMM";
		} else {
			s = "NA";
		}
		System.out.println(s);
	}
}