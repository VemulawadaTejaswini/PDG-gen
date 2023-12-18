import java.util.*;

public class Main {
	public static void main(String[] args) {
		// practice contest

		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();

		String[] d = { "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT" };
		int i;

		for (i = 0; i < d.length; i++) {
			if (s == d[i]) {
				System.out.println(7 - i);
			}
		}
	}
}