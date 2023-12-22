
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;

	void run() {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String ans = "";
		for(int i=0;i<str.length();i++) {
			ans += (char) ( 'A' + (str.charAt(i) + 23 - 'A') % 26 );
		}
		System.out.println(ans);
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
}