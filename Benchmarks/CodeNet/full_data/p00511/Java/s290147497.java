import java.util.*;
import static java.lang.System.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int ans = sc.nextInt();
		String s;
		while (sc.hasNext()) {
			s = sc.next();
			if (s.equals("+")) {
				ans += sc.nextInt();
			}
			else if (s.equals("-")) {
				ans -= sc.nextInt();
			}
			else if (s.equals("*")) {
				ans *= sc.nextInt();
			}
			else if (s.equals("/")) {
				ans /= sc.nextInt();
			}
			else {
				out.println(ans);
				break;
			}
		}
	}
}
