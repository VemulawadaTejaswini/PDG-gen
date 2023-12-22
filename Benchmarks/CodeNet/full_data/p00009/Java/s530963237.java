
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;
	boolean[] prime;
	
	void run() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cnt = 0;
		boolean prime[] = new boolean[n+1];
		for(int i=2;i<=n;i++) {
			if( !prime[i] ) {
				cnt++;
				for(int j=i*2;j<=n;j+=i) prime[j] = true;
			}
		}
		System.out.println(cnt);
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
}