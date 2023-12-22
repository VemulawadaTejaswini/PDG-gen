
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;

	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			int k = sc.nextInt();
			if(k==0) break;
			int n = k*(k-1)/2;
			int sum = 0;
			for(int i=0;i<n;i++) sum += sc.nextInt();
			System.out.println((k==2? sum:sum/2));
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
}