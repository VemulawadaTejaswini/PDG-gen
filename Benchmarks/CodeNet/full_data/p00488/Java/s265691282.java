
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;

	void run() {
		Scanner sc = new Scanner(System.in);
		int a = INF;
		for(int i=0;i<3;i++) a = min(sc.nextInt(), a);
		int b = INF;
		for(int i=0;i<2;i++) b = min(sc.nextInt(), b);
		System.out.println(a+b-50);
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
}