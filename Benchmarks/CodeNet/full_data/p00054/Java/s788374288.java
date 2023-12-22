
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;
	void run() {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int n = sc.nextInt();
			a = a%b;
			int ans = 0;
			for(int i=0;i<n;i++) {
				a *= 10;
				ans += a/b;
				a = a%b;
			}
			System.out.println(ans);
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}