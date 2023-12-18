import java.util.*;

public class Main {
	public static void main(String... args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while (sc.hasNext()) {
			if (sc.next().equals("Y")) {
				System.out.println("Four");
				System.exit(0);
			}
		}
		System.out.println("Three");
	}
}
