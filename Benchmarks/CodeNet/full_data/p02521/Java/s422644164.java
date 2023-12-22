import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		for (int r, c; (r = s.nextInt()) + (c = s.nextInt()) > 0;) {
			System.out.println(r % 2 > 0 && c % 2 > 0 ? "no" : "yes");
		}
	}
}