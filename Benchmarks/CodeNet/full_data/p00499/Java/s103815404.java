import java.util.*;
import static java.lang.System.*;

public class Main {

	Scanner sc = new Scanner(in);
	
	void run() {
		int l = sc.nextInt(), a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), d = sc.nextInt();
		if (a/c < b/d) {
			if (b % d == 0)
				out.printf("%d\n", l-b/d);
			else
				out.printf("%d\n", l-b/d-1);
		} else if (b/d < a/c) {
			if (a % c == 0)
				out.printf("%d\n", l-a/c);
			else
				out.printf("%d\n", l-a/c-1);
		} else {
			if (a % c == 0 && b % d == 0)
				out.printf("%d\n", l-a/c);
			else
				out.printf("%d\n", l-a/c-1);
		}
		
	}
	
	public static void main(String[] args) {
		new Main().run();
	}

}