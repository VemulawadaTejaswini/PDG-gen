import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next();
		String S = sc.next();

		if (S.matches("^[\\d]{"+A+"}-[\\d]{"+B+"}$")) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}