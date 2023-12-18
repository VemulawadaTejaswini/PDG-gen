import java.util.*;
import static java.lang.System.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int p = sc.nextInt();
		int q = sc.nextInt();
		int r = sc.nextInt();
		int a = Math.min(p, q);
		int b = Math.min(Math.max(p, q), r);
		out.println(a + b);

	}
}