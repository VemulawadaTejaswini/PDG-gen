import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int a = Integer.parseInt(S.substring(0, 2));
		int b = Integer.parseInt(S.substring(2, 4));
		if(1 <= a && a <= 12 && 1 <= b && b <= 12) {
			System.out.println("AMBIGUOUS");
		} else if(1 <= a && a <= 12) {
			System.out.println("MMYY");
		} else if(1 <= b && b <= 12) {
			System.out.println("YYMM");
		} else {
			System.out.println("NA");
		}
	}
}
