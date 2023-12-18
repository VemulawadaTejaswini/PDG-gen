
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		int diff = a.length() - b.length();
		String zero = "0";
		for (int i = 1; i < Math.abs(diff); i++) {
			zero.concat("0");
		}
		if (diff < 0) {
			a = zero.concat(a);
			//System.out.print(a);
		}else if(diff > 0) {
			b = zero.concat(b);
			//System.out.print(b);
		}
		if (a.compareTo(b) < 0) {
			System.out.print("LESS");
		} else if (a.compareTo(b) > 0) {
			System.out.print("GREATER");
		} else {
			System.out.print("EQUAL");
		}
	}
}
