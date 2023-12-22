import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String N = sc.next();
		sc.close();
		int num = Integer.parseInt(N.substring(N.length() - 1));
		if (num == 2 || num == 4 || num == 5 || num == 7 || num == 9) {
			System.out.println("hon");
		} else if (num == 3) {
			System.out.println("bon");
		} else {
			System.out.println("pon");
		}
	}
}
