
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;

	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			int n= sc.nextInt();
			if( n == 0) break;
			int a = 0, b = 0;
			for(int i=0;i<n;i++) {
				int a_ = sc.nextInt();
				int b_ = sc.nextInt();
				if( a_ > b_ ) a += a_+ b_;
				if( a_ < b_ ) b += a_+ b_;
				if( a_ == b_ ) {a += a_; b += b_; }
			}
			System.out.println(a + " " + b);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
}