
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;
	int N = 2 * 123456;
	boolean p[];
	
	void run() {
		Scanner sc = new Scanner(System.in);
		p = new boolean[2*N+1];
		prime();
		for(;;) {
			int n = sc.nextInt();
			if(n==0) break;
			int cnt = 0;
			for(int i=n+1;i<=2*n;i++) {
				if( !p[i]) cnt++;
			}
			System.out.println(cnt);
		}
	}
	
	void prime() {
		p[0] = p[1] = true;
		for(int i=2;i<=N;i++) {
			if( !p[i] ) for(int j=2*i;j<=N;j+=i) {
				p[j] = true;
			}
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
}